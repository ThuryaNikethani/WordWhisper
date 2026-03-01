package com.example.wordwhisper;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textWord;
    private TextView textPronunciation;
    private TextView textPartOfSpeech;
    private TextView textDefinition;
    private TextView textExample;
    private TextView textOrigin;
    private TextView textWordCount;
    private TextView textStreak;
    private Button buttonReveal;
    private Button buttonNext;
    private Button buttonBookmark;
    private LinearLayout layoutDetails;

    private List<Word> allWords;
    private Word currentWord;
    private int currentIndex = 0;
    private boolean isRevealed = false;

    private SharedPreferences prefs;

    private static final String PREF_NAME = "WordWhisperPrefs";
    private static final String KEY_LAST_DATE = "lastDate";
    private static final String KEY_STREAK = "streak";
    private static final String KEY_WORDS_TODAY = "wordsToday";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textWord = findViewById(R.id.textWord);
        textPronunciation = findViewById(R.id.textPronunciation);
        textPartOfSpeech = findViewById(R.id.textPartOfSpeech);
        textDefinition = findViewById(R.id.textDefinition);
        textExample = findViewById(R.id.textExample);
        textOrigin = findViewById(R.id.textOrigin);
        textWordCount = findViewById(R.id.textWordCount);
        textStreak = findViewById(R.id.textStreak);
        buttonReveal = findViewById(R.id.buttonReveal);
        buttonNext = findViewById(R.id.buttonNext);
        buttonBookmark = findViewById(R.id.buttonBookmark);
        layoutDetails = findViewById(R.id.layoutDetails);

        allWords = WordList.getAllWords();
        prefs = getSharedPreferences(PREF_NAME, MODE_PRIVATE);

        checkAndUpdateStreak();
        showWordOfTheDay();

        buttonReveal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                revealCard();
            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNextWord();
            }
        });

        buttonBookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bookmarkWord();
            }
        });
    }

    private void showWordOfTheDay() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        String todayString = dateFormat.format(new Date());
        int dayNumber = Integer.parseInt(todayString);
        currentIndex = dayNumber % allWords.size();
        currentWord = allWords.get(currentIndex);
        displayWord();
        updateStats();
    }

    private void displayWord() {
        isRevealed = false;
        textWord.setText(currentWord.getWord());
        textPronunciation.setText("/" + currentWord.getPronunciation() + "/");
        textPartOfSpeech.setText(currentWord.getPartOfSpeech());
        layoutDetails.setVisibility(View.GONE);
        buttonReveal.setVisibility(View.VISIBLE);
        buttonNext.setVisibility(View.GONE);
        boolean saved = prefs.getBoolean("bookmark_" + currentWord.getWord(), false);
        buttonBookmark.setText(saved ? "\u2605 Saved" : "\u2606 Save");
    }

    private void revealCard() {
        isRevealed = true;
        textDefinition.setText(currentWord.getDefinition());
        textExample.setText("\"" + currentWord.getExampleSentence() + "\"");
        textOrigin.setText("Origin: " + currentWord.getOrigin());
        layoutDetails.setVisibility(View.VISIBLE);
        buttonReveal.setVisibility(View.GONE);
        buttonNext.setVisibility(View.VISIBLE);
        int wordsToday = prefs.getInt(KEY_WORDS_TODAY, 0);
        prefs.edit().putInt(KEY_WORDS_TODAY, wordsToday + 1).apply();
        updateStats();
    }

    private void showNextWord() {
        Random random = new Random();
        int newIndex;
        do {
            newIndex = random.nextInt(allWords.size());
        } while (newIndex == currentIndex);
        currentIndex = newIndex;
        currentWord = allWords.get(currentIndex);
        displayWord();
    }

    private void bookmarkWord() {
        String key = "bookmark_" + currentWord.getWord();
        boolean alreadySaved = prefs.getBoolean(key, false);
        if (alreadySaved) {
            prefs.edit().putBoolean(key, false).apply();
            buttonBookmark.setText("\u2606 Save");
            Toast.makeText(this, "Removed from saved words", Toast.LENGTH_SHORT).show();
        } else {
            prefs.edit().putBoolean(key, true).apply();
            buttonBookmark.setText("\u2605 Saved");
            Toast.makeText(this, "Word saved!", Toast.LENGTH_SHORT).show();
        }
    }

    private void checkAndUpdateStreak() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String today = dateFormat.format(new Date());
        String lastDate = prefs.getString(KEY_LAST_DATE, "");
        int streak = prefs.getInt(KEY_STREAK, 0);
        if (!today.equals(lastDate)) {
            streak = streak + 1;
            prefs.edit()
                    .putString(KEY_LAST_DATE, today)
                    .putInt(KEY_STREAK, streak)
                    .putInt(KEY_WORDS_TODAY, 0)
                    .apply();
        }
    }

    private void updateStats() {
        int wordsToday = prefs.getInt(KEY_WORDS_TODAY, 0);
        int streak = prefs.getInt(KEY_STREAK, 0);
        textWordCount.setText("Words today: " + wordsToday);
        textStreak.setText("\uD83D\uDD25 " + streak + " day streak");
    }
}

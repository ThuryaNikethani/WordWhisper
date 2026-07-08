# 📖 Forgotten Words — Flashcard App

An simple Android app that teaches you one obscure or unusual English word every day, shown as a beautiful flashcard with pronunciation, definition, and an example sentence.

---

## Features

- **Word of the Day** — A new word every day, chosen consistently so everyone gets the same word
- **Flashcard Reveal** — See the word first, then tap to reveal the full definition
- **Day Streak Tracker** — Tracks how many consecutive days you've opened the app
- **Words Today Counter** — Shows how many words you've revealed in one session
- **Save Words** — Bookmark any word you want to remember
- **Explore More** — Tap "Next Word" to browse through all 40+ words

---

## Project Structure

```
ForgottenWords/
├── app/src/main/
│   ├── java/com/example/forgottenwords/
│   │   ├── MainActivity.java     ← Main screen logic
│   │   ├── Word.java             ← Data model for one word
│   │   └── WordList.java         ← All 40+ flashcard words
│   ├── res/
│   │   ├── layout/
│   │   │   └── activity_main.xml ← Screen layout
│   │   ├── drawable/
│   │   │   ├── card_background.xml
│   │   │   └── badge_background.xml
│   │   └── values/
│   │       ├── colors.xml
│   │       ├── strings.xml
│   │       └── themes.xml
│   └── AndroidManifest.xml
├── app/build.gradle
├── build.gradle
├── settings.gradle
└── gradle.properties
```

---

## Technologies Used

- **Java** — All logic written in plain Java 
- **Android SDK** — Native Android UI components
- **SharedPreferences** — Saves streak, bookmarks, and word count locally
- **Material Components** — For styled buttons and UI elements

---

## Word List (40+ words)

Petrichor, Sonder, Hiraeth, Vellichor, Ephemeral, Syzygy, Limerence, Sempiternal,
Noctilucent, Apricity, Psithurism, Phosphene, Kenopsia, Oblivion, Mellifluous,
Tenebrism, Lucubrate, Quiddity, Susurrus, Crepuscular, Pandiculation, Eldritch,
Fulgent, Soporific, Palimpsest, Vespertine, Lambent, Numinous, Lacuna,
Diaphanous, Ululation, Stygian, Halcyon, Fugacious, Lethologica, Sylvan,
Coruscate, Serendipity, Zeitgeist, Ineffable, and more!

---
## Authors
[Thurya Nikethani(Thinu)](https://github.com/ThuryaNikethani)

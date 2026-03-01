package com.example.wordwhisper;

// This class holds all the information for one flashcard word
public class Word {

    private String word;          // The unusual English word
    private String pronunciation; // How to say it (phonetic)
    private String partOfSpeech;  // noun, verb, adjective, etc.
    private String definition;    // What it means
    private String exampleSentence; // A sentence using the word
    private String origin;        // Where the word comes from

    // Constructor - called when we create a new Word object
    public Word(String word, String pronunciation, String partOfSpeech,
                String definition, String exampleSentence, String origin) {
        this.word = word;
        this.pronunciation = pronunciation;
        this.partOfSpeech = partOfSpeech;
        this.definition = definition;
        this.exampleSentence = exampleSentence;
        this.origin = origin;
    }

    // Getters - used to read each piece of data
    public String getWord() { return word; }
    public String getPronunciation() { return pronunciation; }
    public String getPartOfSpeech() { return partOfSpeech; }
    public String getDefinition() { return definition; }
    public String getExampleSentence() { return exampleSentence; }
    public String getOrigin() { return origin; }
}

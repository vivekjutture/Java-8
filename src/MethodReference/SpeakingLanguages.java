package MethodReference;

public class SpeakingLanguages {
    String speakingLanguage;

    SpeakingLanguages(String speakingLanguage) {
        this.speakingLanguage = speakingLanguage;
    }

    @Override
    public String toString() {
        return speakingLanguage;
    }
}

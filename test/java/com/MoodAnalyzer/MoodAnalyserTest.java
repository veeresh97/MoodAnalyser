package com.MoodAnalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_whenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("this is a Sad Message");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_whenNotSad_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("this is a Happy Message");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenNullMoodShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY",mood);
    }
}

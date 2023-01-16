package com.serkanemek.barryiqgame.data;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPForAdvAndTotalQuestionCounter {

    SharedPreferences sharedPreferencesForIqGameTotalQuestion;
    SharedPreferences sharedPreferencesForIqGameCorrectAnswers;

    SharedPreferences sharedPreferencesForCheckMusicForOnOff;
    SharedPreferences sharedPreferencesForCheckSoundForOnOff;
    SharedPreferences sharedPreferencesForCheckVibrationOnOff;


    public void updateIqGameTotalQuestionData(Context context, Integer counterNumber){
        try {
            Integer storedIqGameTotalQuestion = -1;
            sharedPreferencesForIqGameTotalQuestion = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            storedIqGameTotalQuestion = sharedPreferencesForIqGameTotalQuestion.getInt("storedIqGameTotalQuestionData",0);
            storedIqGameTotalQuestion = storedIqGameTotalQuestion + counterNumber;
            sharedPreferencesForIqGameTotalQuestion.edit().putInt("storedIqGameTotalQuestionData" , storedIqGameTotalQuestion).apply();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Integer getIqGameTotalQuestionData(Context context){
        Integer storedIqGameTotalQuestion = -1;
        try {
            sharedPreferencesForIqGameTotalQuestion = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            storedIqGameTotalQuestion = sharedPreferencesForIqGameTotalQuestion.getInt("storedIqGameTotalQuestionData",0);
            return storedIqGameTotalQuestion;
        }catch (Exception e){
            e.printStackTrace();
        }
        return storedIqGameTotalQuestion;

    }

    public void updateIqGameCorrectAnswersData(Context context, Integer counterNumber){
        try {
            Integer storedIqGameCorrectAnswers = -1;
            sharedPreferencesForIqGameCorrectAnswers = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            storedIqGameCorrectAnswers = sharedPreferencesForIqGameCorrectAnswers.getInt("storedIqGameCorrectAnswersData",0);
            storedIqGameCorrectAnswers = storedIqGameCorrectAnswers + counterNumber;
            sharedPreferencesForIqGameCorrectAnswers.edit().putInt("storedIqGameCorrectAnswersData" , storedIqGameCorrectAnswers).apply();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Integer getIqGameCorrectAnswersData(Context context){
        Integer storedIqGameCorrectAnswers = -1;
        try {
            sharedPreferencesForIqGameCorrectAnswers = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            storedIqGameCorrectAnswers = sharedPreferencesForIqGameCorrectAnswers.getInt("storedIqGameCorrectAnswersData",0);
            return storedIqGameCorrectAnswers;
        }catch (Exception e){
            e.printStackTrace();
        }
        return storedIqGameCorrectAnswers;

    }

    public void updateCheckMusicForOnOff(Context context,Integer integer){  // false is off, true is on.
        try {
            sharedPreferencesForCheckMusicForOnOff = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            sharedPreferencesForCheckMusicForOnOff.edit().putInt("storedCheckMusicOnOffData",integer).apply();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Integer getCheckMusicForOnOff(Context context){
        Integer checkMusic = -1;
        try {
            sharedPreferencesForCheckMusicForOnOff = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            checkMusic = sharedPreferencesForCheckMusicForOnOff.getInt("storedCheckMusicOnOffData", 1);
            return checkMusic;
        }catch (Exception e){
            e.printStackTrace();
        }
        return checkMusic;
    }

    public void updateCheckSoundForOnOff(Context context,Integer integer){  // 0 is off, 1 is on.
        try {
            sharedPreferencesForCheckSoundForOnOff = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            sharedPreferencesForCheckSoundForOnOff.edit().putInt("storedCheckSoundOnOffData",integer).apply();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Integer getCheckSoundForOnOff(Context context){
        Integer checkSound = -1;
        try {
            sharedPreferencesForCheckSoundForOnOff = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            checkSound = sharedPreferencesForCheckSoundForOnOff.getInt("storedCheckSoundOnOffData", 1);
            return checkSound;
        }catch (Exception e){
            e.printStackTrace();
        }
        return checkSound;
    }

    public void updateCheckVibrationForOnOff(Context context,Integer integer){  // 0 is off, 1 is on.
        try {
            sharedPreferencesForCheckVibrationOnOff = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            sharedPreferencesForCheckVibrationOnOff.edit().putInt("storedCheckVibrationOnOffData",integer).apply();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Integer getCheckVibrationForOnOff(Context context){
        Integer checkVibrator = -1;
        try {
            sharedPreferencesForCheckVibrationOnOff = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            checkVibrator = sharedPreferencesForCheckVibrationOnOff.getInt("storedCheckVibrationOnOffData", 1);
            return checkVibrator;
        }catch (Exception e){
            e.printStackTrace();
        }
        return checkVibrator;
    }


}

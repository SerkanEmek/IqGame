package com.serkanemek.barryiqgame.util;

import static android.content.Context.VIBRATOR_SERVICE;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

import com.serkanemek.barryiqgame.data.SharedPForAdvAndTotalQuestionCounter;

public class Vibration {

    SharedPForAdvAndTotalQuestionCounter sharedPForAdvAndTotalQuestionCounter;

    public void getVibrator(int number, Context context){

        try {
            sharedPForAdvAndTotalQuestionCounter = new SharedPForAdvAndTotalQuestionCounter();
            Integer i = sharedPForAdvAndTotalQuestionCounter.getCheckVibrationForOnOff(context);
            if(i == 1){
                if (Build.VERSION.SDK_INT >= 26) {
                    ((Vibrator) context.getSystemService(VIBRATOR_SERVICE)).vibrate(VibrationEffect.createOneShot(number, VibrationEffect.DEFAULT_AMPLITUDE));
                } else {
                    ((Vibrator) context.getSystemService(VIBRATOR_SERVICE)).vibrate(number);
                }
            }

        }catch (Exception e){

        }
    }
}
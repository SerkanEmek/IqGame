package com.serkanemek.barryiqgame.mediaplayer;

import android.content.Context;
import android.media.MediaPlayer;
import com.serkanemek.barryiqgame.R;

public class MyMediaPlayerForBackground {

    static MediaPlayer mediaPlayer;


    Integer maxVolume = 50;
    Integer currVolume = 25;
    float log1=(float)(Math.log(maxVolume-currVolume)/Math.log(maxVolume));



    public void playBackgroundMusic(Context context, Integer gameNumber){

        try {

            if(mediaPlayer == null){
                if(gameNumber == 2){
                    mediaPlayer = MediaPlayer.create(context, R.raw.little_prankster);
                }
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        stopBackgroundMusic();
                    }
                });
            }
            mediaPlayer.setVolume(log1,log1);
            mediaPlayer.setLooping(true);
            mediaPlayer.start();

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public void pauseBackgroundMusic(){
        if(mediaPlayer != null){
            mediaPlayer.pause();
        }
    }

    public void stopBackgroundMusic(){
        if(mediaPlayer != null){
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

}

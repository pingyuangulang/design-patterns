package com.china.cn.design_patterns.adapter_design_pattern.test;

import com.china.cn.design_patterns.adapter_design_pattern.audio_player.AudioPlayer;

/**
 * @Description: TODO
 * @ClassName: Main
 * @Author: bin.ji
 * @Date: 2018-10-05 22:24
 * @Version: 1.0.0.0
 */

public class Main {

    public static void main(String[] args){
        String[] audioTypes = {"MP3","MP4","VLC"};
        String fileName = "xxx";
        for (String audioType : audioTypes) {
            AudioPlayer audioPlayer = new AudioPlayer(audioType);
            audioPlayer.play(audioType,fileName);
        }
    }
}

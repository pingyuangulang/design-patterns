package com.china.cn.design_patterns.adapter_design_pattern.player.impl;

import com.china.cn.design_patterns.adapter_design_pattern.player.MediaPlayer;

/**
 * @Description: TODO
 * @ClassName: Mp3Player
 * @Author: bin.ji
 * @Date: 2018-10-05 21:49
 * @Version: 1.0.0.0
 */

public class Mp3Player implements MediaPlayer {
    
    @Override
    public void playMp3(String fileName) {
        System.out.println("ClassName:{"+Mp3Player.class.toString()+"}mp3");
    }
}

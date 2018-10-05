package com.china.cn.design_patterns.adapter_design_pattern.player.impl;

import com.china.cn.design_patterns.adapter_design_pattern.player.AdvancedMediaPlayer;

/**
 * @Description: TODO
 * @ClassName: Mp4Player
 * @Author: bin.ji
 * @Date: 2018-10-05 21:47
 * @Version: 1.0.0.0
 */

public class Mp4Player implements AdvancedMediaPlayer {
    
    @Override
    public void playMp4(String fileName) {
        System.out.println("ClassName:{"+Mp4Player.class.toString()+"}mp4");
    }
    
    @Override
    public void playVlc(String fileName) {
    
    }
}

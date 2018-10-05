package com.china.cn.design_patterns.adapter_design_pattern.player.impl;

import com.china.cn.design_patterns.adapter_design_pattern.player.AdvancedMediaPlayer;

/**
 * @Description: TODO
 * @ClassName: VlcPlayer
 * @Author: bin.ji
 * @Date: 2018-10-05 21:44
 * @Version: 1.0.0.0
 */

public class VlcPlayer implements AdvancedMediaPlayer {
    
    @Override
    public void playVlc(String fileName) {
        System.out.println("ClassName:{"+VlcPlayer.class.toString()+"}vlc");
    }
    
    @Override
    public void playMp4(String fileName) {
    
    }
}

package com.china.cn.design_patterns.adapter_design_pattern.adapter;

import com.china.cn.design_patterns.adapter_design_pattern.player.AdvancedMediaPlayer;
import com.china.cn.design_patterns.adapter_design_pattern.player.impl.Mp4Player;
import com.china.cn.design_patterns.adapter_design_pattern.player.impl.VlcPlayer;

/**
 * @Description: 适配器
 * @ClassName: PlayerAdapter
 * @Author: bin.ji
 * @Date: 2018-10-05 21:56
 * @Version: 1.0.0.0
 */

public class PlayerAdapter {

    /**高级播放器*/
    private AdvancedMediaPlayer advancedMediaPlayer;
    
    /**
     * 适配器构造器
     * @param audioType
     */
    public PlayerAdapter(String audioType){
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }
    
    /**
     * 播放函数
     * @param audioType
     * @param fileName
     */
    public void play(String audioType, String fileName){
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}

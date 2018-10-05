package com.china.cn.design_patterns.adapter_design_pattern.audio_player;

import com.china.cn.design_patterns.adapter_design_pattern.adapter.PlayerAdapter;
import com.china.cn.design_patterns.adapter_design_pattern.player.MediaPlayer;
import com.china.cn.design_patterns.adapter_design_pattern.player.impl.Mp3Player;

/**
 * @Description: 对外提供的播放类
 * @ClassName: AudioPlayer
 * @Author: bin.ji
 * @Date: 2018-10-05 22:09
 * @Version: 1.0.0.0
 */

public class AudioPlayer {

    /**mp3播放器*/
    private MediaPlayer mp3Player;
    /**高级播放器适配器*/
    private PlayerAdapter playerAdapter;
    
    /**
     * 原始构造器
     */
    public AudioPlayer(){
        mp3Player = new Mp3Player();
    }
    /**
     * 扩展了高级播放器后的构造器
     * @param audioType
     */
    public AudioPlayer(String audioType){
        if (audioType.equalsIgnoreCase("mp3")){
            mp3Player = new Mp3Player();
        }else if (audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp4")){
            playerAdapter = new PlayerAdapter(audioType);
        }
    }
    
    /**
     * 原始播放函数
     * @param fileName
     */
    public void play(String fileName){
        mp3Player.playMp3(fileName);
    }
    
    /**
     * 扩展了高级播放器后的播放函数
     * @param audioType
     * @param fileName
     */
    public void play(String audioType, String fileName){
        if (audioType.equalsIgnoreCase("mp3")){
            play(fileName);
        }else if (audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp4")){
            playerAdapter.play(audioType,fileName);
        }
    }
}

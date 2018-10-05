package com.china.cn.design_patterns.adapter_design_pattern.player;

/**
 * @Description: 高级播放器接口
 * @ClassName: AdvancedMediaPlayer
 * @Author: bin.ji
 * @Date: 2018-10-05 21:41
 * @Version: 1.0.0.0
 */

public interface AdvancedMediaPlayer {
    
    /**
     * vlc播放函数
     * @param fileName
     */
    void playVlc(String fileName);
    
    /**
     * mp4播放函数
     * @param fileName
     */
    void playMp4(String fileName);
}

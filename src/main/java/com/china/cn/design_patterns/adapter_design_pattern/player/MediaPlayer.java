package com.china.cn.design_patterns.adapter_design_pattern.player;

/**
 * @Description: 播放器接口（仅支持mp3）
 * @ClassName: MediaPlayer
 * @Author: bin.ji
 * @Date: 2018-10-05 21:37
 * @Version: 1.0.0.0
 */

public interface MediaPlayer {
    
    /**
     * mp3播放函数
     * @param fileName
     */
    void playMp3(String fileName);
}

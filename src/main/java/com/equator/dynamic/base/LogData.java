package com.equator.dynamic.base;

import lombok.Data;

@Data
public class LogData {
    /**
     * 日志来源
     */
    private String source;
    /**
     * 日志生产时间
     */
    private Long logTime;
    /**
     * 日志内容
     */
    private String data;
}

package com.equator.dynamic.ordinary;

import com.equator.dynamic.base.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import redis.clients.jedis.Jedis;

import java.util.concurrent.ThreadPoolExecutor;

@Slf4j
public class TransformationA implements Runnable {
    private Jedis jedis;

    public TransformationA() {
        this.jedis = MessageQueue.getMQ().getClient();
    }

    @Override
    public void run() {
        log.info("转换A启动...");
        while (true) {
            String logDataFromTopic1Str = jedis.rpop("Topic1");
            if (StringUtils.isNotEmpty(logDataFromTopic1Str)) {
                LogData logDataFromTopic1 = GsonUtils.fromJson(logDataFromTopic1Str, LogData.class);
                if ((logDataFromTopic1.getLogTime() & 1) != 1) {
                    jedis.lpush("Topic4", logDataFromTopic1Str);
                }
            }
            String logDataFromTopic3Str = jedis.rpop("Topic3");
            if (StringUtils.isNotEmpty(logDataFromTopic3Str)) {
                LogData logDataFromTopic3 = GsonUtils.fromJson(logDataFromTopic3Str, LogData.class);
                if ((logDataFromTopic3.getLogTime() & 1) != 1) {
                    jedis.lpush("Topic4", logDataFromTopic3Str);
                }
            }
            String logDataFromTopic2Str = jedis.rpop("Topic3");
            if (StringUtils.isNotEmpty(logDataFromTopic2Str)) {
                LogData logDataFromTopic2 = GsonUtils.fromJson(logDataFromTopic2Str, LogData.class);
                if ((logDataFromTopic2.getLogTime() & 1) != 0) {
                    jedis.lpush("Topic5", logDataFromTopic2Str);
                }
            }
        }
    }
}

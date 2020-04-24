package com.github.shefalibisht.kafka.config;


public class KafkaConfig {

    public static final String BOOTSTRAPSERVERS  = "127.0.0.1:9092";
    public static final String TOPIC = "Twitter-Kafka";
    public static final String ACKS_CONFIG = "all";
    public static final String MAX_IN_FLIGHT_CONN = "5";

    public static final String COMPRESSION_TYPE = "snappy";
    public static final String RETRIES_CONFIG = Integer.toString(Integer.MAX_VALUE);
    public static final String LINGER_CONFIG = "20";
    public static final String BATCH_SIZE = Integer.toString(32*1024);

}

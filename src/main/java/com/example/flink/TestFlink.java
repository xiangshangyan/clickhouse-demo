package com.example.flink;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.windowing.time.Time;

public class TestFlink {
    public static void main(String[] args) {
        StreamExecutionEnvironment executionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment();
        SingleOutputStreamOperator<Object> streamOperator = executionEnvironment.socketTextStream("localhost", 9999)
                .flatMap((FlatMapFunction<String, Object>) (value, collector) -> {
                    for (String word : value.split(" ")) {
                        collector.collect(Tuple2.of(word, 1));
                    }
                })
                .keyBy(0)
                .timeWindow(Time.seconds(5))
                .sum(1);

        streamOperator.print().setParallelism(1);

    }
}

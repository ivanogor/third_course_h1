package ru.hogwarts.school.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class InfoService {
    @Value("${server.port}")
    private int serverPort;
    private final Logger logger = LoggerFactory.getLogger(InfoService.class);
    public String getPort(){
        logger.info("Info about port is returned.");
        return "Current port is " + serverPort;
    }

    public Integer getIntegerByStream(){
        return Stream.iterate(1, a -> a +1) .limit(1_000_000) .reduce(0, Integer::sum);
    }
}

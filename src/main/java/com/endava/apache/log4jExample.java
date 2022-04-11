package com.endava.apache;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jExample {

    private static final Logger LOGGER = LogManager.getLogger(log4jExample.class);

    public void doSomething(String s) {
        LOGGER.info("Doing something with {}", s);
    }

    public static void main(String[] args) {
        log4jExample e = new log4jExample();
        e.doSomething("calculator");
    }

}

package org.example.untitled2;

import javafx.application.Application;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static javafx.application.Application.launch;

public class Main{
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
//        logger.trace("Hello Trace");
//        logger.debug("Hello Debug");
//        logger.info("Hello Info");
//        logger.warn("Hello Warn");
//        logger.error("Hello Error");
//        launch(org.example.untitled2.gui.Application.class);

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        logger.info("common for");
        for (int i = 0; i < list.size(); i++) {
            logger.info("index: {}, value: {}", i, list.get(i));
        }

        logger.info("extended for");
        for (String text : list) {
            logger.info(text);
        }
    }



    }


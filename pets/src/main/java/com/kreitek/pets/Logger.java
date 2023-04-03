package com.kreitek.pets;

public class Logger {

    private static volatile Logger instance;
    private int count = 0;

    private Logger() {}

    public static Logger getinstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void debug (String debug){
        increaseCount();
        String consoleString = "[debug]"+"["+count+"]"+" - "+debug;
        System.out.println(consoleString);
    }

    public void increaseCount(){
        count++;
    }
}

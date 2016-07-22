package com.example.ruslan.recyclelist.Message;

import java.util.Calendar;

/**
 * Created by ruslan on 22.07.16.
 */
public abstract class Message  {
    private String time;
    Calendar calendar;
    public String  getTime() {
        this.time="in millisecond"+System.currentTimeMillis();
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

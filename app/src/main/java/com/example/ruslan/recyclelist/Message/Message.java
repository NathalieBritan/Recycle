package com.example.ruslan.recyclelist.Message;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by ruslan on 22.07.16.
 */
public abstract class Message  {
    private String time;
    Calendar calendar;
    public String  getTime() {
        this.time= DateFormat.getDateTimeInstance().format(new Date()) ;
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

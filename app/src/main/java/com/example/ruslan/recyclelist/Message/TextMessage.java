package com.example.ruslan.recyclelist.Message;

/**
 * Created by ruslan on 22.07.16.
 */
public class TextMessage extends Message {
    private String textName;
    private String textMessage;

    public TextMessage(String textName, String textMessage) {
        this.textName = textName;
        this.textMessage = textMessage;
    }

    public String getTextName() {
        return textName;
    }

    public void setTextName(String textName) {
        this.textName = textName;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    @Override
    public String getTime() {
        return super.getTime();
    }
}

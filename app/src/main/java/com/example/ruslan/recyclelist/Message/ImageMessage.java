package com.example.ruslan.recyclelist.Message;

import android.widget.ImageView;

/**
 * Created by ruslan on 22.07.16.
 */
public class ImageMessage extends Message {

    private ImageView imageMessage;


    public ImageView getImageMessage() {
        return imageMessage;
    }

    public void setImageMessage(ImageView imageMessage) {
        this.imageMessage = imageMessage;
    }

    @Override
    public String getTime() {
        return super.getTime();
    }
}

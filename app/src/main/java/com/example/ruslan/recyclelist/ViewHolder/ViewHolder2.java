package com.example.ruslan.recyclelist.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ruslan.recyclelist.R;

/**
 * Created by ruslan on 22.07.16.
 */
public class ViewHolder2 extends RecyclerView.ViewHolder {
    private ImageView imageMessage;
    private TextView textTime;

    public ViewHolder2(View itemView) {
        super(itemView);
        imageMessage=(ImageView)itemView.findViewById(R.id.image_message);
        textTime=(TextView)itemView.findViewById(R.id.txt_time);
    }

    public ImageView getImageMessage() {
        return imageMessage;
    }
    public void setImageMessage(ImageView imageMessage) {
        this.imageMessage = imageMessage;
    }

    public TextView getTextTime() {
        return textTime;
    }

    public void setTextTime(TextView textTime) {
        this.textTime = textTime;
    }

}

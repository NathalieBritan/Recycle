package com.example.ruslan.recyclelist.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.ruslan.recyclelist.R;

/**
 * Created by ruslan on 22.07.16.
 */
public class ViewHolder1 extends RecyclerView.ViewHolder{
    private TextView textName;
    private TextView textMessage;

    private TextView textTime;

    public ViewHolder1(View itemView) {
        super(itemView);
        textName=(TextView)itemView.findViewById(R.id.txt_name);
        textMessage=(TextView)itemView.findViewById(R.id.txt_message);
        textTime=(TextView)itemView.findViewById(R.id.txt_time);
    }
    public TextView getTextTime() {
        return textTime;
    }
    public void setTextTime(TextView textTime) {
        this.textTime = textTime;
    }

    public TextView getTextName() {
        return textName;
    }

    public void setTextName(TextView textName) {
        this.textName = textName;
    }

    public TextView getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(TextView textMessage) {
        this.textMessage = textMessage;
    }

}

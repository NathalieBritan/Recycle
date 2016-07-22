package com.example.ruslan.recyclelist.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ruslan.recyclelist.Message.ImageMessage;
import com.example.ruslan.recyclelist.Message.Message;
import com.example.ruslan.recyclelist.Message.TextMessage;
import com.example.ruslan.recyclelist.R;
import com.example.ruslan.recyclelist.ViewHolder.ViewHolder1;
import com.example.ruslan.recyclelist.ViewHolder.ViewHolder2;

import java.util.List;

/**
 * Created by ruslan on 22.07.16.
 */
public class RecycleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Message> messages;

    private final int TEXT_MESSAGE=0;
    private final int IMAGE_MESSAGE=1;

    public RecycleAdapter(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public int getItemViewType(int position) {
        if(messages.get(position)instanceof TextMessage){
            return TEXT_MESSAGE;
        }
        else if(messages.get(position) instanceof ImageMessage){
            return IMAGE_MESSAGE;
        }
        return  -1;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        switch (viewType){
            case TEXT_MESSAGE:
                View v1=inflater.inflate(R.layout.layout_view_holder1,parent,false);
                viewHolder=new ViewHolder1(v1);
                break;
            case IMAGE_MESSAGE:
                View v2 =inflater.inflate(R.layout.layout_view_holder2,parent,false);
                viewHolder=new ViewHolder2(v2);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()){
            case TEXT_MESSAGE:
                ViewHolder1 viewHolder1=(ViewHolder1)holder;
                configureViewHolder1(viewHolder1,position);
                break;
            case IMAGE_MESSAGE:
                ViewHolder2 viewHolder2=(ViewHolder2)holder;
                configureViewHolder2(viewHolder2,position);
                break;
        }

    }

    private void configureViewHolder1(ViewHolder1 vh1, int position) {
        TextMessage textMessage = (TextMessage) messages.get(position);
        if (textMessage != null) {
            vh1.getTextName().setText("Name"+textMessage.getTextName());
            vh1.getTextMessage().setText("Message:  " + textMessage.getTextMessage());
            vh1.getTextTime().setText("Time"+textMessage.getTime());
        }
    }

    private void configureViewHolder2(ViewHolder2 vh2,int position) {
        ImageMessage imageMessage=(ImageMessage)messages.get(position);
        vh2.getImageMessage().setImageResource(R.drawable.icon_airplane);
        vh2.getTextTime().setText("Time"+imageMessage.getTime());
    }

    @Override
    public int getItemCount() {
        return this.messages.size();
    }
}

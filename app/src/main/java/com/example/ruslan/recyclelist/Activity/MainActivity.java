package com.example.ruslan.recyclelist.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ruslan.recyclelist.Adapter.RecycleAdapter;
import com.example.ruslan.recyclelist.Message.ImageMessage;
import com.example.ruslan.recyclelist.Message.Message;
import com.example.ruslan.recyclelist.Message.TextMessage;
import com.example.ruslan.recyclelist.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Message> getSampleArrayList() {
        ArrayList<Message> messages = new ArrayList<>();
        messages.add(new TextMessage("Name","Message"));
        messages.add(new TextMessage("Rob Stark", "Winterfell"));
        messages.add(new ImageMessage());
        messages.add(new TextMessage("Jon Snow", "Castle Black"));
        messages.add(new ImageMessage());
        messages.add(new TextMessage("Tyrion Lanister", "King's Landing"));
        return messages;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recycle_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecycleAdapter(getSampleArrayList()));
    }
}

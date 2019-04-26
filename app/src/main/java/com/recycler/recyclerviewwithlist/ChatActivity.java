package com.recycler.recyclerviewwithlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<ChatModal> chatModalsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        /*   id initialization   */
        inItId();
        /* fill the list with data*/
        setDataInList();
        /* set data on recyclerView */
        setDataInRecyclerView();
    }

    private void setDataInRecyclerView() {
        ChatAdapter chatAdapter;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Toast.makeText(this, "chatModelList"+chatModalsList.size(), Toast.LENGTH_SHORT).show();
        chatAdapter = new ChatAdapter(chatModalsList);
        recyclerView.setAdapter(chatAdapter);
    }

    private void setDataInList() {

        chatModalsList = new ArrayList<>();
        for(int i=1;i<=20;i++)
        {
            if(i%2==0)
            {
                ChatModal chatModal = new ChatModal("true");
                chatModalsList.add(chatModal);
            }
            else
            {
                ChatModal chatModal = new ChatModal("false");
                chatModalsList.add(chatModal);
            }

        }
    }

    private void inItId() {
        recyclerView = findViewById(R.id.recycle_chat);

    }
}

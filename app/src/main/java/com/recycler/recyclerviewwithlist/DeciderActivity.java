package com.recycler.recyclerviewwithlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeciderActivity extends AppCompatActivity {
    private Button btnGrid,btnList,btnChat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decider);
        /*id initialization */
        inItId();
        /* listener for grid*/
        btnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DeciderActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        /* listener for list*/
        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DeciderActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        /* listener for chat*/
        btnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DeciderActivity.this,ChatActivity.class);
                startActivity(intent);
            }
        });
    }

    private void inItId() {
        btnGrid = findViewById(R.id.btn_grid);
        btnList = findViewById(R.id.btn_list);
        btnChat = findViewById(R.id.btn_chat);
    }

}

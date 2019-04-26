package com.recycler.recyclerviewwithlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<StudentInfoModal> listItem;
    private StudentInfoAdapter studentInfoAdapter;
    private Button btnDataSet;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*id initialization*/
        inItIds();
        /*set the data on recyclerView with blank list*/
        setBlankListOnRecyclerView();

        btnDataSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*set the data on recyclerView with data list*/
                setDataOnRecyclerView();

            }
        });

    }

    private void setDataOnRecyclerView() {

        for(int i=0;i<10;i++)
        {

            StudentInfoModal studentInfoModalList = new StudentInfoModal("harsh"+i,"21");
            listItem.add(studentInfoModalList);
        }
        studentInfoAdapter.notifyDataSetChanged();
    }

    private void setBlankListOnRecyclerView() {

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listItem = new ArrayList<>();
        studentInfoAdapter = new StudentInfoAdapter(listItem);
        recyclerView.setAdapter(studentInfoAdapter);
        Toast.makeText(this, "size="+listItem.size(), Toast.LENGTH_SHORT).show();
    }

    private void inItIds() {
        recyclerView = findViewById(R.id.recycleList);
        btnDataSet = findViewById(R.id.button_dataset);
    }
}

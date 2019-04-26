package com.recycler.recyclerviewwithlist;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<StudentInfoModal> listItem;
    private StudentInfoAdapter studentInfoAdapter;
    private Button btn_grid_two,btn_grid_three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        /* id initialization*/
        inItId();
        /*listener for grid two */
        btn_grid_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*set data on grid level two*/
                setDataOnGridTwoLevel();
            }
        });
        /*listener for grid three */
        btn_grid_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*set data on grid level three*/
                setDataOnGridThreeLevel();
            }
        });
    }

    private void setDataOnGridThreeLevel() {
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        listItem = new ArrayList<>();
        for(int i=0;i<30;i++)
        {
            StudentInfoModal studentInfoModalList = new StudentInfoModal("harsh"+i,"21");
            listItem.add(studentInfoModalList);
        }
        studentInfoAdapter = new StudentInfoAdapter(listItem);
        recyclerView.setAdapter(studentInfoAdapter);
    }

    private void setDataOnGridTwoLevel() {
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        listItem = new ArrayList<>();
        for(int i=0;i<30;i++)
        {
            StudentInfoModal studentInfoModalList = new StudentInfoModal("harsh"+i,"21");
            listItem.add(studentInfoModalList);
        }
        studentInfoAdapter = new StudentInfoAdapter(listItem);
        recyclerView.setAdapter(studentInfoAdapter);
    }

    private void inItId() {
        btn_grid_two = findViewById(R.id.btn_grid2);
        btn_grid_three = findViewById(R.id.btn_grid3);
        recyclerView = findViewById(R.id.recycleList);
    }

}

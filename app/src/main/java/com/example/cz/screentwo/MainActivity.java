package com.example.cz.screentwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Task> taskList=new ArrayList<Task>();

//    private String[] data={"Ftask","Stask","sdvs","svgsdfsrf","vgergre","gerg"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
//                MainActivity.this,android.R.layout.simple_list_item_1,data);
//        ListView lv=(ListView)findViewById(R.id.list_view);
//        lv.setAdapter(adapter);


        initTasks();
        TaskAdapter tad=new TaskAdapter(MainActivity.this,R.layout.task_item,taskList);
        ListView lv=(ListView)findViewById(R.id.list_view);
        lv.setAdapter(tad);
    }

    private void initTasks(){
        Task task1=new Task("first task",R.drawable.p1);
        taskList.add(task1);
        Task task2=new Task("second task",R.drawable.p2);
        taskList.add(task2);

    }
}

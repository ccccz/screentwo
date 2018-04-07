package com.example.cz.screentwo;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LayoutAnimationController;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by CZ on 2018/4/5.
 */

public class TaskAdapter extends ArrayAdapter<Task> {

    private int resourceId;

    public TaskAdapter(Context context, int textViewResourceId, List<Task> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        Task task = getItem(position);
        View view=LayoutInflater.from(getContext()).inflate(resourceId,null);
        LinearLayout llo=(LinearLayout)view.findViewById(R.id.task_layout);
        llo.setBackgroundResource(task.getImageId());
//        ImageView taskImage = (ImageView) view.findViewById(R.id.task_image);
        TextView taskName=(TextView)view.findViewById(R.id.task_name);
//        taskImage.setImageResource(task.getImageId());
        taskName.setText(task.getName());
        return view;
    }

}
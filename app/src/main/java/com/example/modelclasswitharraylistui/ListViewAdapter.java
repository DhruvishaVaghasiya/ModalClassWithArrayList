package com.example.modelclasswitharraylistui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    ArrayList<InstaUiModelClass> instaList = new ArrayList<>();

    Context context;

    public ListViewAdapter(ArrayList<InstaUiModelClass> instaList ) {
        this.instaList=instaList;

    }
    @Override
    public int getCount() {
        return instaList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_ui_items, null);
        TextView userName = view.findViewById(R.id.userName);
        ImageView postDp1 = view.findViewById(R.id.postDp1);
        ImageView postImg1 = view.findViewById(R.id.postImg1);
        TextView likeLine1 = view.findViewById(R.id.likeLine1);


        postDp1.setImageResource(instaList.get(i).getDpPic());
        userName.setText(instaList.get(i).getUserId());
        postImg1.setImageResource(instaList.get(i).getPostPic());
        likeLine1.setText(instaList.get(i).getLikeByLines());


        return view;
    }
}

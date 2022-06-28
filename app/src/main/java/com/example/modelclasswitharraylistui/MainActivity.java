package com.example.modelclasswitharraylistui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.modelclasswitharraylistui.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<InstaUiModelClass> instaList=new ArrayList<>();
 //   ArrayList<Integer> dpPic=new ArrayList<>();
  //  ArrayList<Integer> postPic=new ArrayList<>();
  //  ArrayList<String> likeByLines=new ArrayList<>();
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        intiView();

    }
    private void intiView() {

        InstaUiModelClass m1=new InstaUiModelClass();
        m1.setUserId("darshanraval");
        m1.setLikeByLines("Liked by dhuli_130 and 4,500 others");
        m1.setDpPic(R.drawable.img_1);
        m1.setPostPic(R.drawable.img);
        instaList.add(m1);

        InstaUiModelClass m2=new InstaUiModelClass();
        m2.setUserId("darshanraval");
        m2.setLikeByLines("Liked by dhuli_130 and 4,500 others");
        m2.setDpPic(R.drawable.img_2);
        m2.setPostPic(R.drawable.img2);
        instaList.add(m2);

        InstaUiModelClass m3=new InstaUiModelClass();
        m3.setUserId("darshanraval");
        m3.setLikeByLines("Liked by dhuli_130 and 4,500 others");
        m3.setDpPic(R.drawable.img3);
        m3.setPostPic(R.drawable.img_3);
        instaList.add(m3);

        InstaUiModelClass m4=new InstaUiModelClass();
        m4.setUserId("darshanraval");
        m4.setLikeByLines("Liked by dhuli_130 and 4,500 others");
        m4.setDpPic(R.drawable.img4);
        m4.setPostPic(R.drawable.img_4);
        instaList.add(m4);

        InstaUiModelClass m5=new InstaUiModelClass();
        m5.setUserId("darshanraval");
        m5.setLikeByLines("Liked by dhuli_130 and 4,500 others");
        m5.setDpPic(R.drawable.img5);
        m5.setPostPic(R.drawable.img_5);
        instaList.add(m5);




        ListViewAdapter ad = new ListViewAdapter(instaList);
        binding.listView.setAdapter(ad);
    }
}
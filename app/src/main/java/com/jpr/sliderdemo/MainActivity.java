package com.jpr.sliderdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    private ImageView imageView;
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;


    ArrayList<Integer> arrayList ;

    private View.OnClickListener changeSlideOnViewPager ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList<>();
        arrayList.add(R.drawable.tile_0);
        arrayList.add(R.drawable.tile_1);
        arrayList.add(R.drawable.tile_2);
        arrayList.add(R.drawable.tile_3);

        viewPager = findViewById(R.id.viewpagerid);

        imageView = findViewById(R.id.imageView) ;
        imageView1= findViewById(R.id.imageView2);
        imageView2= findViewById(R.id.imageView3);
        imageView3= findViewById(R.id.imageView4);


        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(MainActivity.this, arrayList);
        viewPager.setAdapter(viewPagerAdapter);


        changeSlideOnViewPager = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeSlide(v);
            }
        };

        imageView.setOnClickListener(changeSlideOnViewPager);
        imageView1.setOnClickListener(changeSlideOnViewPager);
        imageView2.setOnClickListener(changeSlideOnViewPager);
        imageView3.setOnClickListener(changeSlideOnViewPager);

    }

    private void changeSlide(View v) {
        if (v.getId() == imageView.getId()){
            viewPager.setCurrentItem(0);
        }
        else if (v.getId() == imageView1.getId()){
            viewPager.setCurrentItem(1);
        }
        else if (v.getId() == imageView2.getId()){
            viewPager.setCurrentItem(2);
        }
        else if (v.getId() == imageView3.getId()){
            viewPager.setCurrentItem(3);
        }
    }
}
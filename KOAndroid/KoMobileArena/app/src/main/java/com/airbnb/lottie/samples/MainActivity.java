package com.airbnb.lottie.samples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.vszone.ko.app.R;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main_a);

    if (savedInstanceState == null) {
      getSupportFragmentManager().beginTransaction()
          .replace(R.id.content_1, ListFragment.newInstance())
          .commit();
    }
  }
}

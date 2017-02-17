/**
 * Copyright (C)  2017 深圳市掌玩网络技术有限公司 KoMobileArena MainActivity.java
 */
package cn.vszone.ko.activtiy;


import junit.framework.Test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import cn.vszone.ko.app.R;

/**
 * @author JinBinBin
 * @version 1.0 <p><strong>Features draft description.应用的主界面</strong></p>
 * @since 2017/2/14 0014 14:41
 */
public class MainActivity extends Activity {
    // ===========================================================
    // Constants
    // ===========================================================


    // ===========================================================
    // Fields
    // ===========================================================


    // ===========================================================
    // Constructors
    // ===========================================================


    // ===========================================================
    // Getter &amp; Setter
    // ===========================================================


    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pView) {
                startActivity(new Intent(MainActivity.this, com.airbnb.lottie.samples.MainActivity.class));
            }
        });


    }

    // ===========================================================
    // Methods
    // ===========================================================


    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================
}

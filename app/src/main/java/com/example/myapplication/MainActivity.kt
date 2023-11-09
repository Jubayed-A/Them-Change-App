package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.btnBlack
import kotlinx.android.synthetic.main.activity_main.btnBlue
import kotlinx.android.synthetic.main.activity_main.btnDark
import kotlinx.android.synthetic.main.activity_main.btnGray
import kotlinx.android.synthetic.main.activity_main.btnNaviBlue
import kotlinx.android.synthetic.main.activity_main.btnRed
import kotlinx.android.synthetic.main.activity_main.btnSky
import kotlinx.android.synthetic.main.activity_main.btnWhite
import kotlinx.android.synthetic.main.activity_main.btnYellow
import kotlinx.android.synthetic.main.activity_main.btngreen
import kotlinx.android.synthetic.main.activity_main.layout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // black them code here
        btnBlack.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }
        // blue them code here
        btnBlue.setOnClickListener {
            layout.setBackgroundResource(R.color.blue)
        }
        // dark them code here
        btnDark.setOnClickListener {
            layout.setBackgroundResource(R.color.dark)
        }
        // green them code here
        btngreen.setOnClickListener {
            layout.setBackgroundResource(R.color.green)
        }
        // gray them code here
        btnGray.setOnClickListener {
            layout.setBackgroundResource(R.color.gray)
        }
        // sky them code here
        btnSky.setOnClickListener {
            layout.setBackgroundResource(R.color.sky)
        }
        // naviblue them code here
        btnNaviBlue.setOnClickListener {
            layout.setBackgroundResource(R.color.naviBlue)
        }
        // red them code here
        btnRed.setOnClickListener {
            layout.setBackgroundResource(R.color.red)
        }
        // yellow them code here
        btnYellow.setOnClickListener {
            layout.setBackgroundResource(R.color.yellow)
        }
        // white them code here
        btnWhite.setOnClickListener {
            layout.setBackgroundResource(R.color.white)
        }


    }
}
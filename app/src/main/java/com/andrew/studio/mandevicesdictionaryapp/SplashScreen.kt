package com.andrew.studio.mandevicesdictionaryapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {

    // TODO 1: Thiết kế giao diện màn hình chờ giống như file hình vẽ
        //TODO 1.1: Thêm một TextView tên txtTitle
        //TODO 1.2: Thêm một TextView tên txtSubtitle
        //TODO 1.3: Chọn màu nền cho ConstrainLayout ở ngoài (Tùy chọn)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val handler = Handler()
        handler.postDelayed({
            // TODO 2: Chuyển activity bằng intent
        }, 5000)
    }
}

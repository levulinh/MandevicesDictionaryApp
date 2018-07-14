package com.andrew.studio.mandevicesdictionaryapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    //TODO 1: Sửa Launcher Activity thành Splash Screen
        //Vào file Manifest
    //TODO 2: Tạo style mới loại bỏ title bar
    //TODO 3: Apply style mới này cho splash screen

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("中野湧希", 24, "テニス")      // 名前を中野湧希、年齢24歳、趣味テニスで、Humanのインスタンスを作る

        human.say()
        human.think()
    }
}
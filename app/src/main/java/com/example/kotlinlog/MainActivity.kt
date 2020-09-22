package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("太郎", 24, "テニス")      // Humanのインスタンス生成
        val human2 = Human("花子", 23, "読書")

        human1.say()
        human1.think()
        human2.say()
        human2.think()
    }
}
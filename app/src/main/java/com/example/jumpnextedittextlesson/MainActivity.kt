package com.example.jumpnextedittextlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText3.requestFocus()    //這個指令就是跳轉到那個輸入，目前是設定第3個，可以配合監聽Enter
    }
}
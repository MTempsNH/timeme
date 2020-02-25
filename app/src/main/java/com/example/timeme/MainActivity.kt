package com.example.timeme

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.widget.ImageButton
import android.content.Intent

import android.util.Log

class MainActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enables Always-on
        setAmbientEnabled()
    }

    override fun onStart() {
        super.onStart()

        // Log.i("001", "test log")

        // get reference to button
        val btn_click_me = findViewById(R.id.btn_click_me) as ImageButton

        // set on-click listener
        btn_click_me.setOnClickListener {
            Log.i("001", "Navigate to new activity")
            val intent = Intent(this, HistoryActivity::class.java)

            startActivity(intent)
        }
    }
}

package com.example.timeme

import android.os.Bundle
import android.support.wearable.activity.WearableActivity

import android.util.Log

class HistoryActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        // Enables Always-on
        setAmbientEnabled()
    }

    override fun onStart() {
        super.onStart()

        Log.i("002", "Event: History Activity")
    }
}

package com.wiacekdawid.lifecycletest.activities

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.wiacekdawid.lifecycletest.R
import com.wiacekdawid.lifecycletest.fragments.FirstFragment

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Lifecycle callback: " + this.localClassName, "onCreate")
        setContentView(R.layout.activity_first)

        if (savedInstanceState != null) return

        val firstFragment = FirstFragment.newInstance()
        supportFragmentManager.beginTransaction()
            .add(R.id.navigation_host, firstFragment).addToBackStack(null).commit()
    }

    override fun onStart() {
        Log.i("Lifecycle callback: " + this.localClassName, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("Lifecycle callback: " + this.localClassName, "onResume")
        super.onResume()
    }

    override fun onRestart() {
        Log.i("Lifecycle callback: " + this.localClassName, "onRestart")
        super.onRestart()
    }

    override fun onPause() {
        Log.i("Lifecycle callback: " + this.localClassName, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("Lifecycle callback: " + this.localClassName, "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("Lifecycle callback: " + this.localClassName, "onDestroy")
        super.onDestroy()
    }
}
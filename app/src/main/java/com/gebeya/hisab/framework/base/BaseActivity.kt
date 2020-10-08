package com.gebeya.hisab.framework.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gebeya.hisab.framework.util.logD

open class BaseActivity: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        d("OnCreate")
    }

    override fun onStart() {
        super.onStart()
        d("OnStart")
    }

    override fun onResume() {
        super.onResume()
        d("OnResume")
    }

    override fun onPause() {
        super.onPause()
        d("OnPause")
    }

    override fun onStop() {
        super.onStop()
        d("OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        d("OnDestroy")
    }

    protected fun d(message: String){
        val tag= this::class.simpleName
        //Log.d(tag, message)
        logD(this, message)
    }
}
package com.gebeya.hisab.framework.util

import android.nfc.Tag
import android.util.Log

private const val TAG =  "HISAB-TAG-DEBUG"

fun logD(source: Any, message: String){
    val name= source::class.simpleName
    val output= "$name : $message"
    Log.d(TAG, output)
}
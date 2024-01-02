package com.mine.clickcounter

import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {
    var count = 0

    fun countPlus(){
        count++
    }
    fun countZero(){
        count = 0
    }
}
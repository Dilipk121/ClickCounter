package com.mine.clickcounter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountLiveViewModel:ViewModel() {
    var count = MutableLiveData<Int>()

    init {
        count.value = 0
    }

    fun CountClisks(){
        count.value = (count.value)?.plus(1)
    }

    fun CountZero(){
       if (count.value!! > 0 ){
           count.value = (count.value)?.minus(1)
       }
    }


}
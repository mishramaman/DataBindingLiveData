package com.example.myapplication111

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

    var text=MutableLiveData<String>("We need more people like you in this country")


    fun updateText(){
        text.value="You Deserve to be here"
    }
}
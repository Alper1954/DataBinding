package com.example.databinding.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val usd_to_eu_rate = 0.74f
    var dollarValue: MutableLiveData<String> = MutableLiveData()
    private var _result: MutableLiveData<Float> = MutableLiveData()
    val result: LiveData<Float>
        get() = _result

    fun convertValue() {
        dollarValue.let {
            if (!it.value.equals("")) {
                _result.value = it.value?.toFloat()?.times(usd_to_eu_rate)
            } else {
                _result.value = 0f
            }
        }
    }
}
package com.b3lon9.app.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.b3lon9.app.models.BrightModel

class BrightViewModel : ViewModel() {
    /* data */
    private val model = MutableLiveData<BrightModel>()

    /* performance */
    var width:Int = 0

    init {
        width = 100
    }

    fun getModel():MutableLiveData<BrightModel> {
        return model
    }


}
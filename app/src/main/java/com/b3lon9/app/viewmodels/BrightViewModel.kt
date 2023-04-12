package com.b3lon9.app.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.b3lon9.app.models.BrightModel

class BrightViewModel : ViewModel() {
    private lateinit var model:LiveData<BrightModel>

    init {
    }
}
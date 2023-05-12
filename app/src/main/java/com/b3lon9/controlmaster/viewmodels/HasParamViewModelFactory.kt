package com.b3lon9.controlmaster.viewmodels

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class HasParamViewModelFactory(private val param:Any) : ViewModelProvider.Factory {
    /*override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(BrightViewModel::class.java)) {
            val context:Context = param as Context
            BrightViewModel(context) as BrightViewModel
        } else {
            throw IllegalArgumentException()
        }
    }*/
}
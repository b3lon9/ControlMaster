package com.b3lon9.controlmaster.viewmodels
/*
 *   Copyright 2023 Neander
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

import android.content.Context
import android.provider.Settings
import android.widget.SeekBar
import androidx.databinding.ObservableInt
import androidx.lifecycle.ViewModel
import com.b3lon9.controlmaster.`interface`.LevelListener

class BrightViewModel(private var context: Context) : ViewModel(), LevelListener {
    val progressMaxLevel = 255
    val progressMinLevel = 0

    /* data */
    val level = ObservableInt(0)

    init {
        updateLevel(Settings.System.getInt(context.contentResolver, Settings.System.SCREEN_BRIGHTNESS, -1))
        /*level.addOnPropertyChangedCallback(object : Observable.OnPropertyChangedCallback() {
            override fun onPropertyChanged(sender: Observable?, propertyId: Int) {
            }
        })*/
    }

    fun onClickMin() {
        updateLevel(progressMinLevel)
    }

    fun onClickAuto() {

    }

    fun onClickMax() {
        updateLevel(progressMaxLevel)
    }
    
    fun onProgressChanged(seekBar: SeekBar, level:Int, b:Boolean) {
        // System
        Settings.System.putInt(context.contentResolver, Settings.System.SCREEN_BRIGHTNESS, level)
    }

    override fun updateLevel(level: Int) {
        // ui
        this.level.set(level)
    }
}
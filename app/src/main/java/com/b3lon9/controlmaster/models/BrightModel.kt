package com.b3lon9.controlmaster.models
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

import androidx.databinding.Observable
import androidx.databinding.Observable.OnPropertyChangedCallback

class BrightModel : OnPropertyChangedCallback() {
    var level:Int
        get() = level
        set(value) {
            level = value
        }

    // MutableLiveData 즉각 반응하지 않을 경우 또는 모델 내부 데이터에서 변화가 필요한 경우 사용
    override fun onPropertyChanged(sender: Observable?, propertyId: Int) {
        TODO("Not yet implemented")
    }
}

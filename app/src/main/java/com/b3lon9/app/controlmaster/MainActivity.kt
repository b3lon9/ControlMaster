package com.b3lon9.app.controlmaster

import android.os.Build
import android.os.Bundle
import android.widget.FrameLayout
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.b3lon9.app.controlmaster.databinding.ActivityMainBinding
import com.b3lon9.app.viewmodels.BrightViewModel
import com.b3lon9.app.viewmodels.VolumeViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.bvm = BrightViewModel()
        binding.vvm = VolumeViewModel()

        init()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun init() {
        val layoutParams = FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT)
        layoutParams.width = (resources.displayMetrics.widthPixels * 0.8).toInt()
        binding.root.layoutParams = layoutParams
    }
}
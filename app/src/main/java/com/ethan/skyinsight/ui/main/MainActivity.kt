package com.ethan.skyinsight.ui.main

import android.content.Context
import android.os.Bundle
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.ethan.base.component.BaseActivityVB
import com.ethan.skyinsight.databinding.LayoutComposeContainerBinding
import com.ethan.skyinsight.ui.main.page.MainPage
import com.ethan.skyinsight.ui.theme.SkyInsightTheme2
import com.skydoves.bundler.intentOf

class MainActivity : BaseActivityVB<LayoutComposeContainerBinding>() {

    companion object {
        fun launch(context: Context) {
            context.intentOf<MainActivity> {
                startActivity(context)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.composeView.apply {
            setContent {
                CompositionLocalProvider {
                    SkyInsightTheme2 {
                        Surface(modifier = Modifier.fillMaxSize(), color = Color.Transparent) {
                            MainPage()
                        }
                    }
                }
            }
        }
    }
}
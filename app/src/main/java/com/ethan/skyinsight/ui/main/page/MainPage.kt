package com.ethan.skyinsight.ui.main.page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ethan.skyinsight.ui.main.view.WeatherPage
import com.ethan.skyinsight.ui.theme.PurpleGrey40

@Composable
@Preview
fun MainPage() {
    Box(modifier = Modifier.fillMaxSize().background(color = PurpleGrey40)) {
        WeatherPage()
    }
}
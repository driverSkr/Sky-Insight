package com.ethan.skyinsight.ui.main.page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ethan.skyinsight.ui.theme.White

@Composable
@Preview
fun MainPage() {
    Box(modifier = Modifier.fillMaxSize().background(color = White)) {
        Text(text = "这是首页", modifier = Modifier.align(Alignment.Center))
    }
}
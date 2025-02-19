package com.ethan.skyinsight.ui.main.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ethan.skyinsight.ui.theme.Black
import com.ethan.skyinsight.ui.theme.White
import com.ethan.skyinsight.ui.theme.White10
import com.ethan.skyinsight.ui.theme.White30
import com.ethan.skyinsight.ui.theme.White50
import com.ethan.skyinsight.ui.theme.White60
import com.ethan.skyinsight.ui.theme.White70

@Composable
@Preview
fun WeatherPage() {

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 10.dp)
    ) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(480.dp)
        ) {
            Column(modifier = Modifier
                .wrapContentSize()
                .align(Alignment.Center)
            ) {
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.Bottom
                ) {
                    Text(text = "16", color = White, fontSize = 78.sp, fontWeight = FontWeight.W700)
                    Column(modifier = Modifier.padding(14.dp)) {
                        Text(text = "°C", color = White, fontSize = 20.sp, fontWeight = FontWeight.W400)
                        Text(text = "阴", color = White, fontSize =20.sp, fontWeight = FontWeight.W400)
                    }
                }
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "2月20日", color = White, fontSize = 20.sp, fontWeight = FontWeight.W400)
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "农历一月廿三", color = White, fontSize = 20.sp, fontWeight = FontWeight.W400)
                }
            }

            Row(modifier = Modifier
                .padding(bottom = 15.dp)
                .wrapContentSize()
                .background(color = White10, shape = RoundedCornerShape(16.dp))
                .padding(vertical = 4.dp, horizontal = 6.dp)
                .align(Alignment.BottomEnd),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "34", color = White, fontSize = 14.sp, fontWeight = FontWeight.W400)
                Spacer(modifier = Modifier.width(5.dp))
                Text(text = "空气优", color = White, fontSize = 14.sp, fontWeight = FontWeight.W400)
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(color = White60, shape = RoundedCornerShape(8.dp))
        ) {
            Column(modifier = Modifier.padding(vertical = 12.dp).weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "16°C", color = Black, fontSize = 14.sp, fontWeight = FontWeight.W400)
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "体感", color = Black, fontSize = 14.sp, fontWeight = FontWeight.W400)
            }
            Column(modifier = Modifier.padding(vertical = 12.dp).weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "73%", color = Black, fontSize = 14.sp, fontWeight = FontWeight.W400)
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "湿度", color = Black, fontSize = 14.sp, fontWeight = FontWeight.W400)
            }
            Column(modifier = Modifier.padding(vertical = 12.dp).weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "东北风2级", color = Black, fontSize = 14.sp, fontWeight = FontWeight.W400)
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "风力", color = Black, fontSize = 14.sp, fontWeight = FontWeight.W400)
            }
            Column(modifier = Modifier.padding(vertical = 12.dp).weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "1014hpa", color = Black, fontSize = 14.sp, fontWeight = FontWeight.W400)
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "气压", color = Black, fontSize = 14.sp, fontWeight = FontWeight.W400)
            }
        }
    }
}
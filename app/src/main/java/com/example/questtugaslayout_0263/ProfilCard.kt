package com.example.questtugaslayout_0263

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfilCard(
    nama: String,
    telepon: String,
    alamat: String,
    warnaBg: Color,
    warnaAlamat: Color
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 16.dp),
        colors = CardDefaults.cardColors(containerColor = warnaBg),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            val logo = painterResource(id = R.drawable.logoumy)
            Image(
                painter = logo,
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )
            
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = nama,
                    color = colorResource(id = R.color.teks_putih),
                    fontFamily = FontFamily.Cursive,
                    fontSize = 24.sp
                )
                if (telepon.isNotEmpty()) {
                    Text(
                        text = telepon,
                        color = colorResource(id = R.color.teks_cyan),
                        fontSize = 14.sp
                    )
                }
                Text(
                    text = alamat,
                    color = warnaAlamat,
                    fontSize = 14.sp
                )
            }

            Image(
                painter = logo,
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )
        }
    }
}

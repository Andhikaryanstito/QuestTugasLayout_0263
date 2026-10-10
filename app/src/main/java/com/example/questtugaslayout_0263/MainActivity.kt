package com.example.questtugaslayout_0263

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questtugaslayout_0263.ui.theme.QuestTugasLayout_0263Theme


class MainActivity : ComponentActivity() {
    @Composable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestTugasLayout_0263Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LayoutUtama(modifier = Modifier.padding(innerPadding))
                }
            }
        }
        
        Text(
            text = stringResource(id = R.string.teks_copyright),
            fontSize = 12.sp,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 16.dp)
        )
    }
}

(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(32.dp))
            
            Text(
                text = stringResource(id = R.string.judul_prodi),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Text(
                text = stringResource(id = R.string.judul_univ),
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
            
            Spacer(modifier = Modifier.height(24.dp))
            
            // Card 1
            ProfilCard(
                nama = stringResource(id = R.string.nama_1),
                telepon = "",
                alamat = stringResource(id = R.string.alamat_1),
                warnaBg = colorResource(id = R.color.bg_bambang),
                warnaAlamat = colorResource(id = R.color.teks_kuning)
            )
            
            // Card 2
            ProfilCard(
                nama = stringResource(id = R.string.nama_2),
                telepon = stringResource(id = R.string.telp_standar),
                alamat = stringResource(id = R.string.alamat_2),
                warnaBg = colorResource(id = R.color.bg_gibran),
                warnaAlamat = colorResource(id = R.color.teks_kuning)
            )
            
            // Card 3
            ProfilCard(
                nama = stringResource(id = R.string.nama_3),
                telepon = stringResource(id = R.string.telp_standar),
                alamat = stringResource(id = R.string.alamat_3),
                warnaBg = colorResource(id = R.color.bg_zhilal),
                warnaAlamat = colorResource(id = R.color.teks_putih)
            )
            
            // Card 4
            ProfilCard(
                nama = stringResource(id = R.string.nama_4),
                telepon = stringResource(id = R.string.telp_standar),
                alamat = stringResource(id = R.string.alamat_4),
                warnaBg = colorResource(id = R.color.bg_ahmad),
                warnaAlamat = colorResource(id = R.color.teks_kuning)
            )
        }
        
        Text(
            text = stringResource(id = R.string.teks_copyright),
            fontSize = 12.sp,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 16.dp)
        )
    }
}

package com.example.questtugaslayout_0263

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LayoutUtama(modifier: Modifier = Modifier) {
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
                telepon = stringResource(id = R.string.telp_andhika),
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

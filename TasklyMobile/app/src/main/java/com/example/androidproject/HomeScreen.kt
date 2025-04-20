package com.example.androidproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidproject.ui.theme.AndroidProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectTheme {
                TasklyHomeScreen() // Ana sayfa tasarımını burada gösteriyoruz
            }
        }
    }
}

@Composable
fun TasklyHomeScreen() {
    // Scaffold, başlık ve içeriği yönetmek için kullanılıyor
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = { Text("Taskly") },  // Başlık
                backgroundColor = MaterialTheme.colors.primary
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp) // İçeriğe padding ekledik
            ) {
                // Başlık
                Text(
                    text = "Yapılacak İşler",  // Ana sayfanın başlığı
                    style = MaterialTheme.typography.h6
                )

                // İşlerin listesi (Örnek veri)
                LazyColumn {
                    items(listOf("Toplantıya katıl", "Kod yaz", "Testleri geç", "E-posta gönder")) { task ->
                        Text(
                            text = task,  // Görevleri listele
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                }

                // Aksiyon Butonu
                Button(
                    onClick = { /* Yeni görev ekleme işlemi buraya gelecek */ },
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .fillMaxWidth() // Butonun genişliğini ekranla aynı yapıyoruz
                ) {
                    Text("Yeni Görev Ekle") // Butonun üzerinde yazacak metin
                }
            }
        }
    )
}

// Önizleme fonksiyonu, tasarımı önceden görmek için
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidProjectTheme {
        TasklyHomeScreen()
    }
}

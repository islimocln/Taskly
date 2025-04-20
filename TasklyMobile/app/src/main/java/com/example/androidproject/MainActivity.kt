package com.example.androidproject

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.unit.dp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidproject.ui.theme.AndroidProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainContent(innerPadding)
                }
            }
        }
    }
}

@Composable
fun MainContent(innerPadding: PaddingValues) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .verticalScroll(scrollState)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Taskly",
            style = MaterialTheme.typography.h3,
            modifier = Modifier.padding(16.dp)
        )
        // Placeholder for image
        Image(
            painter = painterResource(id = R.drawable.taskly_image), // Replace with your image resource
            contentDescription = "Taskly App",
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
        Text(
            text = "Yapılacak işleri her yerden not edin, düzenleyin ve halledin.",
            style = MaterialTheme.typography.body1,
            modifier = Modifier.padding(16.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Taskly Nasıl Kullanılır?",
            style = MaterialTheme.typography.h5,
            modifier = Modifier.padding(16.dp)
        )
        // Add some information or instructions
        Text(
            text = "Taskly101: İşlerinizi kolayca düzenleyin ve takip edin. Kaydırarak görevlerinizi ekleyebilir, organize edebilirsiniz.",
            style = MaterialTheme.typography.body1,
            modifier = Modifier.padding(16.dp)
        )
        Spacer(modifier = Modifier.height(40.dp))
        Button(
            onClick = { /* Action to go to Taskly usage screen */ },
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Başlayın")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidProjectTheme {
        MainContent(innerPadding = PaddingValues())
    }
}

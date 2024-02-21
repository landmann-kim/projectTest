package com.landmann.composebottomnavigationsample.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun WriteScreen() {
    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.inversePrimary)
    ){
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = "글쓰기 화면",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Preview
@Composable
fun WriteScreenPreview() {
    WriteScreen()
}
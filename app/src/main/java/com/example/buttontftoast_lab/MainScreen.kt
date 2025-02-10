package com.example.buttontftoast_lab

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp



@Composable
fun MainScreen(modifier: Modifier) {

    val context = LocalContext.current
    var text by rememberSaveable { mutableStateOf("") }

    Column(modifier) {
        //Top

        TextField(
            value = text,
            onValueChange = {text = it},
            label = { Text("Enter Text ") }
        )


        Button( onClick = {
            Toast.makeText(context, "Show Data button pressed : $text !", Toast.LENGTH_SHORT).show()
//            println("Show Data button pressed !")
//            println(text)
        })
        {
            Text("Show Data ")
        }


        Text("$text",
            fontSize = 30.sp
        )


    }



}
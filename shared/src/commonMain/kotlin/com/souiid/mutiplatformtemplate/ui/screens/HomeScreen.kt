package com.souiid.mutiplatformtemplate.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import com.souiid.mutiplatformtemplate.ui.components.text.TText
import com.souiid.mutiplatformtemplate.ui.components.text.TTextStyle

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TText(
            text = "Title",
            style = TTextStyle.TITLE
        )
        TText(
            text = "Subtitle",
            style = TTextStyle.SUBTITLE
        )

        TText(
            text = "Subtitle",
            style = TTextStyle.BODY
        )

        TText(
            text = "Description",
            style = TTextStyle.DESCRIPTION,
            textDecoration = TextDecoration.Underline
        )

        TText(
            text = "Error",
            style = TTextStyle.ERROR
        )
    }
}
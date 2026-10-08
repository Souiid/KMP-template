package com.souiid.mutiplatformtemplate.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.souiid.mutiplatformtemplate.ui.components.button.TButton
import com.souiid.mutiplatformtemplate.ui.components.button.TButtonType
import com.souiid.mutiplatformtemplate.ui.components.text.TText
import com.souiid.mutiplatformtemplate.ui.components.text.TTextStyle
import com.souiid.mutiplatformtemplate.ui.components.textfield.TTextField

@Composable
fun HomeScreen() {

    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }

    TScreen(verticalArrangement = Arrangement.Center) {
        TText(
            text = "Home",
            style = TTextStyle.TITLE
        )

        TTextField(
            value = name,
            onValueChange = { name = it },
            labelTitle = "Name"
        )

        TButton(
            text = "Primary",
            onClick = {}
        )

        TButton(
            text = "Refuse",
            type = TButtonType.REFUSE,
            onClick = {}
        )

        TButton(
            text = "Text",
            type = TButtonType.TEXT,
            isUnderlined = true,
            onClick = {}
        )
    }

}
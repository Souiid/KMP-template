package com.souiid.mutiplatformtemplate.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.ImeAction
import com.souiid.mutiplatformtemplate.ui.components.text.TText
import com.souiid.mutiplatformtemplate.ui.components.text.TTextStyle
import com.souiid.mutiplatformtemplate.ui.components.textfield.TTextField
import com.souiid.mutiplatformtemplate.ui.components.textfield.TTextFieldType

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

        TTextField(
            value = email,
            onValueChange = { email = it },
            labelTitle = "Email",
            type = TTextFieldType.EMAIL
        )

        TTextField(
            value = password,
            onValueChange = { password = it },
            labelTitle = "Password",
            type = TTextFieldType.PASSWORD,
            imeAction = ImeAction.Done
        )

        TTextField(
            value = description,
            onValueChange = { description = it },
            type = TTextFieldType.DESCRIPTION,
            placeholder = "Ajoutez une description ici !"
        )
    }

}
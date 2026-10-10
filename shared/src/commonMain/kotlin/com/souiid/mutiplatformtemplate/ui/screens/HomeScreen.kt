package com.souiid.mutiplatformtemplate.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.souiid.mutiplatformtemplate.ui.components.TScreen
import com.souiid.mutiplatformtemplate.ui.components.button.TButton
import com.souiid.mutiplatformtemplate.ui.components.text.TText
import com.souiid.mutiplatformtemplate.ui.components.text.TTextStyle
import com.souiid.mutiplatformtemplate.ui.components.textfield.TTextField
import com.souiid.mutiplatformtemplate.ui.theme.Dimens
import org.koin.compose.koinInject

@Composable
fun HomeScreen() {
    val viewModel: HomeViewModel = koinInject()
    val userName by viewModel.userName.collectAsState()
    var nameInput by remember { mutableStateOf("") }

    TScreen(verticalArrangement = Arrangement.Center) {
        TText(
            text = "Home",
            style = TTextStyle.TITLE
        )

        userName?.let {
            TText("Your actual name is : $it")
            Spacer(modifier = Modifier.size(Dimens.smallSpace))
        }

        TTextField(
            value = nameInput,
            onValueChange = { nameInput = it },
            labelTitle = "Name"
        )

        TButton(
            text = "Save",
            onClick = {
                viewModel.updateUserName(nameInput)
            }
        )
    }
}
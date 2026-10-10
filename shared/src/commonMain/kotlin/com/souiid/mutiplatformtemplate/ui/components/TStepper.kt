package com.souiid.mutiplatformtemplate.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.souiid.mutiplatformtemplate.ui.components.button.TButton
import com.souiid.mutiplatformtemplate.ui.components.text.TText

@Composable
fun TStepper(
    value: Int,
    maxValue: Int,
    minValue: Int,
    onMinusClick: () -> Unit,
    onPlusClick: () -> Unit
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        TButton(
            text = "-",
            onClick = {
                if (value > minValue) {
                    onMinusClick()
                }
            }
        )

        TText(
            text = value.toString(),
        )

        TButton(
            text = "+",
            onClick = {
                if (value < maxValue) {
                    onPlusClick()
                }
            }
        )
    }
}
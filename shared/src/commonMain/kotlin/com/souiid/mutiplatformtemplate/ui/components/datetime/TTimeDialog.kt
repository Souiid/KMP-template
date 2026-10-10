package com.souiid.mutiplatformtemplate.ui.components.datetime

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Dialog
import com.souiid.mutiplatformtemplate.ui.components.button.TButton
import com.souiid.mutiplatformtemplate.ui.components.text.TText
import com.souiid.mutiplatformtemplate.ui.components.text.TTextStyle
import com.souiid.mutiplatformtemplate.ui.theme.Dimens
import kotlinx.datetime.LocalTime

@Composable
fun TTimeDialog(
    selectedTime: LocalTime?,
    minTime: LocalTime = LocalTime(0, 0),
    maxTime: LocalTime = LocalTime(23, 50),
    minuteStep: Int = 10,
    onTimeSelected: (LocalTime) -> Unit,
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {

    Dialog(
        onDismissRequest = onDismiss
    ) {

        Surface(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(Dimens.largeRadius),
            color = MaterialTheme.colorScheme.surface
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(Dimens.largeSpace)
            ) {

                TText(
                    text = "Choisir une heure",
                    style = TTextStyle.SUBTITLE
                )

                Spacer(
                    modifier = Modifier.height(Dimens.mediumSpace)
                )

                TWheelTimePicker(
                    selectedTime = selectedTime,
                    minTime = minTime,
                    maxTime = maxTime,
                    minuteStep = minuteStep,
                    onTimeSelected = onTimeSelected
                )

                Spacer(
                    modifier = Modifier.height(Dimens.mediumSpace)
                )

                TButton(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Valider",
                    enabled = selectedTime != null,
                    onClick = onConfirm
                )
            }
        }
    }
}
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
import kotlinx.datetime.LocalDate

@Composable
fun TDateDialog(
    selectedDate: LocalDate?,
    minDate: LocalDate,
    maxDate: LocalDate,
    onDateSelected: (LocalDate) -> Unit,
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {

    Dialog(
        onDismissRequest = onDismiss
    ) {

        Surface(
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(Dimens.LARGE_RADIUS),
            color = MaterialTheme.colorScheme.surface
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(Dimens.LARGE_SPACE)
            ) {

                TText(
                    text = "Choisir une date",
                    style = TTextStyle.SUBTITLE
                )

                Spacer(
                    modifier = Modifier.height(Dimens.MEDIUM_SPACE)
                )

                TWheelDatePicker(
                    selectedDate = selectedDate,
                    minDate = minDate,
                    maxDate = maxDate,
                    onDateSelected = onDateSelected
                )

                Spacer(
                    modifier = Modifier.height(Dimens.LARGE_SPACE)
                )

                TButton(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Continuer",
                    enabled = selectedDate != null,
                    onClick = onConfirm
                )
            }
        }
    }
}
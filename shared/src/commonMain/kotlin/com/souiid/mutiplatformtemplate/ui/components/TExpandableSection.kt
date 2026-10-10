package com.souiid.mutiplatformtemplate.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.souiid.mutiplatformtemplate.ui.components.text.TText

@Composable
fun TExpandableSections(
    sectionTitles: List<String>,
    sectionContent: @Composable (Int) -> Unit
) {

    LazyColumn {

        items(sectionTitles.size) { index ->

            ExpandableSectionItem(
                title = sectionTitles[index]
            ) {
                sectionContent(index)
            }
        }
    }
}

@Composable
fun ExpandableSectionItem(
    title: String,
    content: @Composable () -> Unit
) {

    var expanded by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                expanded = !expanded
            }
            .padding(12.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            TText(title,)

            TText(
                if (expanded) "▲" else "▼",
            )
        }

        if (expanded) {

            Spacer(modifier = Modifier.height(12.dp))

            content()
        }
    }
}
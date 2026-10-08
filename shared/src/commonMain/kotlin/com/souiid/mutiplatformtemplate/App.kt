package com.souiid.mutiplatformtemplate

import androidx.compose.runtime.Composable
import com.souiid.mutiplatformtemplate.ui.navigation.AppNavigation
import com.souiid.mutiplatformtemplate.ui.theme.AppTheme

@Composable
fun App() {
    AppTheme {
        AppNavigation()
    }
}
package com.example.mdeliveryapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = primaryColor,
    onPrimary = Color.White,
    background =  backgroundDark,
    onBackground = Color.White,
    surface = surfaceBlack,
    onSecondary = Color.White
)

private val LightColorPalette = lightColors(
    primary = primaryColor,
   onPrimary = Color.White,
    background = Color.White,
    onBackground = black,
    surface = Color.White,
    onSurface = black
)

@Composable
fun MDeliveryAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
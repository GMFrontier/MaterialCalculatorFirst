package com.gmfrontier.materialcalculatorfirst

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.gmfrontier.materialcalculatorfirst.presentation.CalculatorScreen
import com.gmfrontier.materialcalculatorfirst.ui.theme.MaterialCalculatorFirstTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialCalculatorFirstTheme {
                // A surface container using the 'background' color from the theme
                Constants.BASE_URL
                CalculatorScreen()
            }
        }
    }
}
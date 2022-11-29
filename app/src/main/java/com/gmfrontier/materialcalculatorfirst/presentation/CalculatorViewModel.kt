package com.gmfrontier.materialcalculatorfirst.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.gmfrontier.materialcalculatorfirst.domain.CalculatorAction
import com.gmfrontier.materialcalculatorfirst.domain.ExpressionWriter

class CalculatorViewModel(
    private val writer: ExpressionWriter = ExpressionWriter()
) : ViewModel() {
    var expression: String by mutableStateOf("")
        private set

    fun onAction(action: CalculatorAction){
        writer.processAction(action)
        this.expression = writer.expression
    }
}
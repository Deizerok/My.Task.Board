package com.example.mytaskboard.core.presentation

interface UiUpdate<T : Any> {

    fun updateUi(value: T)
}
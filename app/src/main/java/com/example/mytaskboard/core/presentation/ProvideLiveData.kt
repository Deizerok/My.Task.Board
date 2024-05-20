package com.example.mytaskboard.core.presentation

import androidx.lifecycle.LiveData

interface ProvideLiveData<T : Any> {

    fun liveData(): LiveData<T>
}
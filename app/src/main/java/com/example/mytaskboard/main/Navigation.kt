package com.example.mytaskboard.main

import com.example.mytaskboard.core.presentation.UiUpdate
import com.example.mytaskboard.core.presentation.ProvideLiveData
import com.example.mytaskboard.core.presentation.LiveDataWrapper
import javax.inject.Inject
import javax.inject.Singleton

interface Navigation {

    interface Navigate : UiUpdate<Screen>

    interface Read : ProvideLiveData<Screen>

    interface Mutable : Navigate, Read

    @Singleton
    class Base @Inject constructor(): Mutable, LiveDataWrapper.Single<Screen>()
}
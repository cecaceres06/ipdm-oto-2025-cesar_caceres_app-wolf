package com.example.woof.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Dog(
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int,
    @DrawableRes val imageResourceId: Int
)

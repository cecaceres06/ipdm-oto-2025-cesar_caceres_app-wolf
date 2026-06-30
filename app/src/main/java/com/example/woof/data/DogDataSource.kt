package com.example.woof.data

import com.example.woof.R
import com.example.woof.model.Dog

object DogDataSource {
    val dogs = listOf(
        Dog(R.string.dog_name_1, 2, R.string.dog_hobby_1, R.drawable.dog_1),
        Dog(R.string.dog_name_2, 1, R.string.dog_hobby_2, R.drawable.dog_2),
        Dog(R.string.dog_name_3, 4, R.string.dog_hobby_3, R.drawable.dog_3),
        Dog(R.string.dog_name_4, 1, R.string.dog_hobby_4, R.drawable.dog_4),
        Dog(R.string.dog_name_5, 5, R.string.dog_hobby_5, R.drawable.dog_5),
        Dog(R.string.dog_name_6, 3, R.string.dog_hobby_6, R.drawable.dog_6),
        Dog(R.string.dog_name_7, 1, R.string.dog_hobby_7, R.drawable.dog_7),
        Dog(R.string.dog_name_8, 6, R.string.dog_hobby_8, R.drawable.dog_8)
    )
}

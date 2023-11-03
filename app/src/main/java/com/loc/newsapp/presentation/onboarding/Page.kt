package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "Informasi Terpercaya",
        description = "Kabarin memberikan Anda akses ke berita terbaru dari seluruh dunia dengan kualitas terbaik dalam industri percetakan dan penyusunan tata letak.",

        image = R.drawable.onboarding1
    ),
    Page(
        title = "Menginspirasi dengan Informasi",
        description = "Kabarin memberikan wawasan mendalam melalui berita berkualitas tinggi dari seluruh dunia, menginspirasi Anda dalam setiap bacaan.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Terhubung dengan Dunia",
        description = "Kabarin menghadirkan berita pilihan dari seluruh dunia dalam tampilan yang berkelas, menjadikan Anda terhubung dengan informasi terbaru dengan gaya yang unik.",
        image = R.drawable.onboarding3
    )
)
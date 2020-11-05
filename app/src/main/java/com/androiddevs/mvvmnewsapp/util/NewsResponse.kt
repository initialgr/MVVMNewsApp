package com.androiddevs.mvvmnewsapp.util

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)
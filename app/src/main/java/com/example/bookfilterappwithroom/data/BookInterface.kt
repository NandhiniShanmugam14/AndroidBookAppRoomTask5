package com.example.bookfilterappwithroom.data

import com.example.bookfilterappwithroom.data.AllBooks
import retrofit2.http.GET

interface BookInterface {
    @GET("/books")
    suspend fun getBooks():List<AllBooks>
}
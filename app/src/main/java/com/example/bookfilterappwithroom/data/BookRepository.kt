package com.example.bookfilterappwithroom.data

import androidx.lifecycle.LiveData

class BookRepository(private val bookDao: BookDao) {
    val readAllBooks: LiveData<List<Book>> = bookDao.readAllBooks()

    fun getBooksByAuthor(author:String):LiveData<List<Book>>
    {
        return bookDao.readBooks(author)
    }

    fun addBook(book: Book)
    {
        bookDao.addBook(book)
    }

    fun addAuthor(author: Author)
    {
        bookDao.addAuthor(author)
    }

}
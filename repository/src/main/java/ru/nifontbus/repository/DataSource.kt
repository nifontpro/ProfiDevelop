package ru.nifontbus.repository

interface DataSource<T> {
    suspend fun getData(word: String): T
}

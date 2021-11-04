package ru.nifontbus.profidevelop.model.datasource

interface DataSource<T> {
    suspend fun getData(word: String): T
}

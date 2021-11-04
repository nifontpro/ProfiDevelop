package ru.nifontbus.profidevelop.model.repository

interface Repository<T> {

    suspend fun getData(word: String): T
}

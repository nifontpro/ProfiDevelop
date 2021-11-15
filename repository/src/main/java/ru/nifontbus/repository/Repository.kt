package ru.nifontbus.repository

interface Repository<T> {

    suspend fun getData(word: String): T
}

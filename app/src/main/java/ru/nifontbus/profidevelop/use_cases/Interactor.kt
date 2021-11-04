package ru.nifontbus.profidevelop.use_cases

interface Interactor<T> {
    suspend fun getData(word: String, fromRemoteSource: Boolean): T
}

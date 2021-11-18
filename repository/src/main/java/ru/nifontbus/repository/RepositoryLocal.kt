package ru.nifontbus.repository

import ru.nifontbus.model.data.AppState

interface RepositoryLocal<T> : Repository<T> {

    suspend fun saveToDB(appState: AppState)
}

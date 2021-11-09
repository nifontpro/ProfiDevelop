package ru.nifontbus.profidevelop.model.datasource

import ru.nifontbus.profidevelop.model.data.AppState

interface DataSourceLocal<T> : DataSource<T> {

    suspend fun saveToDB(appState: AppState)
}
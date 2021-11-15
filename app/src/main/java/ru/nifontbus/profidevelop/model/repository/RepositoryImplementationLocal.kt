package ru.nifontbus.profidevelop.model.repository

import ru.nifontbus.model.data.AppState
import ru.nifontbus.model.data.DataModel
import ru.nifontbus.profidevelop.model.datasource.DataSourceLocal


class RepositoryImplementationLocal(private val dataSource: DataSourceLocal<List<DataModel>>) :
    RepositoryLocal<List<DataModel>> {

    override suspend fun getData(word: String): List<DataModel> {
        return dataSource.getData(word)
    }

    override suspend fun saveToDB(appState: AppState) {
        dataSource.saveToDB(appState)
    }
}

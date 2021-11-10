package ru.nifontbus.profidevelop.model.datasource

import ru.nifontbus.profidevelop.model.data.AppState
import ru.nifontbus.profidevelop.model.data.DataModel
import ru.nifontbus.profidevelop.room.HistoryDao
import ru.nifontbus.profidevelop.utils.convertDataModelSuccessToEntity
import ru.nifontbus.profidevelop.utils.mapHistoryEntityToSearchResult

class RoomDataBaseImplementation(private val historyDao: HistoryDao) :
    DataSourceLocal<List<DataModel>> {

    override suspend fun getData(word: String): List<DataModel> {
        return mapHistoryEntityToSearchResult(historyDao.all())
    }

    override suspend fun saveToDB(appState: AppState) {
        convertDataModelSuccessToEntity(appState)?.let {
            historyDao.insert(it)
        }
    }
}

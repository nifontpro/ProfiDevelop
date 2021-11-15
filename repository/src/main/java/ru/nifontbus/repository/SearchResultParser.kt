package ru.nifontbus.repository

import ru.nifontbus.model.data.AppState
import ru.nifontbus.model.data.DataModel

fun mapHistoryEntityToSearchResult(list: List<ru.nifontbus.repository.room.HistoryEntity>): List<DataModel> {
    val searchResult = ArrayList<DataModel>()
    if (!list.isNullOrEmpty()) {
        for (entity in list) {
            searchResult.add(DataModel(entity.word, null))
        }
    }
    return searchResult
}

fun convertDataModelSuccessToEntity(appState: AppState): ru.nifontbus.repository.room.HistoryEntity? {
    return when (appState) {
        is AppState.Success -> {
            val searchResult = appState.data
            if (searchResult.isNullOrEmpty() || searchResult[0].text.isNullOrEmpty()) {
                null
            } else {
                ru.nifontbus.repository.room.HistoryEntity(searchResult[0].text!!, null)
            }
        }
        else -> null
    }
}
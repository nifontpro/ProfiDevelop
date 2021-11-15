package ru.nifontbus.profidevelop.view.main

import ru.nifontbus.model.data.AppState
import ru.nifontbus.model.data.DataModel
import ru.nifontbus.repository.room.Repository
import ru.nifontbus.repository.room.RepositoryLocal
import ru.nifontbus.profidevelop.use_cases.Interactor

class MainInteractor(
    private val repositoryRemote: ru.nifontbus.repository.room.Repository<List<DataModel>>,
    private val repositoryLocal: ru.nifontbus.repository.room.RepositoryLocal<List<DataModel>>
) : Interactor<AppState> {

    override suspend fun getData(word: String, fromRemoteSource: Boolean): AppState {
        val appState: AppState
        if (fromRemoteSource) {
            appState = AppState.Success(repositoryRemote.getData(word))
            repositoryLocal.saveToDB(appState)
        } else {
            appState = AppState.Success(repositoryLocal.getData(word))
        }
        return appState
    }
}
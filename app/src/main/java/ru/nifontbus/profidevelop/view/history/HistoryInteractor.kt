package ru.nifontbus.profidevelop.view.history

import ru.nifontbus.model.data.AppState
import ru.nifontbus.model.data.DataModel
import ru.nifontbus.repository.room.Repository
import ru.nifontbus.repository.room.RepositoryLocal
import ru.nifontbus.profidevelop.use_cases.Interactor

class HistoryInteractor(
    private val repositoryRemote: ru.nifontbus.repository.room.Repository<List<DataModel>>,
    private val repositoryLocal: ru.nifontbus.repository.room.RepositoryLocal<List<DataModel>>
) : Interactor<AppState> {

    override suspend fun getData(word: String, fromRemoteSource: Boolean): AppState {
        return AppState.Success(
            if (fromRemoteSource) {
                repositoryRemote
            } else {
                repositoryLocal
            }.getData(word)
        )
    }
}

package ru.nifontbus.profidevelop.view.main

import ru.nifontbus.profidevelop.model.data.AppState
import ru.nifontbus.profidevelop.model.data.DataModel
import ru.nifontbus.profidevelop.model.repository.Repository
import ru.nifontbus.profidevelop.use_cases.Interactor

class MainInteractor(
    private val repositoryRemote: Repository<List<DataModel>>,
    private val repositoryLocal: Repository<List<DataModel>>
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

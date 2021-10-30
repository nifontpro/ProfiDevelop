package ru.nifontbus.profidevelop.view.main

import io.reactivex.Observable
import ru.nifontbus.profidevelop.di.NAME_LOCAL
import ru.nifontbus.profidevelop.di.NAME_REMOTE
import ru.nifontbus.profidevelop.model.data.AppState
import ru.nifontbus.profidevelop.model.data.DataModel
import ru.nifontbus.profidevelop.model.repository.Repository
import ru.nifontbus.profidevelop.use_cases.Interactor
import javax.inject.Inject
import javax.inject.Named

class MainInteractor @Inject constructor(
    @Named(NAME_REMOTE) val repositoryRemote: Repository<List<DataModel>>,
    @Named(NAME_LOCAL) val repositoryLocal: Repository<List<DataModel>>
) : Interactor<AppState> {

    override fun getData(word: String, fromRemoteSource: Boolean): Observable<AppState> {
        return if (fromRemoteSource) {
            repositoryRemote
        } else {
            repositoryLocal
        }.getData(word).map { AppState.Success(it) }
    }
}

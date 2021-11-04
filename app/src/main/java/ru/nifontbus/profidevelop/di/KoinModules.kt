package ru.nifontbus.profidevelop.di

import org.koin.core.qualifier.named
import org.koin.dsl.module
import ru.nifontbus.profidevelop.model.data.DataModel
import ru.nifontbus.profidevelop.model.datasource.RetrofitImplementation
import ru.nifontbus.profidevelop.model.datasource.RoomDataBaseImplementation
import ru.nifontbus.profidevelop.model.repository.Repository
import ru.nifontbus.profidevelop.model.repository.RepositoryImplementation
import ru.nifontbus.profidevelop.view.main.MainInteractor
import ru.nifontbus.profidevelop.view.main.MainViewModel

val application = module {
    single<Repository<List<DataModel>>>(named(NAME_REMOTE)) { RepositoryImplementation(
        RetrofitImplementation()
    ) }
    single<Repository<List<DataModel>>>(named(NAME_LOCAL)) { RepositoryImplementation(
        RoomDataBaseImplementation()
    ) }
}

val mainScreen = module {
    factory { MainInteractor(get(named(NAME_REMOTE)), get(named(NAME_LOCAL))) }
    factory { MainViewModel(get()) }
}

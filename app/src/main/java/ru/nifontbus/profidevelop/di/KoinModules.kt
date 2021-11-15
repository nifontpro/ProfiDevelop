package ru.nifontbus.profidevelop.di

import androidx.room.Room
import org.koin.dsl.module
import ru.nifontbus.model.data.DataModel
import ru.nifontbus.profidevelop.view.history.HistoryInteractor
import ru.nifontbus.profidevelop.view.history.HistoryViewModel
import ru.nifontbus.profidevelop.view.main.MainInteractor
import ru.nifontbus.profidevelop.view.main.MainViewModel
import ru.nifontbus.repository.*
import ru.nifontbus.repository.room.HistoryDataBase

val application = module {
    single { Room.databaseBuilder(get(), HistoryDataBase::class.java, "HistoryDB").build() }
    single { get<HistoryDataBase>().historyDao() }
    single<Repository<List<DataModel>>> { RepositoryImplementation(RetrofitImplementation()) }
    single<RepositoryLocal<List<DataModel>>> { RepositoryImplementationLocal(RoomDataBaseImplementation(get()))
    }
}

val mainScreen = module {
    factory { MainViewModel(get()) }
    factory { MainInteractor(get(), get()) }
}

val historyScreen = module {
    factory { HistoryViewModel(get()) }
    factory { HistoryInteractor(get(), get()) }
}

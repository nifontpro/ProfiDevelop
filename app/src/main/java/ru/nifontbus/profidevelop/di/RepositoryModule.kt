package ru.nifontbus.profidevelop.di

import dagger.Module
import dagger.Provides
import ru.nifontbus.profidevelop.di.NAME_LOCAL
import ru.nifontbus.profidevelop.di.NAME_REMOTE
import ru.nifontbus.profidevelop.model.data.DataModel
import ru.nifontbus.profidevelop.model.datasource.DataSource
import ru.nifontbus.profidevelop.model.datasource.RetrofitImplementation
import ru.nifontbus.profidevelop.model.datasource.RoomDataBaseImplementation
import ru.nifontbus.profidevelop.model.repository.Repository
import ru.nifontbus.profidevelop.model.repository.RepositoryImplementation
import javax.inject.Named
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    @Named(NAME_REMOTE)
    internal fun provideRepositoryRemote(@Named(NAME_REMOTE) dataSourceRemote: DataSource<List<DataModel>>): Repository<List<DataModel>> =
        RepositoryImplementation(dataSourceRemote)

    @Provides
    @Singleton
    @Named(NAME_LOCAL)
    internal fun provideRepositoryLocal(@Named(NAME_LOCAL) dataSourceLocal: DataSource<List<DataModel>>): Repository<List<DataModel>> =
        RepositoryImplementation(dataSourceLocal)

    @Provides
    @Singleton
    @Named(NAME_REMOTE)
    internal fun provideDataSourceRemote(): DataSource<List<DataModel>> =
        RetrofitImplementation()

    @Provides
    @Singleton
    @Named(NAME_LOCAL)
    internal fun provideDataSourceLocal(): DataSource<List<DataModel>> =
        RoomDataBaseImplementation()
}

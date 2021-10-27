package ru.nifontbus.profidevelop.model.repository

import io.reactivex.Observable
import ru.nifontbus.profidevelop.model.data.DataModel
import ru.nifontbus.profidevelop.model.datasource.DataSource
import ru.nifontbus.profidevelop.model.repository.Repository

class RepositoryImplementation(private val dataSource: DataSource<List<DataModel>>) :
    Repository<List<DataModel>> {
    // Репозиторий возвращает данные, используя dataSource (локальный или
    // внешний)
    override fun getData(word: String): Observable<List<DataModel>> {
        return dataSource.getData(word)
    }
}

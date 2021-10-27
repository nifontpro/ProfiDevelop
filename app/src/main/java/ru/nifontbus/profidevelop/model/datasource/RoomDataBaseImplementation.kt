package ru.nifontbus.profidevelop.model.datasource

import io.reactivex.Observable
import ru.nifontbus.profidevelop.model.data.DataModel
import ru.nifontbus.profidevelop.model.datasource.DataSource

class RoomDataBaseImplementation : DataSource<List<DataModel>> {

    override fun getData(word: String): Observable<List<DataModel>> {
        TODO("not implemented") // To change body of created functions use File
        // | Settings | File Templates.
    }
}

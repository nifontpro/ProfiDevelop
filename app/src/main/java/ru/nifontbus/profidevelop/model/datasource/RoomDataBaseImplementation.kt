package ru.nifontbus.profidevelop.model.datasource

import ru.nifontbus.profidevelop.model.data.DataModel

class RoomDataBaseImplementation : DataSource<List<DataModel>> {

    override suspend fun getData(word: String): List<DataModel> {
        TODO("not implemented") // To change body of created functions use File
        // | Settings | File Templates.
    }
}

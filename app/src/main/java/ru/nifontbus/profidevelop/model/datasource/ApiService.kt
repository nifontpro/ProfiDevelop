package ru.nifontbus.profidevelop.model.datasource

import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query
import ru.nifontbus.model.data.DataModel

interface ApiService {

    @GET("words/search")
    // Обратите внимание, что метод теперь возвращает Deferred
    fun searchAsync(@Query("search") wordToSearch: String): Deferred<List<DataModel>>
}

package ru.nifontbus.profidevelop.presenter

import ru.nifontbus.profidevelop.view.base.BaseView
import ru.nifontbus.profidevelop.model.data.AppState

// На уровень выше находится презентер, который уже ничего не знает ни о контексте, ни о фреймворке
interface Presenter<T : AppState, V : BaseView> {

    fun attachView(view: V)

    fun detachView(view: V)
    // Получение данных с флагом isOnline(из Интернета или нет)
    fun getData(word: String, isOnline: Boolean)
}

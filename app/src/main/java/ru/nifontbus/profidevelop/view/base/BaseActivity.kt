package ru.nifontbus.profidevelop.view.base

import androidx.appcompat.app.AppCompatActivity
import ru.nifontbus.profidevelop.model.data.AppState

abstract class BaseActivity<T : AppState> : AppCompatActivity() {

    // В каждой Активити будет своя ViewModel, которая наследуется от BaseViewModel
    abstract val viewModel: BaseViewModel<T>

    // Каждая Активити будет отображать какие-то данные в соответствующем состоянии
    abstract fun renderData(appState: T)
}

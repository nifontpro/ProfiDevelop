object Config {
    const val application_id = "ru.nifontbus.profidevelop"
    const val compile_sdk = 31
    const val min_sdk = 26
    const val target_sdk = 31
}

object Releases {
    const val version_code = 1
    const val version_name = "1.0"
}

object Modules {
    const val app = ":app"
    const val core = ":core"
    const val model = ":model"
    const val repository = ":repository"
    const val utils = ":utils"

    //Features
    const val historyScreen = ":historyScreen"
}

object Versions {
    //Design
    const val appcompat = "1.3.1"
    const val material = "1.4.0"
    const val constraintLayout = "2.1.1"
    const val swiperefreshLayout = "1.1.0"

    //Kotlin
    const val core = "1.7.0"
    const val stdlib = "1.5.31"
    const val coroutinesCore = "1.5.2"
    const val coroutinesAndroid = "1.5.2"

    //Retrofit
    const val retrofit = "2.9.0"
    const val converterGson = "2.9.0"
    const val interceptor = "5.0.0-alpha.2"
    const val adapterCoroutines = "0.9.2"

    //Koin
    const val koin = "3.1.3"

    //Coil
    const val coil = "1.4.0"

    //Room
    const val room = "2.3.0"

    //Test
    const val testExt = "1.1.3"
    const val espresso = "3.4.0"
}

object Design {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val swiperefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swiperefreshLayout}"
}

object Kotlin {
    const val core = "androidx.core:core-ktx:${Versions.core}"
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.stdlib}"
    const val coroutines_core =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesCore}"
    const val coroutines_android =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesAndroid}"
}

object Retrofit {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val converter_gson = "com.squareup.retrofit2:converter-gson:${Versions.converterGson}"
    const val adapter_coroutines =
        "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.adapterCoroutines}"
    const val logging_interceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.interceptor}"
}

object Koin {
    const val koin_android = "io.insert-koin:koin-android:${Versions.koin}"
    const val koin_compat = "io.insert-koin:koin-android-compat:${Versions.koin}"
    const val koin_workmanager = "io.insert-koin:koin-androidx-workmanager:${Versions.koin}"
    const val koin_navigation = "io.insert-koin:koin-androidx-navigation:${Versions.koin}"
}

object Coil {
    const val coil = "io.coil-kt:coil:${Versions.coil}"
}

object Room {
    const val runtime = "androidx.room:room-runtime:${Versions.room}"
    const val room_ktx = "androidx.room:room-ktx:${Versions.room}"
    const val compiler = "androidx.room:room-compiler:${Versions.room}"
}

object TestImpl {
    const val junit = "junit:junit:"
    const val runner = "androidx.test.ext:junit:${Versions.testExt}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}
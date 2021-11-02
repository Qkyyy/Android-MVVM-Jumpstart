
object Versions {
    const val kotlinVersion = "1.5.31"
    const val gradleVersion = "7.2.0-alpha03"
    const val coreKtxVersion = "1.7.0"
    const val appCompatVersion = "1.3.1"
    const val materialVersion = "1.4.0"
    const val constraintLayoutVersion = "2.1.1"
    const val liveDataKtxVersion = "2.4.0"
    const val viewModelKtxVersion = "2.4.0"
    const val junitVersion = "4.13.2"
    const val extJunitVersion = "1.1.3"
    const val espressoCoreVersion = "3.4.0"
    const val navigationVersion = "2.3.5"
}

object BuildPlugins {
    const val androidApplicationPlugin = "com.android.application"
    const val kotlinAndroidPlugin = "kotlin-android"
    const val safeArgsPlugin = "androidx.navigation.safeargs"
}

object Dependencies {
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
    const val material = "com.google.android.material:material:${Versions.materialVersion}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.liveDataKtxVersion}"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewModelKtxVersion}"
    const val junit = "junit:junit:${Versions.junitVersion}"
    const val extJunit = "androidx.test.ext:junit:${Versions.extJunitVersion}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCoreVersion}"
    const val buildGradle = "com.android.tools.build:gradle:${Versions.gradleVersion}"
    const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    const val navFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
    const val navUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"
    const val navSafeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigationVersion}"
}
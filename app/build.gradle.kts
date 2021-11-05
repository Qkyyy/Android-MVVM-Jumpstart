plugins {
    id(BuildPlugins.androidApplicationPlugin)
    id(BuildPlugins.kotlinAndroidPlugin)
    kotlin("kapt")
    id(BuildPlugins.safeArgsPlugin)
    id(BuildPlugins.hiltPlugin)
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.qky.mvvmjumpstart"
        minSdk = 21
        targetSdk = 30
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    buildFeatures {
        viewBinding = true
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(Dependencies.kotlinStdLib)
    implementation(Dependencies.ktxCore)
    implementation(Dependencies.appCompat)
    implementation(Dependencies.material)
    implementation(Dependencies.constraintLayout)
    implementation(Dependencies.liveData)
    implementation(Dependencies.viewModel)
    implementation(Dependencies.navFragment)
    implementation(Dependencies.navUiKtx)
    implementation(Dependencies.hilt)
    implementation(Dependencies.hiltNavFragment)
    implementation(Dependencies.corbind)
    implementation(Dependencies.corbindActivity)
    implementation(Dependencies.corbindCore)
    implementation(Dependencies.corbindLifecycle)
    implementation(Dependencies.corbindNavigation)
    implementation(Dependencies.corbindRecyclerView)
    implementation(Dependencies.corbindSwipeRefresh)
    implementation(Dependencies.corbindMaterial)
    debugImplementation(Dependencies.leakCanary)
    debugImplementation(Dependencies.timber)
    kapt(Dependencies.hiltCompiler)
    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.extJunit)
    androidTestImplementation(Dependencies.espressoCore)
}

kapt {
    correctErrorTypes = true
}
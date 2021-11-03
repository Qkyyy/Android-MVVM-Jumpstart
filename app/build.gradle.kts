plugins {
    id(BuildPlugins.androidApplicationPlugin)
    id(BuildPlugins.kotlinAndroidPlugin)
    kotlin("kapt")
    id(BuildPlugins.safeArgsPlugin)
    id(BuildPlugins.hiltPlugin)
}

android {
    compileSdkVersion(31)

    defaultConfig {
        applicationId = "com.qky.mvvmjumpstart"
        minSdkVersion(21)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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
    kapt(Dependencies.hiltCompiler)
    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.extJunit)
    androidTestImplementation(Dependencies.espressoCore)
}

kapt {
    correctErrorTypes = true
}
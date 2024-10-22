plugins {
  id("com.android.dynamic-feature")
  id("kotlin-android")
  id("kotlin-kapt")
}

android {
  namespace = "com.example.mvvmtemplate.feature.home"
  compileSdk = 33

  defaultConfig {
    minSdk = 24
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }

  kotlinOptions {
    jvmTarget = "1.8"
  }

  buildFeatures {
    viewBinding = true
  }
}

dependencies {
  implementation(project(":app"))
  implementation(project(":core"))
  
  // Dagger 2
  implementation("com.google.dagger:dagger:2.45")
  kapt("com.google.dagger:dagger-compiler:2.45")
}
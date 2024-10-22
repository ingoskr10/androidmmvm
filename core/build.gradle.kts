plugins {
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
}

android {
  namespace = "com.example.mvvmtemplate.core"
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
}

dependencies {
  // Core dependencies shared across modules
  api("androidx.core:core-ktx:1.10.1")
  api("androidx.appcompat:appcompat:1.6.1")
  api("com.google.android.material:material:1.9.0")

  // Dagger 2
  api("com.google.dagger:dagger:2.45")
  kapt("com.google.dagger:dagger-compiler:2.45")

  // Room
  api("androidx.room:room-runtime:2.5.1")
  api("androidx.room:room-ktx:2.5.1")
  kapt("androidx.room:room-compiler:2.5.1")

  // Volley
  api("com.android.volley:volley:1.2.1")
}
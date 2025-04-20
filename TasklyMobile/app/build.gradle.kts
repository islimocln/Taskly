plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.androidproject"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.androidproject"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        compose = true
    }
}

dependencies {

    // AndroidX Core KTX for modern Android APIs
    implementation(libs.androidx.core.ktx)

    // Android Lifecycle KTX for lifecycle-aware components
    implementation(libs.androidx.lifecycle.runtime.ktx)

    // Activity Compose support for Jetpack Compose
    implementation(libs.androidx.activity.compose)

    // AndroidX Compose BOM (Bill of Materials)
    implementation(platform(libs.androidx.compose.bom))

    // Jetpack Compose UI library
    implementation(libs.androidx.ui)

    // Jetpack Compose Graphics library
    implementation(libs.androidx.ui.graphics)

    // Jetpack Compose Tooling for preview
    implementation(libs.androidx.ui.tooling.preview)

    // Material 3 Design Components for Compose
    implementation(libs.androidx.material3)

    // Unit testing with JUnit
    testImplementation(libs.junit)

    // Android test dependencies
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
      // Jetpack Compose için gerekli bağımlılıklar
    implementation("androidx.compose.ui:ui:1.0.0")
    implementation("androidx.compose.material3:material3:1.0.0")
    implementation("androidx.compose.ui:ui-tooling-preview:1.0.0")
    implementation("androidx.activity:activity-compose:1.3.1")
    // Test bağımlılıkları
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.0.0")

    // Debug dependencies for Compose tooling
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}

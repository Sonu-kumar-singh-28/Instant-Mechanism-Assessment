🚗 Instant Mechanic

A modern Android mini service-booking application built for the Instant Mechanic Android Development Internship Assignment.

The app allows users to discover nearby mechanics, view garage details, and submit a vehicle service request through a clean Jetpack Compose UI.

✨ Features

🔎 Search mechanics by garage name, location, or service

⭐ Display mechanic ratings

📍 Show location and distance

🟢 Open / 🔴 Closed status

🛠️ Display available services

🕒 Working hours

📞 Mechanic contact number

📋 Mechanic details screen

🚘 Service request form

✅ Request submission confirmation

🌐 REST API integration using Retrofit

🔄 Loading state handling

⚠️ API/network error handling with Retry

🧩 MVVM architecture

💉 Hilt dependency injection

🎨 Jetpack Compose modern UI

🛠️ Tech Stack

Technology

Usage

Kotlin

Primary programming language

Jetpack Compose

UI development

Material 3

UI components and styling

MVVM

Application architecture

Retrofit

REST API communication

Gson

JSON parsing

Kotlin Coroutines

Asynchronous operations

StateFlow

UI state management

Hilt

Dependency Injection

Navigation Compose

Screen navigation

Git & GitHub

Version control

🏗️ Architecture

The application follows an MVVM-oriented structure with separated data and presentation layers.

com.manage.services.instantmechanic
│
├── data
│   ├── local
│   ├── model
│   │   ├── Mechanic.kt
│   │   └── ServiceRequest.kt
│   ├── remote
│   │   └── MechanicApi.kt
│   └── repository
│       └── MechanicRepository.kt
│
├── navigation
│   └── AppNavigation.kt
│
├── presentation
│   ├── home
│   │   ├── HomeScreen.kt
│   │   ├── HomeUiState.kt
│   │   └── HomeViewModel.kt
│   ├── details
│   │   └── MechanicDetailsScreen.kt
│   └── request
│       └── RequestServiceScreen.kt
│
├── ui.theme
│
├── InstantMechanicApplication.kt
└── MainActivity.kt

Data Flow

UI (Jetpack Compose)
        ↓
   ViewModel
        ↓
   Repository
        ↓
   Retrofit API
        ↓
   REST API / JSON

The ViewModel exposes UI state through StateFlow. The Repository handles data retrieval and converts failures into Result, allowing the UI to show loading, success, empty, and error states.

🌐 API Integration

The application consumes mechanic data through a REST API using Retrofit.

Base URL:

https://dummyjson.com/

Endpoint:

GET /c/a860-6359-4537-bb91

The API returns mechanic data in JSON format. Gson is used by Retrofit to convert the JSON response into Kotlin Mechanic objects.

Note: The custom DummyJSON endpoint is used as the assignment's mock REST API and may expire according to the service's endpoint lifetime.

📱 App Flow

Home
  ↓
Select Mechanic
  ↓
Mechanic Details
  ↓
Request Service
  ↓
Fill Service Form
  ↓
Submit
  ↓
Confirmation

📸 Screenshots

Home Screen



The home screen displays nearby mechanics with rating, distance, location, available services, working hours, and open/closed status.

Project Structure



The project is organized into data, navigation, presentation, and theme packages.

Error Handling



The application displays a user-friendly error state with a Retry action when mechanic data cannot be loaded.

⚙️ Setup & Run

1. Clone the repository

git clone <YOUR_GITHUB_REPOSITORY_URL>

2. Open the project

Open the project in Android Studio.

3. Sync Gradle

Allow Android Studio to complete Gradle synchronization and dependency downloads.

4. Run the application

Connect an Android device or start an emulator, then click Run ▶.

Requirements

Android Studio

JDK 17

Android SDK

Internet connection for REST API requests

🔐 Permissions

The application requires internet access for REST API communication.

<uses-permission android:name="android.permission.INTERNET" />

🧠 Assumptions

Mechanic information is provided by a mock REST API for the assignment.

Service request submission currently demonstrates the requested confirmation flow locally; no real booking/payment backend is required by the assignment.

Distance and mechanic availability are represented by the provided mock data.

🚀 Additional Features

Search across mechanic name, location, and services

Clean and responsive Compose UI

Retry action for API failures

Separation of Repository, ViewModel, and UI responsibilities

Dependency Injection with Hilt

State-based UI rendering for loading, error, empty, and success states

📋 Assignment Coverage

Requirement

Status

Home Screen

✅

Mechanic Details

✅

Request Service Form

✅

REST API Integration

✅

JSON Parsing

✅

Loading State

✅

Error Handling

✅

API Data Display

✅

Kotlin

✅

Jetpack Compose

✅

MVVM

✅

Search / Filter

✅

Dependency Injection

✅

Good UI/UX

✅

👨‍💻 Developer

Sonu Kumar Singh
Native Android Developer | Kotlin | Jetpack Compose | KMP

Built as part of an Android Development Internship Assignment.

⭐ If you find this project useful, consider giving the repository a star.

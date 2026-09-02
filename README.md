# 🚗 Instant Mechanic

A modern Android mini service-booking application built for the **Instant Mechanic Android Development Internship Assignment**.

The application allows users to discover nearby mechanics, view garage details, and submit a vehicle service request through a clean and modern Jetpack Compose interface.

---

## ✨ Features

- 🔎 Search mechanics by garage name, location, or service
- ⭐ Display mechanic ratings
- 📍 Show mechanic location and distance
- 🟢 Open / 🔴 Closed status
- 🛠️ Display available services
- 🕒 Working hours
- 📞 Mechanic contact information
- 📋 Mechanic details screen
- 🚘 Service request form
- ✅ Service request confirmation
- 🌐 REST API integration using Retrofit
- 🔄 Loading state handling
- ⚠️ Error handling with Retry option
- 🧩 MVVM architecture
- 💉 Hilt dependency injection
- 🎨 Modern Jetpack Compose UI

---

## 🛠️ Tech Stack

| Technology | Usage |
|---|---|
| Kotlin | Primary programming language |
| Jetpack Compose | UI development |
| Material 3 | UI components |
| MVVM | Application architecture |
| Retrofit | REST API communication |
| Gson | JSON parsing |
| Kotlin Coroutines | Asynchronous operations |
| StateFlow | UI state management |
| Hilt | Dependency Injection |
| Navigation Compose | Screen navigation |
| Git & GitHub | Version control |

---

## 🏗️ Architecture

The application follows an **MVVM-oriented architecture** with separated data and presentation responsibilities.

```text
com.manage.services.instantmechanic
│
├── data
│   ├── local
│   ├── model
│   │   ├── Mechanic.kt
│   │   └── ServiceRequest.kt
│   │
│   ├── remote
│   │   └── MechanicApi.kt
│   │
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
│   │
│   ├── details
│   │   └── MechanicDetailsScreen.kt
│   │
│   └── request
│       └── RequestServiceScreen.kt
│
├── ui.theme
│
├── InstantMechanicApplication.kt
└── MainActivity.kt
```

### Data Flow

```text
UI - Jetpack Compose
        ↓
   ViewModel
        ↓
   Repository
        ↓
   Retrofit API
        ↓
   REST API
        ↓
      JSON
```

The ViewModel manages UI state using `StateFlow`.

The Repository is responsible for retrieving mechanic data from the API and handling failures using Kotlin's `Result` type.

---

## 🌐 REST API Integration

The application uses a mock REST API for mechanic data.

### Base URL

```text
https://dummyjson.com/
```

### Endpoint

```text
GET /c/a860-6359-4537-bb91
```

### Retrofit API

```kotlin
interface MechanicApi {

    @GET("c/a860-6359-4537-bb91")
    suspend fun getMechanics(): List<Mechanic>
}
```

The API returns mechanic information in JSON format.

Retrofit with Gson Converter is used to parse the JSON response into Kotlin `Mechanic` objects.

> **Note:** The custom DummyJSON endpoint is used as a mock REST API for this assignment and may expire according to the service's endpoint lifetime.

---

## 📱 Application Flow

```text
Home Screen
     ↓
Select Mechanic
     ↓
Mechanic Details
     ↓
Request Service
     ↓
Fill Service Form
     ↓
Submit Request
     ↓
Confirmation Screen
```

---

# 📸 Screenshots

## 🏠 Home Screen

![Instant Mechanic Home Screen](screenshots/home_screen.jpeg)

The home screen displays nearby mechanics with:

- Garage name
- Rating
- Distance
- Location
- Available services
- Working hours
- Open / Closed status
- Search functionality

---

## 🏗️ Project Structure

![Instant Mechanic Project Structure](screenshots/project_structure.png)

The project follows a clean package structure separating:

- Data
- Remote API
- Repository
- Navigation
- Presentation
- UI Theme

---

## ⚠️ Error Handling

![Instant Mechanic Error Handling](screenshots/error_state.jpeg)

When the API request fails, the application displays a user-friendly error state along with a **Retry** button.

This demonstrates the required error-handling behavior for REST API integration.

---

# ⚙️ Setup & Run

## 1. Clone the Repository

```bash
git clone <YOUR_GITHUB_REPOSITORY_URL>
```

Replace `<YOUR_GITHUB_REPOSITORY_URL>` with your actual GitHub repository URL.

---

## 2. Open in Android Studio

Open the cloned project in **Android Studio**.

Allow Android Studio to complete the Gradle synchronization.

---

## 3. Configure JDK

Use:

```text
JDK 17
```

---

## 4. Connect Device / Emulator

Connect an Android device or start an Android Emulator.

---

## 5. Run the Application

Click:

```text
Run ▶
```

The application will start on the connected Android device or emulator.

---

# 🔐 Internet Permission

The application requires Internet permission for REST API communication.

Add the following permission inside `AndroidManifest.xml`:

```xml
<uses-permission android:name="android.permission.INTERNET" />
```

---

# 🧠 Assumptions

- Mechanic information is provided through a mock REST API.
- Mechanic distance and availability are represented using mock data.
- Service request submission currently demonstrates the requested confirmation flow locally.
- No real payment or booking backend is required for this assignment.
- The application focuses on the core mechanic discovery and service-request workflow.

---

# 🚀 Additional Features

In addition to the core requirements, the application includes:

- 🔎 Search functionality
- 🛠️ Service-based search
- 📍 Location-based search
- 🔄 Retry functionality for API failures
- 💉 Hilt Dependency Injection
- 🧩 MVVM architecture
- 🎨 Modern Material 3 UI
- 📱 Responsive Jetpack Compose interface
- 🔄 State-based UI rendering
- ⚠️ Loading, Error, Empty and Success states

---

# 📋 Assignment Requirement Coverage

| Requirement | Status |
|---|---|
| Home Screen | ✅ Completed |
| Mechanic List | ✅ Completed |
| Garage Name | ✅ Completed |
| Rating | ✅ Completed |
| Distance | ✅ Completed |
| Location | ✅ Completed |
| Available Services | ✅ Completed |
| Open / Closed Status | ✅ Completed |
| Mechanic Details | ✅ Completed |
| Working Hours | ✅ Completed |
| Phone Number | ✅ Completed |
| Request Service Form | ✅ Completed |
| Customer Name | ✅ Completed |
| Phone Number | ✅ Completed |
| Vehicle Number | ✅ Completed |
| Service Selection | ✅ Completed |
| Problem Description | ✅ Completed |
| Request Confirmation | ✅ Completed |
| REST API Integration | ✅ Completed |
| JSON Parsing | ✅ Completed |
| Loading State | ✅ Completed |
| Error Handling | ✅ Completed |
| API Data Display | ✅ Completed |
| Kotlin | ✅ Completed |
| Jetpack Compose | ✅ Completed |
| MVVM | ✅ Completed |
| Search / Filter | ✅ Completed |
| Dependency Injection | ✅ Completed |
| Good UI/UX | ✅ Completed |

---

# 📂 Project Structure

```text
Instant-Mechanic
│
├── app
│   └── src
│       └── main
│           ├── java
│           │   └── com.manage.services.instantmechanic
│           │       │
│           │       ├── data
│           │       │   ├── local
│           │       │   ├── model
│           │       │   ├── remote
│           │       │   └── repository
│           │       │
│           │       ├── navigation
│           │       │
│           │       ├── presentation
│           │       │   ├── home
│           │       │   ├── details
│           │       │   └── request
│           │       │
│           │       ├── ui.theme
│           │       │
│           │       ├── InstantMechanicApplication.kt
│           │       └── MainActivity.kt
│           │
│           └── res
│
├── screenshots
│   ├── home_screen.jpeg
│   ├── project_structure.png
│   └── error_state.jpeg
│
└── README.md
```

---

# 👨‍💻 Developer

**Sonu Kumar Singh**

**Native Android Developer | Kotlin | Jetpack Compose | KMP**

Bhopal, India

---

## ⭐ Internship Assignment

This project was developed as part of an **Android Development Internship Assignment**.

The main objective was to demonstrate:

- Android development skills
- Kotlin programming
- Jetpack Compose
- REST API integration
- JSON parsing
- MVVM architecture
- Dependency Injection
- Error handling
- Clean UI/UX
- Git/GitHub workflow

---

⭐ **If you find this project useful, consider giving the repository a star.**

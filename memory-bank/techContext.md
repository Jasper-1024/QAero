# σ₃: Technical Context
*v1.0 | Created: 2024-12-28 | Updated: 2024-12-28*
*Π: INITIALIZING | Ω: RESEARCH*

## ��️ Technology Stack
### Core Platform
- 🎯 **Framework**: Kotlin Multiplatform (KMP)
- 🎨 **UI Framework**: Compose Multiplatform
- 🌐 **Networking**: Ktor Client
- 📦 **Serialization**: Kotlinx Serialization
- ⚡ **Concurrency**: Kotlin Coroutines
- 🏗️ **Build System**: Gradle with Kotlin DSL

### Platform-Specific
- 📱 **Android**: Android SDK, Jetpack Compose, Navigation Component
- 🖥️ **Desktop**: Compose for Desktop (JVM), Swing integration
- 🔧 **Development**: Android Studio + Cursor IDE integration

## 📦 Dependencies
### Shared Dependencies (commonMain)
```kotlin
// Core KMP
org.jetbrains.kotlin:kotlin-stdlib
org.jetbrains.kotlinx:kotlinx-coroutines-core

// Networking
io.ktor:ktor-client-core
io.ktor:ktor-client-content-negotiation
io.ktor:ktor-serialization-kotlinx-json

// Serialization
org.jetbrains.kotlinx:kotlinx-serialization-json

// UI (Compose Multiplatform)
org.jetbrains.compose.ui:ui
org.jetbrains.compose.material3:material3
```

### Platform Dependencies
**Android-specific:**
```kotlin
io.ktor:ktor-client-okhttp
androidx.activity:activity-compose
androidx.navigation:navigation-compose
androidx.work:work-runtime-ktx (for widgets/notifications)
```

**Desktop-specific:**
```kotlin
io.ktor:ktor-client-cio
org.jetbrains.compose.desktop:desktop-jvm
```

## 🏗️ Development Environment
### IDE & Tools
- **Primary IDE**: Android Studio (KMP support)
- **AI Assistant**: Cursor integration for enhanced development
- **Version Control**: Git with conventional commits
- **Build**: Gradle 8.x with Kotlin DSL

### Target Platforms
- **Android**: API 24+ (Android 7.0+)
- **Desktop**: JVM 11+ (Windows/Linux)

## 🔧 Technical Patterns
### Data Architecture
- **Models**: Data classes with @Serializable
- **API Layer**: Suspend functions with Result<T> wrapping
- **State Management**: Shared ViewModels with StateFlow/SharedFlow
- **Error Handling**: Sealed Result types for robust error propagation

### UI Architecture
- **Compose Patterns**: Shared composables in commonMain
- **State Hoisting**: Stateless UI components with callbacks
- **Navigation**: Platform-specific navigation wrappers
- **Theming**: Shared Material Design 3 theme system

### Networking Architecture
```kotlin
// Shared API service pattern
interface AqicnApiService {
    suspend fun getCurrentAqi(city: String, apiKey: String): Result<AqiData>
    suspend fun searchCities(query: String): Result<List<City>>
    suspend fun getHistoricalData(city: String, apiKey: String): Result<List<AqiHistoryPoint>>
}
```

## 🎯 Development Strategy
### Code Organization
- **Package Structure**: Feature-based organization
- **Dependency Injection**: Manual DI or lightweight KMP-compatible solution
- **Testing**: Shared test logic in commonTest

### Platform Integration
- **Android Specifics**: Widgets, notifications, background work
- **Desktop Specifics**: System tray, file operations, window management
- **Shared Core**: Business logic, data models, API calls

## 🌐 API Integration
### Aqicn.org API
- **Authentication**: User-provided API keys
- **Endpoints**: Current AQI, city search, historical data
- **Rate Limiting**: Client-side respect for API limits
- **Error Handling**: Graceful degradation for API failures

### Privacy Architecture
- **Local Storage**: User settings and favorites only
- **No Telemetry**: Zero data collection beyond user intent
- **API Key Storage**: Secure local storage per platform

## 🔒 Security Considerations
- **API Key Management**: Encrypted local storage
- **Network Security**: HTTPS enforcement
- **Data Privacy**: No cloud storage of user data
- **Permissions**: Minimal required permissions per platform

## 🚀 Performance Targets
- **App Launch**: < 2 seconds cold start
- **Data Refresh**: < 3 seconds API response
- **Memory Usage**: < 100MB typical usage
- **Code Sharing**: 80-90% between platforms

## 🔗 Technical References
- 📚 **KMP Documentation**: Kotlin Multiplatform official docs
- 🎨 **Compose MP**: Compose Multiplatform documentation  
- 🌐 **Ktor Client**: Cross-platform HTTP client documentation
- 🔧 **Android Studio**: KMP plugin and tooling
- 🎯 **Cursor Integration**: AI-assisted development workflow 
# σ₂: System Patterns
*v1.0 | Created: 2024-12-28 | Updated: 2024-12-28*
*Π: INITIALIZING | Ω: RESEARCH*

## 🏛️ Architecture Overview
QAero follows a **Kotlin Multiplatform (KMP) + Compose Multiplatform** architecture designed for maximum code reuse between Android and Desktop platforms while maintaining platform-specific optimizations.

## 🎨 Design Patterns
### Multiplatform Architecture Pattern
- **commonMain**: Shared business logic, data models, network requests, ViewModels
- **androidMain**: Android-specific implementations and optimizations
- **desktopMain**: Desktop-specific implementations and optimizations
- **androidApp**: Android application module with platform UI
- **desktopApp**: Desktop application module with platform UI

### Code Sharing Strategy
- **Business Logic**: 100% shared in commonMain
- **Data Models**: Shared with @Serializable annotations
- **API Services**: Shared with suspend functions and Result types
- **UI Components**: Maximized sharing through Compose Multiplatform
- **Platform Integration**: Platform-specific modules for native features

### Module Structure Pattern
```
shared/
├── commonMain/ (Core business logic)
│   ├── data/ (Models, repositories)
│   ├── network/ (API services)
│   ├── ui/ (Shared Compose components)
│   └── viewmodel/ (Shared presentation logic)
├── androidMain/ (Android-specific)
└── desktopMain/ (Desktop-specific)
androidApp/ (Android application)
desktopApp/ (Desktop application)
```

## 🔧 Component Architecture
### Core Shared Components
- **Data Layer**: AQDataPoint, City, UserSettings models
- **Network Layer**: AqicnApiService with Ktor Client
- **Business Layer**: Shared ViewModels/Presenters
- **UI Layer**: Reusable Compose components (AqiChip, PollutantInfoRow)

### Platform-Specific Components
- **Android**: Widgets (AppWidgetProvider), Notifications, Navigation
- **Desktop**: Window management, System tray, File dialogs

## 📐 Architectural Decisions
- **AD₁**: Kotlin Multiplatform for maximum code reuse (80-90% shared code target)
- **AD₂**: Compose Multiplatform for shared UI components
- **AD₃**: commonMain priority - implement in shared code first, platform-specific only when necessary
- **AD₄**: Ktor Client for cross-platform networking
- **AD₅**: Privacy-first design with user-managed API keys
- **AD₆**: Result-based error handling for robust data flow

## 🏗️ Development Phases Architecture
### Phase 0: Project Foundation
- KMP project structure setup
- Gradle configuration with necessary dependencies
- Cursor + Android Studio integration

### Phase 1: Core Data & API (commonMain)
- Data models with Kotlinx Serialization
- Abstract API service interfaces
- Ktor Client implementation
- Shared ViewModel foundations

### Phase 2: Shared UI Framework
- Compose Multiplatform shared components
- Android app structure with Navigation
- Desktop app structure with Window management
- First data integration

### Phase 3: Feature Modules (Iterative)
- City search functionality
- Multi-city/favorites management
- Settings implementation
- 24-hour AQI trend charts
- Android widgets
- Notification system

## 🔗 System Relationships
```
┌─ commonMain (Shared Core)
│  ├─ Data Models (@Serializable)
│  ├─ API Services (Ktor + suspend)
│  ├─ ViewModels (Shared state)
│  └─ UI Components (Compose MP)
│
├─ androidApp
│  ├─ MainActivity + Navigation
│  ├─ Android Widgets
│  └─ Platform UI adaptations
│
└─ desktopApp
   ├─ Main Window + Menus
   ├─ System integrations
   └─ Platform UI adaptations
```

## 🎯 Code Reuse Targets
- **Business Logic**: 95% shared (commonMain)
- **Data Models**: 100% shared (commonMain)
- **Network Layer**: 90% shared (commonMain)
- **UI Components**: 70-80% shared (Compose MP)
- **Platform Features**: 0% shared (native implementations) 
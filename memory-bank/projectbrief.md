# σ₁: Project Brief
*v1.0 | Created: 2024-12-28 | Updated: 2024-12-28*
*Π: INITIALIZING | Ω: RESEARCH*

## 🏆 Overview
**QAero** is a simple, user-friendly, modern UI client application for Aqicn.org air quality monitoring. The project emphasizes extreme simplicity, user-friendliness, and modern visual presentation while maintaining privacy-first principles and open-source transparency.

## 🎯 Project Vision & Goals
- **Core Objective**: Develop QAero as a clean, easy-to-use Aqicn client with modern UI
- **Core Values**: Ultimate simplicity, user-friendliness, modern visual presentation
- **Target Platforms**: Android mobile and desktop (Windows/Linux)
- **Privacy-First**: Foundational principle - no unnecessary data collection
- **Open Source**: Encouraging transparency and community participation

## 📋 Requirements
### Functional Requirements
- [R₁] Cross-platform application (Android + Desktop)
- [R₂] Air quality data visualization and monitoring
- [R₃] City search and management functionality
- [R₄] Multi-city/favorite cities management
- [R₅] User settings and preferences
- [R₆] 24-hour AQI trend charts
- [R₇] Android widget support
- [R₈] Notification functionality
- [R₉] User-managed Aqicn API key integration

### Non-Functional Requirements
- [NR₁] Privacy-first architecture (user-controlled API keys)
- [NR₂] Modern, clean UI design
- [NR₃] Focused functionality (avoid feature bloat)
- [NR₄] Maximum code reuse across platforms
- [NR₅] Efficient development for limited time availability

## 🧭 Guiding Philosophy
### Core Principles
- **Privacy Priority**: Project foundation - no unnecessary data collection
- **Open Source**: Transparency and community participation
- **Restraint & Focus**: Focus on core air quality information, avoid redundant features
- **Map Service Strategy**: Privacy-first map service selection

### Development Methodology
- **Time Efficiency**: Optimized for limited development time
- **Task Granularity**: Break into detailed, independent modules suitable for AI-assisted coding
- **Avoid Duplication**: Actively seek abstraction and reuse opportunities
- **Iterative Development**: Start with MVP, gradually iterate new features
- **Prototype-Driven**: Use existing mobile/desktop prototypes as UI implementation guides

## 📊 Success Criteria
- Functional cross-platform air quality monitoring application
- Clean, modern UI that embodies simplicity principles
- Privacy-respecting architecture with user-controlled data
- Efficient development workflow utilizing AI assistance
- Open-source project ready for community contribution
- Maximum code sharing between platforms

## 🔑 API Key Management
- Users must obtain and configure their own Aqicn API keys
- Application provides clear guidance for API key acquisition
- No centralized key management or data collection

## 🔗 Context References
- 📄 Current Prototypes: `/prototype/` directory (HTML/CSS prototypes)
- 📱 Mobile Variants: `simple_mobile_*.html`
- 🖥️ Desktop Variants: `simple_desktop_*.html`
- 🏠 Prototype Entry: `index.html`
- 🌐 Target API: Aqicn.org API integration
- 🛠️ Development Tools: Android Studio + Cursor integration 
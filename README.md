# Products App

This is a simple products app which shows a list of products. This app is built using Kotlin and Jetpack Compose, Retrofit, and Dagger Hilt for dependency Injection. I just created this app to learn about abstraction and dependency injection

## Features

- Shows a list of products and you can check the product's image, it's price and some info.

## Screenshots
<p float="right">
    <img src="https://github.com/user-attachments/assets/07df2ea0-4dbc-4f7f-893d-094e573b9dc1" width="200" height="400" />
</p>
  
## Libraries Used
1. **Kotlin**: First-class and official programming language for Android development.
2. **Jetpack compose**: A toolkit for building Android apps that uses a declarative API to simplify and speed up UI development
3. **Material Components for Android**: For modular and customizable Material Design UI components.
4. **Retrofit**: It is a type-safe HTTP client for Android and Java that simplifies making network requests to RESTful APIs by converting API responses into Kotlin or Java objects.
5. **Coil**: It is a modern, lightweight image-loading library for Android that supports caching and integrates seamlessly with Jetpack Compose.
6. **Dagger Hilt**: It is a dependency injection library for Android that simplifies providing and managing dependencies across the app's lifecycle.

## Lessons Learned
**Importance of Abstractions**
- Using interfaces in the domain layer decouples the app's core logic from specific implementations like Retrofit or Ktor.
- Switching to a new library only requires updating the implementation in the data layer, keeping the rest of the app unchanged.
- Abstractions improve testability by allowing mock or fake repositories to replace real implementations during testing.
- This approach ensures the code is flexible, maintainable, and scalable for future changes.

**Dependency Injection**
- Dependency Injection (DI) simplifies how dependencies are managed and passed (e.g., to ViewModels or Repository implementations).
- I used Dagger Hilt for DI, which allows defining dependencies in an AppModule class and automatically injecting them where needed.
- Without DI, you’d need to manually create factories and factory providers to pass dependencies, leading to more boilerplate and less maintainable code.
- DI makes the code cleaner, scalable, and easier to test by centralizing dependency management.

## Contact
For any questions or feedback, feel free to contact me at sakhare2likhit@gmail.com and also connect with me on Twitter at https://x.com/likhit_sakhare

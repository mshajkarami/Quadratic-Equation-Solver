# Quadratic Equation Solver (Android - Data Binding)

## 📌 Overview
This is a simple Android application for solving **quadratic equations** using **Data Binding** in Kotlin. The app dynamically calculates the roots of the equation in real-time as the user enters the coefficients **(a, b, c)**.

## ✨ Features
- **Live Equation Solving:** Roots are updated instantly when values change.
- **Two-Way Data Binding:** Ensures seamless synchronization between UI and ViewModel.
- **Error Handling:** Detects and handles cases with no real solutions.
- **Simple & Clean UI:** Minimalistic design with real-time updates.

## 📱 Screenshots
(Include screenshots of your app here)

## 🛠 Technologies Used
- **Kotlin** for Android development
- **MVVM Architecture**
- **Data Binding**
- **LiveData**
- **Material Design Components**

## 🚀 How It Works
1. Enter the coefficients **a, b, c** in the input fields.
2. The app calculates the **discriminant (Δ)** using:
   ```
   Δ = b² - 4ac
   ```
3. Based on the discriminant:
   - If **Δ > 0**, two real roots are displayed.
   - If **Δ = 0**, one real root is displayed.
   - If **Δ < 0**, an error message is shown (no real solutions).

## 🔧 Setup & Installation
1. **Clone the repository:**
   ```sh
   git clone https://github.com/yourusername/quadratic-solver.git
   ```
2. **Open the project in Android Studio.**
3. **Enable Data Binding** in `build.gradle (Module: app)`, if not already enabled:
   ```gradle
   android {
       buildFeatures {
           dataBinding = true
       }
   }
   ```
4. **Run the app** on an emulator or real device.

## 📜 License
This project is **open-source** and available under the [MIT License](LICENSE).

## 🤝 Contributing
Contributions are welcome! Feel free to **fork** the repo, create a new branch, and submit a pull request.

---

Made with ❤️ by **Your Name**


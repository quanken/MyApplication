# MyApplication

This is a simple demo that uses jni to call c. It gets a user input and return a result.

## Project Layout

* app/ - it is the main module for the interaction and display.
* calmodule - it is the module that contains fuction.

## Enviroment

* Windows
* Android Studio  
* Android SDK

## Build Steps

- With Android Studio: use "Import Project(Eclipse ADT, Gradle, etc)" or "File" > "Import Project" option
- On Command Line/Terminal: make sure set up ANDROID_HOME and ANDROID_NDK_HOME to local installation of SDK and NDK, then go to individual sample dir, and use "gradlew assembleDebug"


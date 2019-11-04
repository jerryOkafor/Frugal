# PinchMe
A personal Budget App to demonstrate the latest in Jetpack and Android Architecture component including Room, Navigation, ViewModel, Paging, WorkManager and Kotlin Coroutine. Built with Kotlin.

[![CircleCI](https://circleci.com/gh/jerryOkafor/Frugal.svg?style=svg)](https://circleci.com/gh/jerryOkafor/Frugal)
[![codecov](https://codecov.io/gh/po10cio/JournalApp/branch/master/graph/badge.svg)](https://codecov.io/gh/po10cio/JournalApp)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/8ceda2e1681c4b8aa9b44c5da15ddb53)](https://www.codacy.com/app/po10cio/JournalApp?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=po10cio/JournalApp&amp;utm_campaign=Badge_Grade)


Included:
Test code sharing between local and instrumentation test.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

```
Android Studio >= 3.5
```

### Installing

Follow this steps if you want get a local copy of the project in your machine.

##### 1. Clone or fork the repository by running the command below.
	
	git clone https://github.com/po10cio/JournalApp.git

##### 2. Import the project in AndroidStudio.
1. In Android Studio, go to File -> New -> Import project
2. Follow the dialog wizard to choose the folder where you cloned the project and click on open.
3. AndroidStudio imports the projects and builds it for you. 

##### 3. Add Firebase config.
1. Go to [Firebase](https://console.firebase.google.com/) and click on + Add project to create a new project
2. Add the SHA1 fingerprint of your machine after you have created the project
3. Download google_service.json file and add to the /app folder of the project
4. Clean -> Build the project and ensure that every thing works fine 

You can now run the project in an Android Emulator or a real Android Device.

Note : A sample debug apk is available in the [Here](apk/app-debug.apk) 

## Running the tests

Journal App comes with both Instrumented tests and Unit tests. 

### Instrumentation tests

To run the instrumentation tests, you need an Android Emulator or a real Android device. Once you have any of this, open a terminal in AndroidStudio and run the command below.

```
./gradlew connectedAndroidTest
```

### Running Local Unit tests
You do not need any device (Emulator of real Android device) to run this test. To run this test, open a terminal and run the command shown below.

```
./gradlew test
```
Note : This project has [Fastlane]() enabled, so if you like Fastlane, you can list the lanes and select the one yu wish to run.

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Kotlin](https://kotlinlang.org/) - Kotlin for JVM
* [Room Database](https://developer.android.com/topic/libraries/architecture/room) - The Room persistence library for Android.
* [Koin](https://github.com/InsertKoinIO/koin) - A pragmatic lightweight dependency injection framework for Kotlin
* [Firebase](https://firebase.google.com/) - For authentication and data persistence.

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags).

## Authors

* **Jerry Hanks**

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* [PurpleBooth](https://gist.github.com/PurpleBooth) - for the README.md template
* [Arnaud Giuliani](https://android.jlelse.eu/painless-android-testing-with-room-koin-bb949eefcbee)

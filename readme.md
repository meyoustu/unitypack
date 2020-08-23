# unitypack
In order to use Unity more conveniently.
******
******
## To get a Git project into your build:
### Step 1. Add the JitPack repository to your build file
### Add it in your root build.gradle at the end of repositories:
``` gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
### Step 2. Add the dependency
``` gradle
dependencies {
    implementation implementation 'com.github.meyoustu:unitypack:2020.8.23.1030'
}
```

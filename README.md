# Chronos Localiser :globe_with_meridians: :pencil:


Android doesn't provide the direct support to change the language of the activities that are already created. Whenever we change the locale the new locale is applied to new activities only. In short the user have to restart all activities / app to have use the new language. 

### Solution :rocket: 

This library provide the solution to this problem, the update locale is applied to all the activities that will be created and also to those that are present in the back stack. Apart from this there are some other features which are provided by this library

### Features :sparkles:

- Support to retain the locale of the app after the app is shutdown.
- Easy to use and very Small footprint (~5KB, ~40 methods)

### Prerequisite :lock:

**Step 1.** Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
**Step 2.** Add the dependency 

	dependencies {
	        implementation 'com.github.govinddixit:chronos-localiser:1.0.0'
	}

### How to use :speech_balloon:

***Extend your app class***
```
class Application : LocaleAwareApplication() {
  ....
}
```
  
***Extend your base activity class***
```
open class BaseActivity : LocaleAwareCompatActivity() {  
  ....
}
```

`LocaleAwareCompatActivity` provides a helper method called `updateLocale` which is used to update the locale.
That's all folks, You are now ready to use it in full power :zap:

### Demo

<img src="static/demo.gif" width="240" height="480"/>


### Language resources optimization in Android App Bundle :bulb:

Change the language by library can cause a crash to your app when you publishing your app with Android App Bundle with language resources optimization enabled.

To fix this, Using the Additional Languages API in Play Core library to download the additional language before.

For more information about Additional Language API. Check [here](https://android-developers.googleblog.com/2019/03/the-latest-android-app-bundle-updates.html)

If you don't want to implement this feature in your code, just ignore the language resources optimization by adding the Android App Bundle configuration in your app's build.gradle

```
android {
    ... 
    bundle { 
        language { 
            enableSplit = false 
        } 
    } 
}
```

### Credits :busts_in_silhouette:

[Govind Dixit](https://github.com/GOVINDDIXIT)

### License :page_facing_up:

Project is published under the Apache 2.0 license. Feel free to clone and modify repo as you want, but don't forget to add reference to authors :)
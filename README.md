# CustomFonts-Library-Android
A simple library to use custom fonts in text view.

<p align="center">
  <img src="https://raw.githubusercontent.com/felixgiov/CustomFonts-Library-Android/master/1.png" width="420"/>
</p>

## Download
#### As a Gradle dependency

Simply add it in your root build.gradle at the end of repositories : 

```gradle
allprojects {
   repositories {
    maven { url "https://jitpack.io" }
   }
}
```
And add the dependency :

```gradle
	dependencies {
	        compile 'com.github.felixgiov:CustomFonts-Library-Android:1.0.0'
	}
```
#### As a Maven dependency

Declare the dependency in Maven :

```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

Then, add the dependency :

```xml
	<dependency>
	    <groupId>com.github.felixgiov</groupId>
	    <artifactId>CustomFonts-Library-Android</artifactId>
	    <version>1.0.0</version>
	</dependency>
```

## Usage
### Add font in your assets/fonts folder

<p align="center">
  <img src="https://raw.githubusercontent.com/felixgiov/CustomFonts-Library-Android/master/2.png" width="420"/>
</p>

### Add font path in values/strings.xml
```xml
    <string name="cloudier">fonts/Cloudier.ttf</string>
```
By default this CustomFonts uses Expressive Inks font. [Credits](http://www.dafont.com/expressive-inks.font)

### In layout xml.
```xml
    <felixgiov.lib.CustomFonts
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Custom Fonts Example"
        app:fontPath="@string/cloudier"/>
```

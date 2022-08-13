// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        // google() // TODO: Check necessity
        // mavenCentral() // TODO: Check necessity
    }
    dependencies {
        // classpath "com.android.tools.build:gradle:4.2.1" // TODO: Check necessity

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        // google() // TODO: Check necessity
        // mavenCentral() // TODO: Check necessity
    }
}

tasks.register("clean", Delete::class) {
    println(rootProject)
    println(rootProject.buildDir)
    delete(rootProject.buildDir)
}

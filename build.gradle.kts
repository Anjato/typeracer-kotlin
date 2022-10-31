import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    application
}

group = "org.anjato"
version = "0.1-ALPHA"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.bonigarcia:webdrivermanager:5.3.0")
    //testCompile group: 'junit', name: 'junit', version: '4.12'
    // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    implementation("org.seleniumhq.selenium:selenium-java:4.5.3")
    // https://mvnrepository.com/artifact/io.cucumber/cucumber-java
    implementation("io.cucumber:cucumber-java:7.8.1")
    // https://mvnrepository.com/artifact/io.cucumber/cucumber-junit
    testImplementation("io.cucumber:cucumber-junit:7.8.1")
    // https://mvnrepository.com/artifact/org.hamcrest/hamcrest
    testImplementation("org.hamcrest:hamcrest:2.2")
    testImplementation("org.testng:testng:7.6.1")
}

tasks.test {
    useTestNG()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "MainKt"
    }
    configurations["compileClasspath"].forEach { file: File ->
        from(zipTree(file.absoluteFile))
        exclude("META-INF/*.RSA", "META-INF/*.SF", "META-INF/*.DSA")
    }

    duplicatesStrategy = DuplicatesStrategy.INCLUDE
}
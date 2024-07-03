import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    application
    kotlin("jvm") version "2.0.0"
    id("org.openjfx.javafxplugin") version "0.1.0"
    id("io.github.goooler.shadow") version "8.1.8"
}

repositories {
    mavenCentral()
}

javafx {
    version = "17.0.8"
    modules = listOf("javafx.controls", "javafx.fxml")
}

dependencies {
    implementation("org.openjfx:javafx-fxml:17.0.8")
    implementation("org.openjfx:javafx-controls:17.0.8")
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("org.apache.commons:commons-math3:3.6.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.0")
}

application {
    mainClass.set("com.altiran.dicemaster.DicemasterAppKt")
}

tasks {
    withType<Jar> {
        enabled = false
    }

    withType<ShadowJar> {
        archiveClassifier.set("")
        manifest {
            attributes["Main-Class"] = "com.altiran.dicemaster.DicemasterAppKt"
        }
    }

    named("assemble") {
        dependsOn("shadowJar")
    }

    withType<Test> {
        useJUnitPlatform()
    }
}

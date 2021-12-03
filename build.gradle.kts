plugins {
    kotlin("jvm") version "1.6.0"
}

group = "fr.deroffal"
version = "1.0-SNAPSHOT"



repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.6.0")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    testImplementation ("io.kotest:kotest-runner-junit5-jvm:5.0.1")
    testImplementation ("io.kotest:kotest-assertions-core-jvm:5.0.1")

}

tasks.test {
    useJUnitPlatform()
}

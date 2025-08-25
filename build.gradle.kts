plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-core:2.19.2") // Replace with the desired version
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.16.1") // Replace with the desired version
    //implementation("com.fasterxml.jackson.core:jackson-databind:2.19.2") // Replace with the desired version
    implementation("com.fasterxml.jackson.core:jackson-databind:2.15.2")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}
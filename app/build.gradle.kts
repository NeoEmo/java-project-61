plugins {
    id("application")
    id("checkstyle")
}

application {
    mainClass = "hexlet.code.App"
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

checkstyle {
    toolVersion = "10.12.4"
}

dependencies {
    // Source: https://mvnrepository.com/artifact/com.github.ben-manes/gradle-versions-plugin
    runtimeOnly("com.github.ben-manes:gradle-versions-plugin:0.11.1")
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
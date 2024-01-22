plugins {
    id("java")
    application
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.1")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass = "hexlet.code.App"
}

/*
Аналог для build.gradle.kts
compileJava {
  options.release = 20
}
 */

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }

}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}







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
    applicationDefaultJvmArgs = listOf("-Dgreeting.language=en")
    executableDir = "custom_bin_dir"
    mainModule = "org.gradle.sample.app" // name defined in module-info.java
    mainClass = "hexlet.code.App"
}


val createDocs by tasks.registering {
    val docs = layout.buildDirectory.dir("docs")
    outputs.dir(docs)
    doLast {
        docs.get().asFile.mkdirs()
        docs.get().file("readme.txt").asFile.writeText("Read me!")
    }
}

distributions {
    main {
        contents {
            from(createDocs) {
                into("docs")
            }
        }
    }
}








plugins {
    idea
    java
    id("io.papermc.paperweight.userdev") version("1.7.1")
    id("xyz.jpenilla.run-paper") version("2.3.0")
}

group = "me.elephant1214.bettertrimrecipes"
version = "1.0.0"

java {
    toolchain.languageVersion = JavaLanguageVersion.of(21)
}

paperweight.reobfArtifactConfiguration = io.papermc.paperweight.userdev.ReobfArtifactConfiguration.MOJANG_PRODUCTION

repositories {
    mavenCentral()
    maven("https://repo.purpurmc.org/snapshots")
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    paperweight.devBundle("org.purpurmc.purpur", "1.20.6-R0.1-SNAPSHOT")
}

tasks {
    runServer {
        minecraftVersion("1.20.6")
    }
    compileJava {
        options.encoding = "UTF-8"
        options.release = 21
    }
    processResources {
        val props = mapOf("version" to version)
        inputs.properties(props)
        filesMatching(listOf("paper-plugin.yml", "plugin.yml")) {
            expand(props)
        }
    }
}

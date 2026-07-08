plugins {
    id("sports-game-odds.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":sports-odds-api-core"))
    implementation(project(":sports-odds-api-client-okhttp"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :sports-odds-api-example:run` to run `Main`
    // Use `./gradlew :sports-odds-api-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.sportsgameodds.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}

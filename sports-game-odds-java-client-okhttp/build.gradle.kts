plugins {
    id("sports-game-odds.kotlin")
    id("sports-game-odds.publish")
}

dependencies {
    api(project(":sports-game-odds-java-core"))

    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")

    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.25.3")
}

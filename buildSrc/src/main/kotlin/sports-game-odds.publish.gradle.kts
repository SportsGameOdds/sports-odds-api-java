plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("Sports Game Odds API")
                description.set("Here you'll find the REST API reference documentation for the SportsGameOdds\nAPI.")
                url.set("https://sportsgameodds.com/docs/")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Sports Game Odds")
                        email.set("api@sportsgameodds.com")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/stainless-sdks/sports-odds-api-java.git")
                    developerConnection.set("scm:git:git://github.com/stainless-sdks/sports-odds-api-java.git")
                    url.set("https://github.com/stainless-sdks/sports-odds-api-java")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}

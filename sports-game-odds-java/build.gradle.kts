plugins {
    id("sports-game-odds.kotlin")
    id("sports-game-odds.publish")
}

dependencies {
    api(project(":sports-game-odds-java-client-okhttp"))
}

// Redefine `dokkaJavadoc` to:
// - Depend on the root project's task for merging the docs of all the projects
// - Forward that task's output to this task's output
tasks.named("dokkaJavadoc").configure {
    actions.clear()

    val dokkaJavadocCollector = rootProject.tasks["dokkaJavadocCollector"]
    dependsOn(dokkaJavadocCollector)

    val outputDirectory = project.layout.buildDirectory.dir("dokka/javadoc")
    doLast {
        copy {
            from(dokkaJavadocCollector.outputs.files)
            into(outputDirectory)
            duplicatesStrategy = DuplicatesStrategy.INCLUDE
        }
    }

    outputs.dir(outputDirectory)
}

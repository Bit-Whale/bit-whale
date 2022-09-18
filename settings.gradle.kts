rootProject.name = "bit-whale"
include("app")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            version("junit-jupiter-version", "5.8.2")
            library("junit-jupiter", "org.junit.jupiter", "junit-jupiter").versionRef("junit-jupiter-version")
        }
    }
}

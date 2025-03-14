import buildsrc.config.Deps

plugins {
    buildsrc.convention.`android-library`

    buildsrc.convention.`mockk-publishing`
}

description = "Mocking library for Kotlin (Android instrumented test)"

val mavenName: String by extra("MockK Android")
val mavenDescription: String by extra("${project.description}")

android {
    packagingOptions {
        resources {
            excludes += "META-INF/LICENSE.md"
            excludes += "META-INF/LICENSE-notice.md"
        }
    }
}

dependencies {
    api(projects.modules.mockk)
    api(projects.modules.mockkAgentApi)
    api(projects.modules.mockkAgentAndroid)
}

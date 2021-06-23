import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

allprojects.forEach { project ->
    project.tasks.withType<KotlinCompile>().all {
        kotlinOptions { jvmTarget = JavaVersion.VERSION_1_8.toString() }
    }
}

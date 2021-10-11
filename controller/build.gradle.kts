plugins {
    java

}


group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation("com.intellij:annotations:12.0")
    implementation("org.projectlombok:lombok:1.18.20")
    implementation("com.google.code.gson:gson:2.8.5")
    implementation(project(":models"))
    annotationProcessor("org.projectlombok:lombok:1.18.20")

}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
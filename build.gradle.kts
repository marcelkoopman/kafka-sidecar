plugins {
    application 
    id ("com.github.davidmc24.gradle.plugin.avro") version "1.9.1"
}

repositories {
    mavenCentral() 
}

dependencies {
    implementation("org.apache.kafka:kafka-clients:3.6.1")
    implementation("org.slf4j:slf4j-api:2.0.12")
    implementation("ch.qos.logback:logback-classic:1.4.14")
    implementation("org.apache.avro:avro:1.11.3")

}

application {
    mainClass = "sidecar.SidecarApp" 
}

tasks.named<Test>("test") {
    useJUnitPlatform() 
}

java {                                      
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

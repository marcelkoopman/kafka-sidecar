val kafkaClientVersion = "3.9.0"
val logBackVersion = "1.5.12"
val sl4jVersion = "2.1.0-alpha1"
val avroVersion = "1.12.0"

plugins {
    application 
    id ("com.github.davidmc24.gradle.plugin.avro") version "1.9.1"
    id ("se.patrikerdes.use-latest-versions") version "0.2.18"
    id ("com.github.ben-manes.versions") version "0.51.0"
}

repositories {
    mavenCentral() 
}

dependencies {
    implementation("org.apache.kafka:kafka-clients:$kafkaClientVersion")
    implementation("org.slf4j:slf4j-api:$sl4jVersion")
    implementation("ch.qos.logback:logback-classic:$logBackVersion")
    implementation("org.apache.avro:avro:$avroVersion")

}

application {
    mainClass = "sidecar.SidecarApp" 
}

tasks.named<Test>("test") {
    useJUnitPlatform() 
}

java {                                      
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

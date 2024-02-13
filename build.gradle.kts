plugins {
    application 
}

repositories {
    mavenCentral() 
}

dependencies {
    implementation("org.apache.kafka:kafka-clients:3.6.1")
}

application {
    mainClass = "sidecar.Main" 
}

tasks.named<Test>("test") {
    useJUnitPlatform() 
}

java {                                      
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

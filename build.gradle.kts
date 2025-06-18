plugins {
    java
    id("org.springframework.boot") version "3.5.0"
    id("io.spring.dependency-management") version "1.1.4"
}

group = "example"
version = "1.0.0-SNAPSHOT"
extra["springModulithVersion"] = "1.4.0"

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.modulith:spring-modulith-bom:${property("springModulithVersion")}")
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.projectlombok:lombok")
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
    implementation("org.springframework.modulith:spring-modulith-api")
    implementation("org.springframework.boot:spring-boot-starter-data-rest")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.jetbrains:annotations:26.0.1")
}
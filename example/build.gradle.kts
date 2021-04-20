plugins {
  java
}

repositories {
  jcenter()
}

dependencies {
  compileOnly(project(":plugin"))
}

tasks.withType<JavaCompile> {
  options.compilerArgs.add("-Xplugin:SamplePlugin")
}

// Add 
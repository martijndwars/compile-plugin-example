plugins {
  java
}

repositories {
  jcenter()
  maven {
    url = uri("https://artifacthub-phx.oci.oraclecorp.com/labs-pgx-release-local/")
  }
}

dependencies {
  compileOnly(project(":plugin"))
  compileOnly("oracle.gm.lang:algorithm.api:0.1.2-20210305")
}

tasks.withType<JavaCompile> {
  options.compilerArgs.add("-Xplugin:SamplePlugin")
}

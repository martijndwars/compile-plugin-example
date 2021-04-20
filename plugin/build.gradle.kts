import javax.tools.ToolProvider
import java.net.URLClassLoader

plugins {
  java
}

repositories {
  jcenter()
}

dependencies {
  implementation(files((ToolProvider.getSystemToolClassLoader() as URLClassLoader).getURLs()))
  implementation("com.google.guava:guava:29.0-jre")
}
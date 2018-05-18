name := """play-scala-starter-example"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

resolvers += Resolver.mavenLocal
resolvers += Resolver.mavenCentral

scalaVersion := "2.12.4"

crossScalaVersions := Seq("2.11.12", "2.12.4")

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
libraryDependencies += "com.h2database" % "h2" % "1.4.196"

libraryDependencies += "com.github.rmannibucau" % "playx-servlet" % "0.0.1"
libraryDependencies += "com.github.rmannibucau" % "playx-ioc" % "0.0.1"
libraryDependencies += "com.github.rmannibucau" % "playx-cdi" % "0.0.1"
libraryDependencies += "com.github.rmannibucau" % "playx-cdi" % "0.0.1"
libraryDependencies += "org.talend.sdk.component" % "component-server-proxy" % "1.0.0-SNAPSHOT" changing()
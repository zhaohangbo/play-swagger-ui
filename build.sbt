name := """play-slick-example"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

//routesGenerator := InjectedRoutesGenerator

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq(
    "mysql" % "mysql-connector-java" % "5.1.34",
    "com.typesafe.play" %% "play-slick" % "2.0.0",
    "com.typesafe.play" %% "play-slick-evolutions" % "2.0.0",
    "com.h2database" % "h2" % "1.4.192",
    "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.0" % "test",
    "io.swagger" %% "swagger-play2" % "1.5.3",
    "io.swagger" % "swagger-core" % "1.5.12",
    "io.swagger" %% "swagger-scala-module" % "1.0.2",
    specs2 % Test
)

libraryDependencies += filters

resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

fork in run := true

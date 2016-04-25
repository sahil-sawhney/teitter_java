name := """java_play_angular"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

libraryDependencies += "org.twitter4j" % "twitter4j-core" % "4.0.2"

libraryDependencies += "com.google.code.gson" % "gson" % "2.5"

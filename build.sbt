ThisBuild / scalaVersion := "2.12.4"
ThisBuild / organization := "com.example"
lazy val hello = (project in file("."))
.settings(
name := "Hello",
// libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.12.0"
/* libraryDependencies += "com.typesafe.sbt" %  "sbt-git"   % "0.9.3" */
)

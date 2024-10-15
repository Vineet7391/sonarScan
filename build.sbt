ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.19"
fork / run := true

lazy val root = (project in file("."))
  .settings(
    name := "sonarScan",
    sbtPlugin := true,
    organization := "com.sonar",
    version := "0.1.0"
  )
libraryDependencies += "org.scala-lang" % "scala-library" % scalaVersion.value
resolvers += "GitHub Packages" at "https://maven.pkg.github.com/<Vineet7391>/<sonarScan>"
credentials += Credentials(Path.userHome / ".sbt" / ".credentials")
addSbtPlugin("com.sonar" % "sonarScan" % "0.1.0")

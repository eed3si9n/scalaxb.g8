import Dependencies._

ThisBuild / organization  := "com.example"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "$scala_version$"

lazy val root = (project in file("."))
  .enablePlugins(ScalaxbPlugin)
  .settings(
    name := "$name$",
    libraryDependencies ++= Seq(dispatch, scalaXml, scalaParser, jaxbApi),
    Compile / scalaxb / scalaxbDispatchVersion := dispatchV,
    Compile / scalaxb / scalaxbPackageName := "$generated_package_name$",
    // Compile / scalaxb / scalaxbPackageNames := Map(uri("http://schemas.microsoft.com/2003/10/Serialization/") -> "microsoft.serialization"),
    // Compile / scalaxb / logLevel := Level.Debug,
  )

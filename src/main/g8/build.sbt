import ScalaxbKeys._

lazy val scalaXml = "org.scala-lang.modules" %% "scala-xml" % "1.0.2"
lazy val scalaParser = "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.1"
lazy val dispatchV = "$dispatch_version$"
lazy val dispatch = "net.databinder.dispatch" %% "dispatch-core" % dispatchV

lazy val root = (project in file(".")).
  settings(
    organization  := "com.example",
    name          := "$name$",
    scalaVersion  := "2.11.4",
    libraryDependencies ++= Seq(scalaXml, scalaParser, dispatch)).
  settings(scalaxbSettings: _*).
  settings(
    sourceGenerators in Compile += (scalaxb in Compile).value,
    dispatchVersion in (Compile, scalaxb) := "$dispatch_version$",
    async in (Compile, scalaxb)           := true,
    packageName in (Compile, scalaxb)     := "$generated_package_name$"
    // packageNames in (Compile, scalaxb)    := Map(uri("http://schemas.microsoft.com/2003/10/Serialization/") -> "microsoft.serialization"),
    // logLevel in (Compile, scalaxb) := Level.Debug 
  )

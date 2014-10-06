import ScalaxbKeys._

organization := "com.example"

name := "$name$"

scalaVersion := "$scala_version$"

scalaxbSettings

packageName in scalaxb in Compile := "$generated_package_name$"

sourceGenerators in Compile <+= scalaxb in Compile

libraryDependencies += "net.databinder.dispatch" %% "dispatch-core" % "$dispatch_version$"

libraryDependencies <++= scalaVersion { scala =>
   Seq("net.databinder.dispatch" %% "dispatch-core" % "$dispatch_version$") ++
   (if(scala.startsWith("2.11")) Seq(
     "org.scala-lang.modules" %% "scala-xml" % "1.0.2",
     "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.1"
   ) else Seq())
}

dispatchVersion in scalaxb in Compile := "$dispatch_version$"

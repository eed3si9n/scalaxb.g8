import ScalaxbKeys._

organization := "com.example"

name := "$name$"

seq(scalaxbSettings: _*)

packageName in scalaxb in Compile := "$generated_package_name$"

sourceGenerators in Compile <+= scalaxb in Compile

// libraryDependencies += "net.databinder" %% "dispatch-http" % "0.8.5"

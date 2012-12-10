import ScalaxbKeys._

organization := "com.example"

name := "$name$"

scalaxbSettings

packageName in scalaxb in Compile := "$generated_package_name$"

sourceGenerators in Compile <+= scalaxb in Compile

// libraryDependencies += "net.databinder" %% "dispatch-http" % "0.9.4"

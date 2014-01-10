import ScalaxbKeys._

organization := "com.example"

name := "$name$"

scalaVersion := "2.10.3"

scalaxbSettings

packageName in scalaxb in Compile := "$generated_package_name$"

sourceGenerators in Compile <+= scalaxb in Compile

libraryDependencies += "net.databinder.dispatch" %% "dispatch-core" % "$dispatch_version$"

dispatchVersion in scalaxb in Compile := "$dispatch_version$"

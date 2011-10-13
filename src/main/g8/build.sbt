import ScalaxbKeys._

organization := "com.example"

name := "$name$"

seq(scalaxbSettings: _*)

packageName in scalaxb in Compile := "$generated_package_name$"

sourceGenerators in Compile <+= scalaxb in Compile

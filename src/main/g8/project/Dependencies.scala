import sbt._

object Dependencies {
  lazy val scalaXml = "org.scala-lang.modules" %% "scala-xml" % "1.3.0"
  lazy val scalaParser = "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
  lazy val jaxbApi = "javax.xml.bind" % "jaxb-api" % "2.3.0"
  lazy val dispatchV = "$dispatch_version$"
  lazy val dispatch = "org.dispatchhttp" %% "dispatch-core" % dispatchV
}

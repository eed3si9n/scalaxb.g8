resolvers ++= Seq(
  "sonatype-public" at "https://oss.sonatype.org/​content/repositories/public",
  "repo.codahale.com" at "http://repo.codahale.com")

addSbtPlugin("org.scalaxb" % "sbt-scalaxb" % "$scalaxb_version$")

version := "0.1"
lazy val root = project in file(".")
scalaVersion := "2.10.7"

libraryDependencies ++= Seq(
  "commons-beanutils" % "commons-beanutils" % "1.11.0" % "test",
  "org.eclipse.jetty" % "jetty-runner" % "9.2.4.v20141103" % "provided",
  "com.github.t3hnar" % "scala-bcrypt_2.10" % "2.6" % "runtime",
  "org.apache.commons" % "commons-collections4" % "4.1",
  "com.google.oauth-client" % "google-oauth-client" % "1.22.0" % "optional"
)

dependencyCheckFormats := Seq("XML", "JSON")
dependencyCheckFormat := "HTML"
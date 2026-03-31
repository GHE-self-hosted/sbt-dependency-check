version := "0.1"
lazy val root = project in file(".")
scalaVersion := "3.8.3"

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-runner" % "11.0.26"
)

dependencyCheckFailBuildOnCVSS := 1
dependencyCheckSuppressionFiles := Seq(new File("suppressions.xml"))
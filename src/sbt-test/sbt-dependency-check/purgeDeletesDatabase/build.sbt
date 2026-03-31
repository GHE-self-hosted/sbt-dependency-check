import sbt.File

version := "0.1"
lazy val root = project in file(".")
scalaVersion := "3.8.3"

dependencyCheckAutoUpdate := Some(false)
dependencyCheckDataDirectory := Some(new File(baseDirectory.value + "/tmp/sbt-dependency-check"))


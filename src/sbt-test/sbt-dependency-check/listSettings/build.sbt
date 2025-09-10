version := "0.1"
lazy val root = project in file(".")
scalaVersion := "2.13.16"

dependencyCheckSuppressionFiles := Seq(baseDirectory.value / "src/main/resources", baseDirectory.value / "src/app/")
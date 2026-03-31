version := "0.1"
lazy val root = project in file(".")
scalaVersion := "3.8.3"

dependencyCheckSuppressionFiles := Seq(baseDirectory.value / "src/main/resources", baseDirectory.value / "src/app/")
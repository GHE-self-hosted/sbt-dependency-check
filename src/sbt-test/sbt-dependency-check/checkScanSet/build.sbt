version := "0.1"
lazy val root = project in file(".")
scalaVersion := "3.8.3"

dependencyCheckFailBuildOnCVSS := 0
dependencyCheckScanSet := Seq(baseDirectory.value / "src/main/customDir")
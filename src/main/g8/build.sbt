// give the user a nice default project!
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$organization$",
      scalaVersion := "2.13.0"
    )),
    name := "$name$",
    addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.10.3"),
    libraryDependencies ++= Seq(
      Dependencies.catsCore,
      Dependencies.catsEffect,
      Dependencies.miniTest,
      Dependencies.miniTestLaws,
      Dependencies.scalaCheck
    )
  )

// give the user a nice default project!
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$organization$",
      scalaVersion := "2.12.4"
    )),
    name := "$name$",
    addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.4"),
    libraryDependencies ++= Seq(
      Dependencies.catsCore,
      Dependencies.catsEffect,
      Dependencies.miniTest,
      Dependencies.miniTestLaws,
      Dependencies.scalaCheck
    )
  )

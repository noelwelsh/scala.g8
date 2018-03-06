import sbt._

object Dependencies {
  // Library Versions
  val catsVersion       = "1.0.1"
  val catsEffectVersion = "0.9"
  val miniTestVersion   = "2.1.1"
  val scalaCheckVersion = "1.13.4"

  // Libraries
  val catsCore     = "org.typelevel"  %% "cats-core"     % catsVersion
  val catsEffect   = "org.typelevel"  %% "cats-effect"   % catsEffectVersion
  val miniTest     = "io.monix"       %% "minitest"      % miniTestVersion   % "test"
  val miniTestLaws = "io.monix"       %% "minitest-laws" % miniTestVersion   % "test"
  val scalaCheck   = "org.scalacheck" %% "scalacheck"    % scalaCheckVersion % "test"
}

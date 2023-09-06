organization := "com.typesafe.sbt"

name := "sbt-osgi"

enablePlugins(SbtPlugin)

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

libraryDependencies ++= Dependencies.sbtOsgi

crossSbtVersions := Seq("1.9.4")

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-encoding", "UTF-8"
)

publishMavenStyle := false

organization := "uk.co.turingatemyhamster"

name := "graphviz-s"

version := "1.0"

scalaVersion := "2.10.3"

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.3.4" % "test"
)

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"


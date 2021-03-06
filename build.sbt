sbtPlugin := true

name := "sbt-findsecbugs"
organization := "nl.codestar"
version := "0.10-SNAPSHOT"
description := "The Findbugs security plugin wrapped in a sbt plugin"

scalaVersion := "2.12.3"
scalacOptions ++= Seq("-encoding", "UTF8", "-Xfatal-warnings",
  "-deprecation", "-feature", "-unchecked", "-Xlint",
  "-Ywarn-dead-code", "-Ywarn-adapted-args"
)

scriptedLaunchOpts := { scriptedLaunchOpts.value ++
  Seq("-Xmx1024M", "-Dplugin.version=" + version.value)
}
scriptedBufferLog := false

libraryDependencies += "com.h3xstream.findsecbugs" % "findsecbugs-plugin" % "1.7.1"

bintrayRepository := "sbt-plugins"
bintrayOrganization := None

licenses += ("MIT", url("https://opensource.org/licenses/MIT"))

publishMavenStyle := false

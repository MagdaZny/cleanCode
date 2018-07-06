name := """letShout"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  // -- Play --
  "com.typesafe.play" %% "play-ws" % "2.6.11",
  "com.typesafe.play" %% "play-ahc-ws-standalone" % "1.1.3",
  "com.typesafe.play" %% "play-ws-standalone-json" % "1.1.3",

  // -- Guice --
  "net.codingwell" %% "scala-guice" % "4.1.0",

  // -- Testing --
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test,
  "com.github.tomakehurst" % "wiremock" % "2.10.1" % Test,
  "org.mockito" % "mockito-core" % "2.10.0" % Test,
  "org.apache.directory.api" % "api-i18n" % "1.0.0-M18",
  "com.typesafe.play" %% "play-specs2" % "2.6.13" % Test
)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"

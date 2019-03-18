lazy val root = (project in file("."))
  .settings(
    name := "ZooApp",
    organization := "xyz.discretezoo",
    scalaVersion := "2.12.7",
    version := "1.1.0-SNAPSHOT",
    resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
    libraryDependencies ++=
Seq(
  "com.typesafe.akka" %% "akka-http"   % "10.1.5",
  "com.typesafe.akka" %% "akka-actor" % "2.5.18",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.18" % Test,
  "com.typesafe.akka" %% "akka-stream" % "2.5.18",
  "com.typesafe.akka" %% "akka-stream-testkit" % "2.5.18" % Test,
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.5",
  // cors
  "ch.megard" %% "akka-http-cors" % "0.3.1",
  // slick dependencies
  "com.typesafe.slick" %% "slick" % "3.3.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.3.0",
  "org.postgresql" % "postgresql" % "42.2.5",
  // arrays for slick
  "com.github.tminglei" %% "slick-pg" % "0.16.2"
)
  )


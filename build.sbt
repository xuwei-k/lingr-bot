version := "1.0"

organization := "com.yuroyoro"

scalaVersion := "2.9.1"

name := "lingr-bot"

startYear := Some(2007)

scalacOptions ++= Seq("-deprecation")

//jetty 6.1.1とかなぜか見つからなかったので勝手に適当なversionに上げた
libraryDependencies ++= {
  val gaeVersion = "1.4.0" // TODO もっと新しいのでてる
  Seq(
    "org.eclipse.jetty" % "jetty-webapp" % "7.6.0.v20120127" % "container",
    "com.google.appengine" % "appengine-api-1.0-sdk" % gaeVersion,
    "com.google.appengine" % "appengine-api-labs" % gaeVersion,
    "javax.servlet" % "servlet-api" % "2.5" % "provided",
    "junit" % "junit" % "4.5" % "test" //現状使ってない？
  )
}

seq(appengineSettings: _*)


enablePlugins(ScalaJSPlugin)

name := "Example"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.7"

persistLauncher in Compile := true

persistLauncher in Test := false

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.8.0",
  "be.doeraene" %%% "scalajs-jquery" % "0.8.0",
  "com.gilt" %% "handlebars-scala" % "2.0.1"
)


jsDependencies += "org.webjars" % "jquery" % "1.10.2" / "jquery.js" % "test"
jsDependencies += "org.webjars" % "mustachejs" % "0.8.2" / "mustache.js" commonJSName "Mustache"

skip in packageJSDependencies := false

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.0" % "test"

testFrameworks += new TestFramework("utest.runner.Framework")
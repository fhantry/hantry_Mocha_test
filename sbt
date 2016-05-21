import sbt._
import sbt.Keys._

lazy val root = (project in file(".")).settings(
name := "top_10_airport",
version := "1.0",
scalaVersion := "2.11.8"
)


libraryDependencies ++= Seq("org.apache.spark" %% "spark-core" % "1.6.0",
  "org.apache.spark" %% "spark-mllib"% "1.6.0",
"com.databricks" %% "spark-csv" % "1.4.0",
  "org.scalanlp" %% "breeze" % "0.12",
  "org.scalanlp" %% "breeze-natives" % "0.12",
  "org.scalanlp" %% "breeze-viz" % "0.12"
  )

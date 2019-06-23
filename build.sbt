ThisBuild / organization := "com.eed3si9n"
ThisBuild / version      := "0.2.1-SNAPSHOT"
ThisBuild / description  := "sbt plugin to define project matrix for cross building"
ThisBuild / licenses     := Seq("MIT License" -> url("https://github.com/sbt/sbt-projectmatrix/blob/master/LICENSE"))
ThisBuild / crossScalaVersions := Seq("2.11.12","2.12.8")

lazy val root = (project in file("."))
  .enablePlugins(SbtPlugin)
  .settings(
    sbtPlugin := true,
    name := "sbt-projectmatrix",
    scalacOptions := Seq("-deprecation", "-unchecked"),
    publishMavenStyle := false,
    bintrayOrganization in bintray := None,
    bintrayRepository := "sbt-plugins",
    scriptedLaunchOpts := { scriptedLaunchOpts.value ++
      Seq("-Xmx1024M", "-Dplugin.version=" + version.value)
    },
    scriptedBufferLog := false,
  )

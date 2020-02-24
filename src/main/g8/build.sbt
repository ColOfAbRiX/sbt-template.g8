import Dependencies._
import AllProjectsKeys.autoImport._

lazy val ScalaLangVersion = "$scalaVersion$"

// General
ThisBuild / organization := "$package$"
ThisBuild / scalaVersion := ScalaLangVersion

// Compiler options
ThisBuild / scalacOptions ++= Compiler.TpolecatOptions ++ Seq("-P:splain:all")

// GIT version information
ThisBuild / dynverVTagPrefix := false

// Wartremover
ThisBuild / wartremoverExcluded ++= (baseDirectory.value * "**" / "src" / "test").get
ThisBuild / wartremoverErrors ++= Warts.allBut(
  Wart.Any,
  Wart.Nothing,
  Wart.Overloading,
  Wart.ToString,
)

// Scalafmt
ThisBuild / scalafmtOnCompile := true

// Global dependencies and compiler plugins
ThisBuild / libraryDependencies ++= Seq(
  BetterMonadicForPlugin,
  KindProjectorPlugin,
  PPrintDep,
  SlainPlugin,
  WartremoverPlugin,
) ++ Seq(
).flatten

//  PROJECTS  //

// Root project
lazy val rootProject: Project = project
  .in(file("."))
  .settings(
    name := "$name;format="normalize"$",
    description := "$description$",
  )
  .aggregate(
    $name;format="camel"$$basicProject;format="Camel"$,
    $name;format="camel"$$ioBasicProject;format="Camel"$,
    $name;format="camel"$$appProject;format="Camel"$,
    $name;format="camel"$$webProject;format="Camel"$,
  )

// Utils project
lazy val $name;format="camel"$Utils = project
  .in(file("module-utils"))
  .settings(
    name := "utils",
    description := "Global Utilities",
    libraryDependencies ++= Seq(
      CatsCoreDep,
      CatsScalaTestDep,
      FS2CoreDep,
      ScalatestDep,
    ),
  )

// Sample basic application
lazy val $name;format="camel"$$basicProject;format="Camel"$ = project
  .in(file("module-basic"))
  .dependsOn(
  )
  .settings(
    name := "basic",
    description := "Basic application",
    libraryDependencies ++= Seq(
    ).flatten ++ Seq(
      ScalatestDep,
    ),
  )

// Sample basic application with IO
lazy val $name;format="camel"$$ioBasicProject;format="Camel"$ = project
  .in(file("module-io-basic"))
  .dependsOn(
  )
  .enablePlugins(BuildInfoPlugin)
  .settings(
    name := "io-basic",
    description := "Basic application with IO",
    buildInfoPackage := projectPackage.value,
    buildInfoKeys ++= projectBuildInfo.value,
    libraryDependencies ++= Seq(
      CatsBundle,
    ).flatten ++ Seq(
      ScalatestDep,
    ),
  )

// Sample application
lazy val $name;format="camel"$$appProject;format="Camel"$ = project
  .in(file("module-app"))
  .dependsOn(
    $name;format="camel"$Utils
  )
  .enablePlugins(BuildInfoPlugin)
  .settings(
    name := "app",
    description := "Basic full-fledged application",
    buildInfoPackage := projectPackage.value,
    buildInfoKeys ++= projectBuildInfo.value,
    libraryDependencies ++= Seq(
      CatsBundle,
      LoggingBundle
    ).flatten ++ Seq(
      ScalatestDep,
      PureconfigDep,
    ),
  )

// Sample web application
lazy val $name;format="camel"$$webProject;format="Camel"$ = project
  .in(file("module-web"))
  .dependsOn(
    $name;format="camel"$Utils
  )
  .enablePlugins(BuildInfoPlugin)
  .settings(
    name := "web",
    description := "Basic web application",
    buildInfoPackage := projectPackage.value,
    buildInfoKeys ++= projectBuildInfo.value,
    libraryDependencies ++= Seq(
      HttpServiceBundle,
    ).flatten ++ Seq(
      ScalatestDep,
      ShapelessDep,
    ),
  )

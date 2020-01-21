// Project name (artifact name in Maven)
name := "libsvm"

// orgnization name (e.g., the package name of the project)
organization := "jschiff.ml"

version := "1.0-SNAPSHOT"

// project description
description := "LibSvm Fork"

// Enables publishing to maven repo
publishMavenStyle := true

// Do not append Scala versions to the generated artifacts
crossPaths := false

// This forbids including Scala related libraries into the dependency
autoScalaLibrary := false

// library dependencies. (orginization name) % (project name) % (version)
libraryDependencies ++= Seq(
)

javacOptions in (Compile, compile) ++= Seq("-g")

//logLevel in compile := Level.Debug
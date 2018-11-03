load("@bazel_tools//tools/jdk:default_java_toolchain.bzl", "default_java_toolchain", "JDK8_JVM_OPTS", "DEFAULT_JAVACOPTS")

default_java_toolchain(
    name = "default_java_toolchain",
    bootclasspath = ["@bazel_tools//tools/jdk:platformclasspath"],
    jvm_opts = JDK8_JVM_OPTS,
    misc = DEFAULT_JAVACOPTS + [
        "-XepDisableAllChecks",
    ],
    source_version = "8",
    target_version = "8",
    visibility = ["//visibility:public"],
)

java_runtime(
    name = "jdk8",
    srcs = [],
    java_home = "/usr/local/lib/jvm/java-8-latest",
    visibility = ["//visibility:public"],
)

workspace(name = "velocity_infra")
load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
load("@bazel_tools//tools/build_defs/repo:java.bzl", "java_import_external")

java_import_external(
  name = "org_atmosphere_wasync",
  jar_urls = [
    "https://repo.maven.apache.org/maven2/org/atmosphere/wasync/2.1.5/wasync-2.1.5.jar"
  ],
  licenses = ["notice"],
  jar_sha256 = "46757e8cfadfc4f64a00d91359d3bdc5fa4c864130c9d0edb5df4dc70e8bb479",
)

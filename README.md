# strict-deps-regression-18.1
repro for strict-deps regression bazel 0.18.1
apparently 0.18.X broke strict-deps=warn and builds now fail instead of succeeding.
https://github.com/bazelbuild/bazel/issues/6580
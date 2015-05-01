package org.doomedsociety.gradlecpp.cfg


public interface ToolchainConfig {
    CompilerConfig getCompilerConfig()
    LinkerConfig getLinkerConfig()
}
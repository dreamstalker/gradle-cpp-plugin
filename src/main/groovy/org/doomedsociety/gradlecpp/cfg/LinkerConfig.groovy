package org.doomedsociety.gradlecpp.cfg

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked

@CompileStatic @TypeChecked
abstract class LinkerConfig extends ToolConfig {
    List<String> libDirectories = []
    List<String> extraLibs = []
}

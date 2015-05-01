package org.doomedsociety.gradlecpp.cfg

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked

@CompileStatic @TypeChecked
abstract class CompilerConfig extends ToolConfig {
    Map<String, String> extraDefines = [:]
    List<String> includeDirs = []
}

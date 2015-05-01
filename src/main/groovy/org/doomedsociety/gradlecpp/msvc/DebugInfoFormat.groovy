package org.doomedsociety.gradlecpp.msvc

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked
import org.doomedsociety.gradlecpp.cfg.ParameterOption

@CompileStatic @TypeChecked
enum DebugInfoFormat implements ParameterOption {
    NONE(null),
    C7_COMPATIBLE('/Z7'),
    PROGRAM_DATABASE('/Zi'),
    PROGRAM_DATABASE_FOR_EDIT_AND_CONTINUE('/ZI')

    String param;

    DebugInfoFormat(String param) {
        this.param = param
    }


    @Override
    String getParameter() {
        return param
    }
}

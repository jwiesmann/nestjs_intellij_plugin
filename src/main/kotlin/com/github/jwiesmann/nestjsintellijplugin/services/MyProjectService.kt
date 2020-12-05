package com.github.jwiesmann.nestjsintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.jwiesmann.nestjsintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

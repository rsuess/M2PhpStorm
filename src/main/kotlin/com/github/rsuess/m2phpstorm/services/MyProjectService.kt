package com.github.rsuess.m2phpstorm.services

import com.intellij.openapi.project.Project
import com.github.rsuess.m2phpstorm.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

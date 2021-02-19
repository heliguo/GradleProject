package com.example.buildsrc

import org.gradle.api.Plugin
import org.gradle.api.Project

class PluginDemo implements Plugin<Project> {
    @Override
    void apply(Project project) {
        //        def author = new ExtensionDemo()
        def author = project.extensions.create('lgh',ExtensionDemo)
        println("hello ${author.name}")
        project.afterEvaluate {
            println("hello ${author.name}")
        }
    }
}
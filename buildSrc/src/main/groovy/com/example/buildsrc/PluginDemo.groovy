package com.example.buildsrc

import com.android.build.gradle.BaseExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class PluginDemo implements Plugin<Project> {
    @Override
    void apply(Project project) {
        //        def author = new ExtensionDemo()
        def author = project.extensions.create('lgh', ExtensionDemo)
        println("1 hello ${author.name}")
        project.afterEvaluate {
            println("2 hello ${author.name}")
        }

        def transform = new TransformDemo()
        def baseExtension = project.extensions.getByType(BaseExtension)
        println("bootClasspath${baseExtension.bootClasspath}")
        baseExtension.registerTransform(transform)
    }
}
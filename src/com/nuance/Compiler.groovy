package com.nuance
class Compiler {
    static def compileDirectory(directory) {
        sh """echo ${directory}"""
    } 
}
package com.nuance

class FileCompiler implements Serializable {
    def script  
    def project
    FileCompiler(script, String project) {     
        this.script = script   
        this.project = project
        this.script.echo("Compiling ${project}")
    }   
    
    def analyze(String file) {
        this.script.echo("${project}/${file}")    
        this.script.sh("pwd")
    }

    def verifpara(String s2version) {
        // int buildNum = s2version.substring(10) as Integer
        // if (buildNum > 3880)
        // {
        //     echo "Build ${buildNum} is new enough to build directly on the grid."
        //     return true
        // }
        // else
        // {
        //     echo "Build ${buildNum} is old enough that we will build on our blade."
        //     return false
        // }
        return false
    }
}
package com.nuance

public class Utility {
    
    def verifpara(String s2version) {
        int buildNum = s2version.toInteger()
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
        return buildNum
    }
}
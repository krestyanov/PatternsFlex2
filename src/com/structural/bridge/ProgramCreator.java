package com.structural.bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program [] programs = {
                new System1(new JavaDeveloper()),
                new System2(new PhpDeveloper())

        };

        for(Program program: programs){
            program.developeProgram();
        }
    }
}

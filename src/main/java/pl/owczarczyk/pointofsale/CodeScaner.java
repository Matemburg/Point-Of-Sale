package pl.owczarczyk.pointofsale;

import java.util.Random;



public class CodeScaner {
    Random CodeGenerator;

    public CodeScaner() {
        CodeGenerator = new Random();
    }

    public int scan()
    {
        return CodeGenerator.nextInt(7);
    }   
    
}

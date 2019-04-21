/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.owczarczyk.pointofsale;

import java.util.Random;



public class CodeScaner {
Random CodeGenerator;

    public CodeScaner() {
        CodeGenerator = new Random();
    }

    public int Scan()
    {
    return CodeGenerator.nextInt(7);
    }   
    
}

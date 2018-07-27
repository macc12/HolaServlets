/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author LabingXEON
 */
public class BD {
    private ArrayList<Persona> per;
    public BD () {
        per = new ArrayList<>();
        per.add(new Persona("Ana", "B"));
        per.add(new Persona("Mar", "C"));
        per.add(new Persona("Cielo", "Z"));
        per.add(new Persona("Tom", "K"));        
    }
    
    public void add(Persona persona){
        per.add(persona);
    }
    public ArrayList<Persona> getPersona () {
        return per;
    }
}

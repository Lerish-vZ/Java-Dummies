/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book4.chp6;

/**
 *
 * @author lerishav
 */
public class Spell {
    
    public String name; 
    public SpellType type; 
    public String description;
    
    public enum SpellType{SPELL, CHARM, CURSE}
    
    public Spell(String spellName, SpellType spellType, String spellDescription){
        name = spellName; 
        type = spellType;
        description = spellDescription;
    }
    
    public String toString(){
        return name;
    }
    
}

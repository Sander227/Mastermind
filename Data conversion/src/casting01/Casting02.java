package casting01;

public class Casting02 {
    public static void main(String[] args) {
                
        //World population today
        long currentWorldPop = 7_000_000_000L;
        System.out.println("Current World Population: " +currentWorldPop);
        
        //World population in 1950,  Source: United Nations Population Division
        //2.52 Billion
        long africaPop   =   221_000_000;
        long asiaPop     = 1_402_000_000;
        long europePop   =   547_000_000;
        long americasPop =   339_000_000;
        long oceanaPop   =    13_000_000;
        long antwoord = africaPop +asiaPop +europePop +americasPop +oceanaPop;
        
        System.out.println("World Population in 1950: " + (long) antwoord);
        
        //The current population of Asia is an estimated 60% of the world population
        double percentAsia = 0.6;
        long currentAsiaPop = (long) (currentWorldPop * percentAsia);
        System.out.println("Current Asia Population: " +currentAsiaPop);      
       
    }  
}

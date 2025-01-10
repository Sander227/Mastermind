package casting01;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "887ds7nds87dsfs";
        
        int shirtPrice2 = Integer.parseInt(shirtPrice);
        System.out.println(shirtPrice2);
        double taxRate2 = Double.parseDouble(taxRate);
        System.out.println(taxRate2);
        System.out.println(shirtPrice2 * taxRate2);

//        int gibberish2 = Integer.parseInt(gibberish);
//        System.out.println(gibberish2);
//        De gibberisch pakt het pogramma niet omdat het letters en cijfers zijn dus een error
        
        
        
        //Parse shirtPrice and taxRate, and print the total tax
        
        
        
        //Try to parse taxRate as an int
        
        //Try to parse gibberish as an int
        
    }
    
}

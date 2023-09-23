package MainPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppleFactory implements GroceryProductFactory {
    
    //Private internal variables used in the factory.
    private final File productFile;
    private String nameFromFile;
    private float priceFromFile;
 
    //The AppleFactory Constructor which scans an input file
    //ProductList.txt and appropriately parses and sets the 
    //current name and price of the product.
    public AppleFactory() throws FileNotFoundException{
        this.productFile = new File("ProductList.txt");
        Scanner lineReader = new Scanner(this.productFile);
        while(lineReader.hasNext()){             
            if(lineReader.hasNext("Apple")){
                
                this.nameFromFile = lineReader.next();
                lineReader.next();
                if(lineReader.hasNextFloat()){
                    this.priceFromFile = lineReader.nextFloat();
                }
           }
           if(lineReader.hasNext()){
                lineReader.next();
           }
        }
    }

    //Public method to create a new Apple Object with the 
    //appropriate name and price.
    @Override
    public Apple createApple() {
        Apple newApple = new Apple();
        newApple.setName(this.nameFromFile);
        newApple.setPrice(this.priceFromFile);
        return newApple;

    }

    //Null Methods required based on GroceryProductFactory Interface.
    @Override
    public Banana createBanana() {return null;}
    
}

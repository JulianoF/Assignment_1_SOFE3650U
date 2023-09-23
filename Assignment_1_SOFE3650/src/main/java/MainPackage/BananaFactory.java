package MainPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BananaFactory implements GroceryProductFactory {
    
    //Private internal variables used in the factory.
    private final File productFile;
    private String nameFromFile;
    private float priceFromFile;
    
    //The BananaFactory Constructor which scans an input file
    //ProductList.txt and appropriately parses and sets the 
    //current name and price of the product.
    public BananaFactory() throws FileNotFoundException{
        this.productFile = new File("ProductList.txt");
        Scanner lineReader = new Scanner(this.productFile);
        while(lineReader.hasNext()){             
            if(lineReader.hasNext("Banana")){
                
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

    //Public method to create a new Banana Object with the 
    //appropriate name and price.
    @Override
    public Banana createBanana() {
        Banana newBanana = new Banana();
        newBanana.setName(this.nameFromFile);
        newBanana.setPrice(this.priceFromFile);
        return newBanana;
    }
    
    //Null Methods required based on GroceryProductFactory Interface.
    @Override
    public Apple createApple() {return null;}
}

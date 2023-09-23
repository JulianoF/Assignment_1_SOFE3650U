package TestPackage;

import MainPackage.AppleFactory;
import MainPackage.BananaFactory;
import MainPackage.GroceryProduct;
import MainPackage.GroceryProductFactory;
import java.io.FileNotFoundException;

public class Assignment_1_SOFE3650 {

    public static void main(String[] args) throws FileNotFoundException {
        
        //Creating a new AppleFactory object and a new BananaFactory object
        //to be used to create Apples and Bananas.
        GroceryProductFactory appleFac = new AppleFactory();
        GroceryProductFactory BananaFac = new BananaFactory();
        
        //Using the AppleFactory to create two new Apples.
        GroceryProduct appleOne = appleFac.createApple();
        GroceryProduct appleTwo = appleFac.createApple();
        
        //Using the BananaFactory to create two new Apples.
        GroceryProduct bananaOne = BananaFac.createBanana();
        GroceryProduct bananaTwo = BananaFac.createBanana();
        
        //Printing output showing the Two Apple and Banana Objects
        //with set names and set prices.
        System.out.println(appleOne.getName()+": $"+appleOne.getPrice());
        System.out.println(appleTwo.getName()+": $"+appleTwo.getPrice());
        System.out.println(bananaOne.getName()+": $"+bananaOne.getPrice());
        System.out.println(bananaTwo.getName()+": $"+bananaTwo.getPrice());
        
                
    }
}

package MainPackage;

public class Apple implements GroceryProduct{
    
    //Private internal variables to control access to them.
    private String name;
    private float price;
    
    //Default Apple constructer setting name to null
    //and price to 0.
    public Apple(){
        this.name = null;
        this.price = 0;
    }

    //Public setter to set the name.
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    //Public setter to set the price.
        @Override
    public void setPrice(float price) {
        this.price = price;
    }

    //Public getter to get the name.
    @Override
    public String getName() {
        return this.name;
    }
    
    //Public getter to get the price
    @Override
    public float getPrice() {
        return this.price;
    }
    
}

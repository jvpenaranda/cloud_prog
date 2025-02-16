import java.util.ArrayList;

class InventoryManagementSystem {
    private ArrayList<Product>products;
    
    public InventoryManagementSystem(){
        this.products = new ArrayList<>();
    }
    
    public void addProduct(String Name, int Price){
        Product product = new Product(Name,Price);
        products.add(product);
        System.out.println("Product Add" + Name + "P" + Price);
    }
    
    public void displayProducts(){
        if(products.isEmpty()){
            System.out.println("No Products Available.");
            
        }
        else{
            System.out.println("     PRODUCTS     ");
            
            for(Product product : products){
                System.out.println("Product Name: " + product.getName() +  "\n Product Price: " + product.getPrice());
            }
        }
    }
    
}
//John Vincent Penaranda

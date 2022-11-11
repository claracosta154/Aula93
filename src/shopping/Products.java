package shopping;

import java.util.ArrayList;
import java.util.List;

public class Products {
    // lista de produtos
    private List<Product> products = new ArrayList<Product>();

    // construtor da classe que chama o método que carrega a lista de produtos - estoque

    public Products() {
        this.storeItems();
    }
    
//construtor da classe que chama o método de carregar a lista de produtos - estoque
    public List<Product> getProducts() {
        return products;
    }

//método para armazenamento inicial dos produtos em estoque
    private void storeItems(){
    
        this.products.add(new Product(products.size(), name: "Perfume", brand: "boticário" , description: "cheiroso", price:100.00 , stock:10.00))

        this.products.add(new Product(products.size(), name: "Sabonete", brand: "boticário" , description: "cheiroso demais", price:10.00 , stock:10.00))

        this.products.add(new Product(products.size(), name: "Óleo mineral", brand: "boticário" , description: "bem cheiroso", price:30.00 , stock:10.00))

        this.products.add(new Product(products.size(), name: "Shampoo", brand: "boticário" , description: "bom", price:15.00 , stock:10.00))

        this.products.add(new Product(products.size(), name: "Perfume", brand: "Desodorante" , description: "cheiro bom", price:30.00 , stock:10.00))

        this.products.add(new Product(products.size(), name: "Perfume", brand: "Creme de mão" , description: "barato", price:50.00 , stock:10.00))

        this.products.add(new Product(products.size(), name: "Batom", brand: "boticário" , description: "bonito", price:50.00 , stock:10.00))

           
    }
}

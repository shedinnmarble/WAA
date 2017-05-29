import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by dewei.xiang on 5/28/17.
 */

@ManagedBean(name = "ProductController", eager = true)
@SessionScoped
public class ProductController {
    // create product
    // show the list
    // add to cart
    // remove from cart
    private List<Product> productList;
    private Map<Product, Integer> shoppingCart;
    private double totalPrice;

    public ProductController() {
        this.shoppingCart = new HashMap<>();
    }

    public void addProductToCart(Product p, int quantity) {
        if (this.shoppingCart.containsKey(p)) {
            // get count
            int count = this.shoppingCart.get(p);
            this.shoppingCart.replace(p, ++count);
        } else {
            this.shoppingCart.put(p, 1);
        }
        System.out.println(String.format("Shopping cart has %d items.", this.shoppingCart.size()));
        double totalPrice = this.shoppingCart.entrySet().stream().map(product -> product.getValue() * product.getKey().getPrice()).reduce(0.0, (a, b) ->
                a + b);
        this.setTotalPrice(totalPrice);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Map<Product, Integer> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(Map<Product, Integer> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public List<Product> getProductList() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "The winner take all", 12.95));
        products.add(new Product(2, "Yellow submarine", 11.35));
        products.add(new Product(3, "Macbook pro", 9.99));
        products.add(new Product(4, "Califormation Road trip", 12999.95));
        return products;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}

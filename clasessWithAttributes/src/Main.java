public class Main {

    public static void main(String[] args) {



        Product product = new Product();

        product.setName("Laptop Z5");
        product.setId(1);
        product.setPrice(8299);
        product.setDesc("Siyah");
        product.setStockAmount(100);

        Product product2 = new Product(2,"Kahve makinesi","Xiaomi",3439,49);


        ProductManager productManager = new ProductManager();

        productManager.AddProduct(product);

        System.out.println(product2.getKod());

    }
}

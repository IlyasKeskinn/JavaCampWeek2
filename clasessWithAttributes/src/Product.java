public class Product {

    //parameterized constructor
    public Product(int id, String name, String desc, double price,int stockAmount){
        System.out.println("Parametreli constructor çalıştı.");

        _id = id;
        _name = name;
        _desc = desc;
        _price = price;
        _stockAmount = stockAmount;
    }

    public Product(){
        System.out.println("Parametresiz constructor çalıştı.");
    }
    //attributes | fields

    private int _id;
    private String _name;
    private String _desc;
    private double _price;
    private int _stockAmount;
    private  String _kod;
    //getter
    public int getId() {
        return _id;
    }

    //setter
    public void setId(int id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDesc() {
        return _desc;
    }

    public void setDesc(String desc) {
        _desc = desc;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }

    public String getKod(){
        return _name.substring(0,1)  + _id;
    }
}

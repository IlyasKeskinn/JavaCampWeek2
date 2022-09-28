package com.company;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product();

        //set value
        product1.setName("Xiaomi Mi Robot Vacuum Mop 2c Robot Süpürge");
        product1.setUnitPrice(4999);
        product1.setDiscount(12);
        product1.setUnitInStock(10);
        product1.setImageUrl("image1.jpg");


        //get

        // System.out.println(product.name);


        Product product2 = new Product();

        //set value
        product2.setName("Arçelik Yumurtpa Pişirme Makinesi");
        product2.setUnitPrice(1239);
        product2.setDiscount(5);
        product2.setUnitInStock(2);
        product2.setImageUrl("image2.jpg");


        Product product3 = new Product();

        //set value
        product3.setName("Philips MG3720 Erkek Bakım Seti 7'si 1 arada");
        product3.setUnitPrice(799);
        product3.setDiscount(2);
        product3.setUnitInStock(10);
        product3.setImageUrl("image3.jpg");

        Product[] products = {product1, product2, product3};

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("0508323123");
        individualCustomer.setCustomerNumber("13221");
        individualCustomer.setFirsName("İlyas");
        individualCustomer.setLastName("Keskin");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Phoenix Yazılım");
        corporateCustomer.setPhone("05123123");
        corporateCustomer.setTaxNumber("1111111111");
        corporateCustomer.setCustomerNumber("13222");

    }
}

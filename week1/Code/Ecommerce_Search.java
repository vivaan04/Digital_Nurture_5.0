package week_1;

import java.util.Arrays;

class Product {

    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {

        this.productId = productId;
        this.productName = productName;
        this.category = category;

    }

}


public class Ecommerce_Search {


    static Product linearSearch(Product products[], int id) {

        for (Product p : products) {

            if (p.productId == id) {

                return p;

            }

        }

        return null;

    }


    static Product binarySearch(Product products[], int id) {

        int left = 0;
        int right = products.length - 1;


        while (left <= right) {

            int mid = (left + right) / 2;


            if (products[mid].productId == id) {

                return products[mid];

            }

            else if (products[mid].productId < id) {

                left = mid + 1;

            }

            else {

                right = mid - 1;

            }

        }

        return null;

    }


    public static void main(String[] args) {


        Product products[] = {

                new Product(101,"Laptop","Electronics"),
                new Product(102,"Mobile","Electronics"),
                new Product(103,"Shoes","Fashion"),
                new Product(104,"Watch","Accessories")

        };


        Product result1 = linearSearch(products,103);


        if(result1 != null) {

            System.out.println("Linear Search Found: " + result1.productName);

        }


        Product result2 = binarySearch(products,104);


        if(result2 != null) {

            System.out.println("Binary Search Found: " + result2.productName);

        }


        System.out.println("Linear Search Time Complexity: O(n)");

        System.out.println("Binary Search Time Complexity: O(log n)");

    }

}
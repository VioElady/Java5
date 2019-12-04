import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {

        int productNumber = 1;
        int quantitySold;
        double priceProduct;
        double totalRetailValueProduct = 0;

        Scanner input = new Scanner(System.in);

        while (productNumber != 0) {
            System.out.println("Enter product number:");
            productNumber = input.nextInt();
            if (productNumber == 0)
                break;
            System.out.println("Enter the quantity sold");
            quantitySold = input.nextInt();

            switch (productNumber) {
                case 1:
                    priceProduct = 2.98;
                    totalRetailValueProduct = totalRetailValueProduct + (priceProduct * quantitySold);
                    break;
                case 2:
                    priceProduct = 4.50;
                    totalRetailValueProduct = totalRetailValueProduct + (priceProduct * quantitySold);
                    break;
                case 3:
                    priceProduct = 9.98;
                    totalRetailValueProduct = totalRetailValueProduct + (priceProduct * quantitySold);
                    break;
                case 4:
                    priceProduct = 4.49;
                    totalRetailValueProduct = totalRetailValueProduct + (priceProduct * quantitySold);
                    break;
                case 5:
                    priceProduct = 6.87;
                    totalRetailValueProduct = totalRetailValueProduct + (priceProduct * quantitySold);
                    break;
            }
            System.out.println("Total retail value is :" + totalRetailValueProduct);

        }
    }
}



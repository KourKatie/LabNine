/**
 * Created by Katie on 7/20/2017.
 */

import java.util.Scanner;

public class CarsApp {
    public static void main(String[] args) {

        Cars newCar = new Cars();
        int i = 0;
        int carNum =0;
        int count = 0;

        Scanner scnr = new Scanner(System.in);


        System.out.println("How many cars are you entering? ");
        carNum = scnr.nextInt();

        String[] carMakeArray = new String[carNum];
        String[] carModelArray = new String[carNum];
        Integer[] carYearArray = new Integer[carNum];
        Double[] carPriceArray = new Double[carNum];

    do {


        if (carNum <= 0) {
            System.out.println("Invalid number.");
            break;
        }

            System.out.println("Please enter the car make: ");
            newCar.setMake(scnr.next());
            carMakeArray[count] = newCar.getMake();

            System.out.println("Please enter the car model: ");
            newCar.setModel(scnr.next());
            carModelArray[count] = newCar.getModel();

            System.out.println("Please enter the car year: ");
            newCar.setYear(scnr.nextInt());

            if (newCar.getYear() <= 0 || newCar.getYear() >= 2019) {
                System.out.println("Invalid number.");
                break;
            }

            carYearArray[count] = newCar.getYear();

            System.out.println("Please enter the car price($): ");
            newCar.setPrice(scnr.nextDouble());

            if (newCar.getPrice() <= 0) {
                System.out.println("Invalid number.");
                break;
            }

            carPriceArray[count] = newCar.getPrice();

            count++;
    } while (count < carNum);

        System.out.println("--");
        System.out.println("Current Inventory: ");

    for (i = 0; i < carNum; i++) {
        System.out.println(carMakeArray[i]+ "\t" + carModelArray[i] + "\t" +
                carYearArray[i] + "\t" + "$" + carPriceArray[i]);
    }

    }
}

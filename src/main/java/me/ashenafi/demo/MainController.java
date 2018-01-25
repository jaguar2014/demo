package me.ashenafi.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping("/")
    public String showIndex(){
        String userName="";
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a user name");
        userName = keyboard.nextLine();

        System.out.println("hello "+userName);
        return "Hello "+userName;
    }
    @RequestMapping("/SalesReport")
    public String showSales(){
        double totalSalesAmount=0.0;
        double salesAmount =0.0;
        String taxCode ="";


        Scanner keyboard = new Scanner(System.in);

        System.out.println("Sales report");

        System.out.println("Please enter the sales Amount");
        salesAmount = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("Please enter the tax code 0 for exempt, 1 for 3% tax and 2 for 3% tax");
        taxCode=keyboard.nextLine();

        String result="";

        if (taxCode.equals("0")){
            totalSalesAmount=salesAmount+salesAmount*0;

            result = "for the tax code you entered which is  <ul> <li>"+taxCode+"</li></ul>";

            return  result +"Total Sales "+totalSalesAmount;
        } if (taxCode.equals("1")){
            result = "for the tax code you entered which is  <ul> <li>"+taxCode+"</li></ul>";
            totalSalesAmount=salesAmount+salesAmount*0.03;
            return result+ "Total Sales "+ totalSalesAmount+"";
        }
        if (taxCode.equals("2")){
            result = "for the tax code you entered which is  <ul> <li>"+taxCode+"</li></ul>";
            totalSalesAmount=salesAmount+salesAmount*0.05;

            return result + "<b>Total Sales "+totalSalesAmount+"</b>";
        }



       return " Please enter the correct tax code";


    }

}

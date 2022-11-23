/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_mid_081;

/**
 *
 * @author FA19-bse-081
 */
import java.util.*;
public class VisaBuilder{
    String NameForVisa;
    String nationality ;
    int Age;
    String Gender;
    String PurposeForVisa;
    Scanner sc = new Scanner(System.in);
    public void CollectData(){
    System.out.println("Visa Form");
    System.out.println("-----------------------");
    System.out.println("Enter your Name: ");
    NameForVisa = sc.nextLine();
    
    System.out.println("Enter your Nationality: ");
    nationality = sc.nextLine();
     System.out.println("Enter your age: ");
    Age = sc.nextInt();
    System.out.println("Enter your gender: ");
    Gender = sc.nextLine(); 
    System.out.println("Enter purpose of visa: ");
    PurposeForVisa = sc.nextLine();
    VisaConcreatBuilder obj = new VisaConcreatBuilder(
    NameForVisa,nationality,Age,Gender,PurposeForVisa);
    obj.creatVisa();
    }
    
    
}
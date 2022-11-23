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
public class VisitVisa extends VisaConcreatBuilder{
      public VisitVisa(String name,String nat, int age, String gender, String purpose) {
        super(name,nat, age, gender, purpose);
    }
    @Override
    public void creatVisa(){
        System.out.println("-------- This is Visit Visa --------- ");
        System.out.println("Your Name is : "+super.NameForVisa);
        System.out.println("Your Nationality is : "+super.Nationality);
        System.out.println("Your Age is : "+super.Age);
        System.out.println("Your Gender is : "+super.gender);  
        System.out.println("Your Purpose of Visa  is : "+super.PurposeForVisa);
        
    }
    
}
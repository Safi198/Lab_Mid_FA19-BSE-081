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
class BusnessVisa extends VisaConcreatBuilder {

    public BusnessVisa(String name,String Nation, int Agee, String Genderrrr, String purposeee) {
        super(name,Nation, Agee, Genderrrr, purposeee);
    }
    @Override
    public void creatVisa(){
        System.out.println("-------- This is Busnise Visa --------- ");
        System.out.println("Your Name is : "+super.NameForVisa);
        System.out.println("Your Nationality is : "+super.Nationality);
        System.out.println("Your Age is : "+super.Age);
        System.out.println("Your Gender is : "+super.gender);  
        System.out.println("Your Purpose of Visa  is : "+super.PurposeForVisa);
        
    }
    
}
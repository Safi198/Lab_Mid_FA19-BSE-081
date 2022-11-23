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
class VisaConcreatBuilder{
    String NameForVisa;
    String Nationality ; 
    int Age;
    String gender;
    String PurposeForVisa;
    BusnessVisa BusObj;
    MyStudyVisa Stdobj;
    VisitVisa VisVobj;
    VisaConcreatBuilder(String name,String nat, int age, String gender, String purpose ){
        this.NameForVisa = name;
        this.Nationality = nat;
        this.Age = age;
        this.gender = gender;
        this.PurposeForVisa = purpose;
    }
    public void creatVisa(){
        switch (this.PurposeForVisa) {
            case "Busnise":
                BusObj.creatVisa();
                break;
            case "Study":
                Stdobj.creatVisa();
                break;
            case "Visit":
                VisVobj.creatVisa();
                break;
            default:
                System.out.println("You Chose Nothing ");
                break;
        }
    }
    
}
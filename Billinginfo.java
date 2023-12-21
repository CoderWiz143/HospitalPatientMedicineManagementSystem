
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thinkpad
 */
public class Billinginfo {
   private int PatientID;
   private ArrayList<Integer> medicineID;
    
   private String recommendation, date;
   private int fee;

    public Billinginfo() {
        this.PatientID = 0;
        this.medicineID = new ArrayList<>();
        this.recommendation = "";
        this.date = "";
        this.fee = 0;
    }

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }

    public ArrayList<Integer> getMedicineID() {
        return medicineID;
    }

    public void setMedicineID(int medicineID) {
        this.medicineID.add( medicineID);
    }

    

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
    
    
    
    
}

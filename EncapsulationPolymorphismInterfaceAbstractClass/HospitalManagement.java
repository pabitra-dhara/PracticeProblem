/*7. Hospital Patient Management
Description: Design a system to manage patients in a hospital:
Create an abstract class Patient with fields like patientId, name, and age.
Add an abstract method calculateBill() and a concrete method getPatientDetails().
Extend it into subclasses InPatient and OutPatient, implementing calculateBill() with different billing logic.
Implement an interface MedicalRecord with methods addRecord() and viewRecords().
Use encapsulation to protect sensitive patient data like diagnosis and medical history.
Use polymorphism to handle different patient types and display their billing details dynamically.
 */
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    Patient() {}

    protected void setDetails(String id,String n,int a){
        patientId=id; name=n; age=a;
    }

    public void getPatientDetails(){
        System.out.println("ID: "+patientId+", Name: "+name+", Age: "+age);
    }

    public abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int daysAdmitted;
    private String[] records = new String[10];
    private int recordCount = 0;

    InPatient(String id,String name,int age,double rate,int days){
        setDetails(id,name,age);
        dailyRate = rate;
        daysAdmitted = days;
    }

    public double calculateBill(){
        return dailyRate * daysAdmitted;
    }

    public void addRecord(String record){
        if(recordCount < records.length){
            records[recordCount++] = record;
        }
    }

    public void viewRecords(){
        System.out.print("Medical Records: ");
        for(int i=0;i<recordCount;i++){
            System.out.print(records[i]+"; ");
        }
        System.out.println();
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String[] records = new String[10];
    private int recordCount = 0;

    OutPatient(String id,String name,int age,double fee){
        setDetails(id,name,age);
        consultationFee = fee;
    }

    public double calculateBill(){
        return consultationFee;
    }

    public void addRecord(String record){
        if(recordCount < records.length){
            records[recordCount++]=record;
        }
    }

    public void viewRecords(){
        System.out.print("Medical Records: ");
        for(int i=0;i<recordCount;i++){
            System.out.print(records[i]+"; ");
        }
        System.out.println();
    }
}

public class HospitalManagement{
    public static void main(String[] args){
        Patient p1 = new InPatient("P101","Pabitra",30,2000,3);
        Patient p2 = new OutPatient("P102","Ram",25,500);
        handlePatient(p1);
        handlePatient(p2);
    }

    static void handlePatient(Patient p){
        p.getPatientDetails();
        System.out.println("Bill: "+p.calculateBill());
        MedicalRecord m = (MedicalRecord)p;
        m.addRecord("Diagnosis: Example");
        m.viewRecords();
    }
}

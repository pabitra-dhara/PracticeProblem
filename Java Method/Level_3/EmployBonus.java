/*11.Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Create a Method to determine the Salary and years of service and return the same. Use the Math.random() method to determine the 5-digit salary for each employee and also use the random method to determine the years of service. Define 2D Array to save the salary and years of service.
Write a Method to calculate the new salary and bonus based on the logic defined above and return the new 2D Array of the latest salary and bonus amount 
Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and display it in a Tabular Format
 */
public class EmployBonus {
    static void generateData(int[][] d){
        for(int i=0;i<d.length;i++){
            d[i][0]=10000+(int)(Math.random()*90000);
            d[i][1]=1+(int)(Math.random()*10);
        }
    }
    static void calculateAndDisplay(int[][] d){
        double tOld=0,tNew=0,tBonus=0;
        System.out.println("EmpID OldSalary Years Bonus NewSalary");
        for(int i=0;i<d.length;i++){
            int s=d[i][0],y=d[i][1];
            double b=(y>5)?s*0.05:s*0.02;
            double n=s+b;
            tOld+=s; tBonus+=b; tNew+=n;
            System.out.println((i+1)+" "+s+" "+y+" "+b+" "+n);
        }
        System.out.println("TOTAL  "+(int)tOld+" "+tBonus+" "+tNew);
    }
    public static void main(String[] args){
        int[][] d=new int[10][2];
        generateData(d);
        calculateAndDisplay(d);
    }
}

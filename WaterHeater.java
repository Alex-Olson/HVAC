import java.util.Date;

public class WaterHeater extends ServiceCall {

    private int age; //in months

    public static double extraFee = 20.00;

    public WaterHeater(String serviceAddress, String problemDescription, Date date, int age) {
        super(serviceAddress, problemDescription, date);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int months) {
        months = age;
    }

    //modified clara's Furnace toString for WaterHeater
    @Override
    public String toString() {

        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee);
        /*i didn't use the ternary operator here since the fee is flat; maybe could have if i assumed something like them not getting charged a fee
        if the issue is resolved without a fix?*/
        String extraFeeString = "$" + Double.toString(extraFee);


        return "Furnace Service Call " + "\n" +
                "Service Address = " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Water Heater Age = " + age +  " months\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Service fee = " + feeString + "\n" +
                "City fee = " + extraFeeString;

    }

}

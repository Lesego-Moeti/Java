package Lab3;

public class Car {
    private String make;
    private String model;
    private long mileage;
    private String color;
    private Boolean insured;

    public Car(){
        this.make = "";
        this.model = "";
        this.mileage = 0;
        this.color = "";
        this.insured = false;
    }
    public Car( String make, String model, long mileage, String color, Boolean insured){
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.color = color;
        this.insured = insured;

    }

    public void setMake(String make){
        this.make = make;
    }
    public String getMake(){
        return make;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setMileage(long mileage){
        this.mileage = mileage;
    }

    public long getMileage(){
        return mileage;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
    public void setInsured(Boolean insured){
        this.insured = false;
    }
    public Boolean getInsured(){
        return insured;
    }

    @Override
    public String toString(){
        return "The make of the car is " + make + " \nThe model of the is " + model + " \nThe mileage of the car is  " + mileage + "\nThe color of the car is " + color ;
    }



}

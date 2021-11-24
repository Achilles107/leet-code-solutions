import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
    public static void main(String[] args) {


        Car v = new Car("Hi", "Ho", "Go", "Hi");
        v.set_type(null);
    }
}
class TypeException extends Exception{
    @Override
    public String toString() {
        return "Vehicle Type Not Set";
    }
}
class Vehicles{
    public String type;
    public String model_no;
    public String model_name;
    public String owner_name;
    public String owner_details;
    public Vehicles(String model_no, String model_name, String owner_name, String owner_details) {
        this.model_no = model_no;
        this.model_name = model_name;
        this.owner_name = owner_name;
        this.owner_details = owner_details;
    }


    public Vehicles(){

    }
    public String get_type() {
        return this.type;
    }
    public String retrieve() throws TypeException {
        return null;
    }
}
class Car extends Vehicles{
    public String type;
    public String model_no;
    public String model_name;
    public String owner_name;
    public String owner_details;

    public Car(String model_no, String model_name, String owner_name, String owner_details){
        super(model_no, model_name, owner_name, owner_details);
        this.model_no = model_no;
        this.model_name = model_name;
        this.owner_name = owner_name;
        this.owner_details = owner_details;
    }
    public Car(){

    }

    @Override
    public String get_type() {
        return this.type;
    }

    public void set_type(String type) {
        this.type = type;
    }

    @Override
    public String retrieve() throws TypeException {
                if (this.type == null) {
                    throw new TypeException();
            }
            return model_no+model_name+owner_name+owner_details;
    }
}

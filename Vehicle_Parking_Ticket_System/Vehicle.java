public abstract class Vehicle{
    String number;
    String colour;
    Vehicle(String number, String colour){
        this.number = number;
        this.colour = colour;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        return sb.append(this.number).append("--").append(this.colour).toString();
    }
}
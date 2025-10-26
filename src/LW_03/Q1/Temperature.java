package LW_03.Q1;

public class Temperature {
    private double celsius;
    private double fahrenheit;

    public Temperature(){
     }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public void toCelsius(){
        celsius = (fahrenheit - 32) * 5 / 9;
    }

    public void toFahrenheit(){
        fahrenheit = celsius * 9 / 5 + 32;
    }

}

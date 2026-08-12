// Last updated: 12/08/2026, 11:23:33
class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;

        return new double[]{kelvin, fahrenheit};
    }
}
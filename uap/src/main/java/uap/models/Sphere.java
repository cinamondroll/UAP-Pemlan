package uap.models;
import uap.bases.Shape;
import uap.interfaces.MassCalculable;
import uap.interfaces.MassConverter;
import uap.interfaces.PiRequired;
import uap.interfaces.ShippingCostCalculator;
import uap.interfaces.ThreeDimensional;


public class Sphere extends Shape implements PiRequired, ThreeDimensional,
MassCalculable, MassConverter, ShippingCostCalculator{
    private double radius;

    public Sphere(){

    }

    public Sphere( double radius){
        this.radius = radius;
    }


    @Override
    public double getVolume() {
        return 4/3 * PI * (radius * radius * radius);
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * radius * radius;
    }

    @Override
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    @Override
    public double gramToKilogram() {
        return Math.ceil(getMass() / DENOMINATOR);
    }

    @Override
    public double calculateCost() {
        return gramToKilogram() * PRICE_PER_KG;
    }

    @Override
    public void printInfo() {
        System.out.println("Volume          : " + getVolume());
        System.out.println("Luas permukaan  : " + getSurfaceArea());
        System.out.println("Massa           : " + getMass());
    }
}

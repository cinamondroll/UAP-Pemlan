package uap.models;

import uap.bases.Shape;
import uap.interfaces.MassCalculable;
import uap.interfaces.MassConverter;
import uap.interfaces.PiRequired;
import uap.interfaces.ShippingCostCalculator;
import uap.interfaces.ThreeDimensional;

public class Torus extends Shape implements PiRequired, ThreeDimensional,
MassCalculable, MassConverter, ShippingCostCalculator {

    private double majorRadius;
    private double minorRadius;

    public Torus () {
        System.out.println("cek");
    }

    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double getVolume() {
        return 2 * (PI * PI) * majorRadius * (minorRadius * minorRadius);
    }

    @Override
    public double getSurfaceArea() {
        return 4 * (PI * PI) * majorRadius * minorRadius;
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

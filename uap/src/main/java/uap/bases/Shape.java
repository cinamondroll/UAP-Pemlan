package uap.bases;
import uap.interfaces.MassCalculable;
import uap.interfaces.MassConverter;
import uap.interfaces.PiRequired;
import uap.interfaces.ShippingCostCalculator;
import uap.interfaces.ThreeDimensional;

public abstract class Shape implements PiRequired, ThreeDimensional,
MassCalculable, MassConverter, ShippingCostCalculator{
private String name;

public Shape(){
}

public String getName(){
    return name;
}

public void setName ( String inputName){
    this.name = inputName;
}

public abstract void printInfo();
}


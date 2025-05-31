package uap.mains;

import java.util.Scanner;

import uap.models.Sphere;
import uap.models.Torus;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NURUL INAYAH");
        System.out.println("245150700111013");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double majorRadius = input.nextDouble();
        System.out.print("Isikan radius   : ");
        double minorRadius = input.nextDouble();
        System.out.println("=============================================");
        Torus torus = new Torus(majorRadius, minorRadius);
        torus.printInfo();
        System.out.println("Massa dalam kg  : " + torus.gramToKilogram());
        System.out.println("Biaya kirim     : Rp." + torus.calculateCost());
        System.out.println("=============================================");
        System.out.print("Isikan radius   :");
        double radius = input.nextDouble();
        System.out.println("=============================================");
        Sphere sphere = new Sphere(radius);
        sphere.printInfo();
        System.out.println("Massa dalam kg  : " + sphere.gramToKilogram());
        System.out.println("Biaya kirim     : Rp." + sphere.calculateCost());
        System.out.println("=============================================");

        input.close();
    }
}
package uap.bases;

public abstract class Shape {
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


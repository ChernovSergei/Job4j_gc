package ru.job4j.clone;

public class DeepObjectClones implements Cloneable {

    int num;
    InnerObject innerObject;

    @Override
    protected DeepObjectClones clone() throws CloneNotSupportedException {
        DeepObjectClones deepObjectClones = (DeepObjectClones) super.clone();
        deepObjectClones.innerObject = innerObject.clone();
        return deepObjectClones;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepObjectClones obj1 = new DeepObjectClones();
        obj1.num = 5;
        InnerObject innerObj1 = new InnerObject();
        innerObj1.num = 15;
        obj1.innerObject = innerObj1;
        DeepObjectClones obj2 = obj1.clone();
        obj2.num = 25;
        obj2.innerObject.num = 35;
        System.out.println("Obj1.num = " + obj1.num);
        System.out.println("Obj1.innerObj1 = " + obj1.innerObject.num);
        System.out.println("Obj2.num = " + obj2.num);
        System.out.println("Obj2.innerObj2 = " + obj2.innerObject.num);
    }
}

package ru.job4j.clone;

public class ObjectClones implements Cloneable {
    int num;

    @Override
    protected ObjectClones clone() throws CloneNotSupportedException {
        return (ObjectClones) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectClones obj1 = new ObjectClones();
        obj1.num = 5;
        ObjectClones obj2 = obj1;
        obj2.num = 10;
        System.out.print("Second object is linked to the first. Therefore num1 = num2 = ");
        System.out.println(obj2.num);

        ObjectClones obj3 = new ObjectClones();
        obj3.num = 5;
        ObjectClones obj4 = obj3.clone();
        obj4.num = 10;
        System.out.print("Fourth object isn't linked to the third. Therefore num3 = ");
        System.out.print(obj3.num);
        System.out.print(". num4 = ");
        System.out.println(obj4.num);
        System.out.println();
    }
}

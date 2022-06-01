package com.current.oopconcept;

class Calculator{
    public int add(int i, int j){
        return i + j;
    }
}



class AdvCalc extends Calculator{ //.................................single level Inheritance concept
    public int sub(int i, int j){
        return i - j;
    }
}

class VeryAdvCalc extends AdvCalc{ //................. multi level Inheritance concept
    public int multi(int i, int j){
        return i * j;
    }
}

public class InheritanceConcept {
    public static void main(String[] args) {

        VeryAdvCalc veryAdvCalc =new VeryAdvCalc();
        int result1 = veryAdvCalc.add(3,4);
        int result2 = veryAdvCalc.sub(4,3);
        int result3 = veryAdvCalc.multi(4,3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}

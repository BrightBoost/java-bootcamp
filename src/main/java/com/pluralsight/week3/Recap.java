package com.pluralsight.week3;

class Recap {
    public static void main(String[] args) {
        // primitives: yes or no
        int x = 5; // yes
        double y = 5.7; // yes
        Integer xx = 5; //No
        String bla = "Blabla"; // no no

        // naming of methods / variables / classes
        // variables and methods: doesn't start with numbers, camelcase (convention), can start with $ or _, no other special chars allowed
        // CONSTANTS: full uppercase
        // classes: start with uppercase letter
        int _test = 5;
        int _$test = 5;
        // int 1_$test = 5;

        // operators
        int z = 8; // equal sign is assignment operator
        boolean test = z < 10; // < comparison operator
        int a = z + x * 3; // < comparison operator

        // combined operator: math + assignment
        z -= 3; // z = z - 3
        System.out.println(z);

        // pre and post incrementor
        System.out.println(z++); // post increment, first print then increment
        System.out.println(++z); // pre increment, first increment then print

        // comparison operators == != <= < > >=
        int blabla = 3;
        int blablabla = 6;
        if(blablabla >= blabla) {
            System.out.println("Blabalblabla");
        }

        String s1 = "bla";
        String s2 = "BLA";

        if(s1.equals(s2)) {
            System.out.println("They're equal");
        }

        if(s1.equalsIgnoreCase(s2)) {
            System.out.println("They're equal, ignoring the case");
        }

        MooDeng mooDeng1 = new MooDeng();
        mooDeng1.setAge(1);
        MooDeng mooDeng2 = new MooDeng();
        mooDeng2.setAge(2);
        MooDeng mooDeng3 = new MooDeng();
        mooDeng1.setAge(3);

        mooDeng1.changeColor("blue");
        mooDeng2.changeColor("purple");

        MooDeng[] arrMooDeng = new MooDeng[3];
        arrMooDeng[0] = mooDeng1;
        arrMooDeng[1] = mooDeng2;
        arrMooDeng[2] = mooDeng3;

        MooDeng[] arrMooDeng2 = {mooDeng1, mooDeng2, mooDeng3};


    }
}

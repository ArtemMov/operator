public class Main {
    public static void main(String[] args) {
        int age = 15;
        if (age >= 18) {
            System.out.println("Ты совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Не достиг совершеннолетия");
        }
        System.out.println();

        int temperature = -19;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        System.out.println();
        int speed = 52;
        if (speed > 60) {
            System.out.println("Если " + speed + " придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если " + speed + " можно ездить спокойно");
        }
        System.out.println();

        int ageHuman = 19;
        if (ageHuman > 2 && ageHuman < 6) {
            System.out.println("Если возраст человека равен " + ageHuman + " ,то ему нужно ходить в детский сад.");
        }
        if (ageHuman > 7 && ageHuman < 17) {
            System.out.println("Если возраст человека равен " + ageHuman + " ,то ему нужно ходить в школу.");
        }
        if (ageHuman > 18 && ageHuman < 24) {
            System.out.println("Если возраст человека равен " + ageHuman + " ,то ему нужно ходить в университет.");
        } else if (ageHuman > 25) {
            System.out.println("Если возраст человека равен " + ageHuman + " ,то ему нужно ходить на работу.");
        }
        System.out.println();
        int child = 12;
        if(child<5) {
            System.out.println("Если возраст ребенка равен "+child+" , то ему нельзя кататься на аттракционе.");
        }
        else if (child>5 && child<14) {
            System.out.println("Если возраст ребенка равен "+child+" , то ему можно кататься на аттракционе в сопровождении.");
        }
        else if(child>14) {
            System.out.println("Если возраст ребенка равен "+child+" , то ему можно кататься на аттракционе без сопровождения.");
        }
        System.out.println();
        int a=107;
        int b=65;
        int c=55;
        if(a<=102) {
            System.out.println("Место в вагоне есть.");}
        else if(b<60 || c<42) {
            System.out.println("Место в вагоне "+(60-b)+" сидячих, "+(42-c)+" стоячих");}
        else {
                System.out.println("Вагон полностью забит");
            }
        System.out.println();
        int one =15;
        int two = 32;
        int three = 54;
        if(one>two&&one>three){
            System.out.println("Наибольшее из трех чисел " +one);}
        else if(two>one&&two>three) {
            System.out.println("Наибольшее из трех чисел " +two);}
        else {
            System.out.println("Наибольшее из трех чисел " +three);
        }
        }
    }





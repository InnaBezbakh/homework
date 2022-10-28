package Task1;

public class Animal {
     String name;
    public Animal(String name){
        this.name=name;

    }

    static Animal cat = new Animal("cat");
    static Animal dog = new Animal("dog");
    static Animal cow = new Animal("cow");

    public static String whatDoesItAnimalSay(String voice){
        if (voice.equals("gav"))
            return dog.name;
        else if (voice.equals("meow"))
            return cat.name;
        else {
            return cow.name;
        }
    }



    public static void twoNumbers(int a, int b){
        System.out.println(a + b);
    }

    public static int sumTwoNumbers(int a, int b){
        twoNumbers(a, b);
        return  a + b;

    }




    public static void main(String[] args) {

        System.out.println(printNameOfAnimalByItsVoice("coco"));
        System.out.println(innochka("gav"));
        System.out.println(whatDoesItAnimalSay("meow"));
        sumTwoNumbers(10,15);
    }

    public static String printNameOfAnimalByItsVoice(String voice){
        if (voice.equals("gav")){
           return "dog";
        }
        if (voice.equals("meow")){
            return "cat";
        }
        else{
            return "not dog and not cat";
        }
    }

    public static String innochka(String voice){
        String animalname="";
        if(voice.equals("gav"))
            animalname = "dog";

        else {
            animalname = "any animal";
        }

     //   animalname = voice.equals("gav") ? "dog" : "cat";

        return animalname;
    }


    }





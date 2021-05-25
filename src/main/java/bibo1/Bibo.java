package bibo1;

public class Bibo {

    public static void main(String[] args) {

        Integer[] a = new Integer[3];

        Character[] b = new Character[3];

        String s = "Hello";

        char[] cs = s.toCharArray();

        if(!Character.isDigit(cs[1])){
            System.out.println("Sí");
        }

        for(Character c : s.toCharArray()){
            if(Character.isDigit(c));
        }
    }
}



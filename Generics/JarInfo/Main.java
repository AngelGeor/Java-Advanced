package Generics_Lab.JarInfo;

public class Main {
    public static void main(String[] args) {
        Jar<Integer> jar = new Jar<>();
        jar.add(3);
        jar.add(4);
        jar.add(5);
        System.out.println(jar.remove());
    }
    }


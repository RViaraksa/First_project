package capture1.section3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Abiturient a1 = new Abiturient();
        Abiturient a2 = new Abiturient();
        Abiturient a3 = new Abiturient();
        Abiturient a4 = new Abiturient("Burki", "Roman", 9);
        Abiturient a5 = new Abiturient("Paul", "Povas", "Thomas", "Munich, Zeber-Strace 21", "1213-12", 7);
        Abiturient a6 = new Abiturient("Vor", "Poqas", "Paul", 8);
        ArrayList<Abiturient> listAbituriient = new ArrayList<>();
        listAbituriient.add(a1);
        listAbituriient.add(a2);
        listAbituriient.add(a3);
        listAbituriient.add(a4);
        listAbituriient.add(a5);
        listAbituriient.add(a6);
        FindAbiturient finder = new FindAbiturient();
        //System.out.println(finder.findAbiturientAtRate(7, listAbituriient));
        System.out.println(finder.topAbiturient(4,listAbituriient));
    }
}

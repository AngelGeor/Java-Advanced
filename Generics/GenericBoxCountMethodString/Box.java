package Generics_Ex.GenericBoxCountMethodString;
import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    //характеристика: списък с елементи
    private List<T> elements;

    //конструктор
    public Box() {
        this.elements = new ArrayList<>();
    }

    //add
    public void add (T element) {
        this.elements.add(element);
    }

    //всеки един елемент -> тип : елемент
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T element : elements) {
            builder.append(String.format("%s: %s",element.getClass().getName(), element)).append("\n");
        }
        return builder.toString();
    }

    //swap -> firstIndex, secondIndex
    public void swap (int firstIndex, int secondIndex) {
        //1. взема елементите на дадените индекси
        T firstIndexElement = this.elements.get(firstIndex);
        T secondIndexElement = this.elements.get(secondIndex);

        //първия индекс -> втория елемент
        //втория индекс -> първия елемент
        this.elements.set(firstIndex, secondIndexElement);
        this.elements.set(secondIndex, firstIndexElement);
    }

    //count elements bigger than дадения
    public int countGreaterThan (T element) {
        int count = 0; //брой на елементите, които са по-големи от дадения
        for (T elementInList : this.elements) {
            //0 -> elementInList ==  element
            //1 -> elementInList > element
            //-1 -> elementInList < element
            if (elementInList.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }
}
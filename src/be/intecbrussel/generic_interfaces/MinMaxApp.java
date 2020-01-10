package be.intecbrussel.generic_interfaces;

public class MinMaxApp {
    public static void main(String[] args) {

        Integer[] numbers = {1, 3, 6};
        Character[] characters = {'a', 'b', 'd'};

        MinMaxImplement<Integer> integerMinMax = new MinMaxImplement<>(numbers);
        System.out.println(integerMinMax.min());
        System.out.println(integerMinMax.max());

        MinMaxImplement<Character> characterMinMax = new MinMaxImplement<>(characters);
        System.out.println(characterMinMax.min());
        System.out.println(characterMinMax.max());

    }
}



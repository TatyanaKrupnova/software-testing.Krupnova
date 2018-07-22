package Project.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

    public static void main(String[] args) {

        List<String> languages = Arrays.asList("Java", "Python", "C#", "PHP");

        for (Object l : languages) {
            System.out.println("I like " + l);
        }
    }
}

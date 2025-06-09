package Practics;
public class StringsPractic {
    public static void main(String[] args) {
        String name = "Yan Miskin";
        short age = 24;
        String city = "Gomel";

        System.out.println("Hello my name is " + name + "." + " I'm " + age + " years old." + " I from " + city + ".");

        String texts = "Java - it's a cool!";
        System.out.println(texts.length());
        System.out.println(texts.toLowerCase());
        System.out.println(texts.replace("cool", "respect"));

        System.out.println(texts.charAt(0));
        System.out.println(texts.substring(8, 14));


        String fullName = "Kristina Volkova";
        int ageBirthday = 2001;
        String hobby = "singing and painting";

        System.out.println(fullName + " was born in " + ageBirthday + " and loves " + hobby + ".");
        System.out.println(fullName.length());
        System.out.println(fullName.substring(9, 16));
        System.out.println(fullName + " was born in " + ageBirthday + " and loves " + hobby.replace("painting", "dancing") + ".");

        int spaceIndex = fullName.indexOf(' ');
        String lastName = fullName.substring(spaceIndex + 1);
        System.out.println("Last name: " + lastName);

        int spaceImdesYan = name.indexOf(' ');
        String str = name.substring(spaceImdesYan + 1);
        System.out.println(str);

    }
}

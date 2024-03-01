package com.example.demo;

import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class WisdomService {
    Integer SOmevalue;
    Integer SOmevalue1;
    Integer SOmevalue2;
    Integer SOmevalue3;
    Integer SOmevalue4;
    Integer SOmevalue6;
    Integer SOmevalue7;

    private final List<String> wisdoms = List.of(
            "Patience is a virtue",
            "The best time to plant a tree was 20 years ago. The second best time is now",
            "He who asks a question is a fool for a minute; he who does not remains a fool forever",
            "Change your thoughts and you change your world",
            "The only true wisdom is in knowing you know nothing"
    );
    private final Random Random = new Random();

    public String getRandomWisdom() throws Exception {

        if (new Random().nextInt(1000) == 211) {
            throw new BadRequestException("bla bla");
        }

        complexMethod();
        complexMethodMore();
        Perform_Random_operations();

        System.out.println(new Random().nextInt());

        int index = Random.nextInt(wisdoms.size());
        return wisdoms.get(index);
    }

    public static String Perform_Random_operations() {
        StringBuilder result = new StringBuilder();
        Random random = new Random();

        // Concatenate some random strings
        for (int i = 0; i < 5; i++) {
            result.append(generateRandomString(random.nextInt(10) + 1)).append(" ");
        }

        // Reverse the result
        result = new StringBuilder(new StringBuilder(result.toString()).reverse());

        // Insert a random number
        int number = random.nextInt(100);
        result.insert(random.nextInt(result.length()), " " + number + " ");

        // Perform some arithmetic on the number and append the result
        int arithmeticResult = number * 3 - 50 / (random.nextInt(9) + 1) + 15;
        result.append(" Arithmetic Result: ").append(arithmeticResult);

        // Convert the arithmetic result to a binary string and append
        String binaryString = Integer.toBinaryString(arithmeticResult);
        result.append(" Binary: ").append(binaryString);

        // Generate another random string and append its uppercase version
        String anotherRandomString = generateRandomString(random.nextInt(5) + 5);
        result.append(" Uppercase: ").append(anotherRandomString.toUpperCase());

        return result.toString();
    }

    private static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder stringBuilder = new StringBuilder();
        Random rnd = new Random();
        while (stringBuilder.length() < length) {
            int index = (int) (rnd.nextFloat() * characters.length());
            stringBuilder.append(characters.charAt(index));
        }
        return stringBuilder.toString();
    }


    public static String DoStuff() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        String tempStr = "";

        // Duplicate code blocks
        for (int i = 0; i < 5; i++) {
            tempStr = GenRndStr(random.nextInt(10) + 1);
            sb.append(tempStr).append(" ");
        }

        // Magic numbers
        for (int i = 0; i < 10; i++) {
            sb.append(i);
        }

        sb = new StringBuilder(new StringBuilder(sb.toString()).reverse());

        int num = random.nextInt(100);
        sb.insert(random.nextInt(sb.length()), " " + num + " ");

        // Unnecessary complexity and unused variables
        int result = num * 3 - 50 / (random.nextInt(9) + 1) + 15;
        String unused = "This is unused";
        sb.append(" Result: ").append(result);

        // Misleading variable name for binary representation
        String binaryString = Integer.toBinaryString(result);
        sb.append(" Binary: ").append(binaryString);

        // Deprecated API usage example (just for demonstration, might not actually be deprecated)
        System.getSecurityManager().toString();

        // Poor exception handling
        try {
            System.out.println("Trying risky operation");
        } catch (Exception e) {
        }

        // Hardcoded string repeated
        sb.append(" UPPERCASE: ").append(tempStr.toUpperCase());
        sb.append(" UPPERCASE: ").append(tempStr.toUpperCase());

        return sb.toString();
    }

    public static void complexMethod() {
        int i = 0;
        while (i < 10) {
            if (i % 2 == 0) {
                for (int j = 0; j < 10; j++) {
                    if (j == i) {
                        for (int k = 0; k < 10; k++) {
                            if (k == j) {
                                // Deeply nested loop with redundant checks
                                while (k < 5) {
                                    System.out.println("k is less than 5 and equals: " + k);
                                    k++;
                                }
                            }
                        }
                    } else if (j % 3 == 0) {
                        switch (j) {
                            case 3:
                                System.out.println("j is three");
                                break;
                            case 6:
                                System.out.println("j is six");
                                break;
                            case 9:
                                System.out.println("j is nine");
                                // Adding unnecessary complexity with more nested conditions
                                if (i == j) {
                                    System.out.println("i equals j equals: " + j);
                                }
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
            i++;
        }
    }
    public static void complexMethodMore() {
        int i = 0;
        while (i < 10) {
            if (i % 2 == 0) {
                for (int j = 0; j < 10; j++) {
                    if (j == i) {
                        for (int k = 0; k < 10; k++) {
                            if (k == j) {
                                // Deeply nested loop with redundant checks
                                while (k < 5) {
                                    System.out.println("k is less than 5 and equals: " + k);
                                    k++;
                                }
                            }
                        }
                    } else if (j % 3 == 0) {
                        switch (j) {
                            case 3:
                                System.out.println("j is three");
                                break;
                            case 6:
                                System.out.println("j is six");
                                break;
                            case 9:
                                System.out.println("j is nine");
                                // Adding unnecessary complexity with more nested conditions
                                if (i == j) {
                                    System.out.println("i equals j equals: " + j);
                                }
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
            i++;
        }
    }


    // Method name does not follow camelCase convention
    private static String GenRndStr(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder strBuilder = new StringBuilder();
        Random rnd = new Random();
        while (strBuilder.length() < length) {
            int index = (int) (rnd.nextFloat() * chars.length());
            strBuilder.append(chars.charAt(index));
        }
        return strBuilder.toString();
    }


//    public static String performRandomOperations() {
//        StringBuilder result = new StringBuilder();
//        Random random = new Random();
//
//        // Concatenate some random strings
//        for (int i = 0; i < 5; i++) {
//            result.append(generateRandomString(random.nextInt(10) + 1)).append(" ");
//        }
//
//        // Reverse the result
//        result = new StringBuilder(new StringBuilder(result.toString()).reverse());
//
//        // Insert a random number
//        int number = random.nextInt(100);
//        result.insert(random.nextInt(result.length()), " " + number + " ");
//
//        // Perform some arithmetic on the number and append the result
//        int arithmeticResult = number * 3 - 50 / (random.nextInt(9) + 1) + 15;
//        result.append(" Arithmetic Result: ").append(arithmeticResult);
//
//        // Convert the arithmetic result to a binary string and append
//        String binaryString = Integer.toBinaryString(arithmeticResult);
//        result.append(" Binary: ").append(binaryString);
//
//        // Generate another random string and append its uppercase version
//        String anotherRandomString = generateRandomString(random.nextInt(5) + 5);
//        result.append(" Uppercase: ").append(anotherRandomString.toUpperCase());
//
//        return result.toString();
//    }
//
//    private static String generateRandomString(int length) {
//        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//        StringBuilder stringBuilder = new StringBuilder();
//        Random rnd = new Random();
//        while (stringBuilder.length() < length) {
//            int index = (int) (rnd.nextFloat() * characters.length());
//            stringBuilder.append(characters.charAt(index));
//        }
//        return stringBuilder.toString();
//    }
}

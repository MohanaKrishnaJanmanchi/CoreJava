package June12;

public class StringToIntegerConverter {
    public static void main(String[] args) {
        String s1 = "23";
        String s2 = "45.67";
        String s3 = "test";
        String s4 = "123f";
        try {
            System.out.println("Input Number: " + s1 + " Converted number: " + convertStringToInteger(s1));
        } catch (CustomExceptionClass e) {
            System.out.println(e);
        }
        try {
            System.out.println("Input Number: " + s2 + " Converted number: " + convertStringToInteger(s2));
        } catch (CustomExceptionClass e) {
            System.out.println(e);
        }
        try {
            System.out.println("Input Number: " + s3 + " Converted number: " + convertStringToInteger(s3));
        } catch (CustomExceptionClass e) {
            System.out.println(e);
        }
        try {
            System.out.println("Input Number: " + s4 + " Converted number: " + convertStringToInteger(s4));
        } catch (CustomExceptionClass e) {
            System.out.println(e);
        }
    }

    public static int convertStringToInteger(String inputString) throws CustomExceptionClass {
        try {
            int convertedNumber = Integer.parseInt(inputString);
            return convertedNumber;
        } catch (NumberFormatException e) {
            throw new CustomExceptionClass("'" + inputString + "' is invalid input. Please provide a valid integer.");
        }
    }
}


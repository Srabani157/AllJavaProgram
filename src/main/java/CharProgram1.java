public class CharProgram1 {
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd', 'z', 'W', 'X', 'Z'};
        int i, num = 4 ;  // Assuming you want to add 4 to get the next letter
        int len = arr.length;
        int result[];
        result = addNumber(arr, num, len);

        //To print the array
        for (i = 0; i < len; i++) {
            System.out.println((char) result[i]);
        }
    }

    static int[] addNumber(char[] ascii, int num, int len) {
        int i;
        int result[] = new int[len];
        for (i = 0; i < len; i++) {
            result[i] = (int) (ascii[i]);
        }

        for (i = 0; i < len; i++) {
            int currentLetter = result[i];
            if (currentLetter >= 'a' && currentLetter <= 'z'){

                result[i] = ((currentLetter - 'a') + (num % 26)) % 26 + 'a';

            }
            else if (currentLetter >= 'A' && currentLetter <= 'Z')
                result[i] = (((currentLetter - 'A') + (num % 26)) % 26) + 'A';

        }


        return result;
    }


}

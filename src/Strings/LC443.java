package Strings;

public class LC443 {
    public int compress(char[] chars) {
        int n = chars.length;
        int index = 0; // Index to update the chars array
        int i = 0; // Pointer to iterate over chars array

        while (i < n) {
            char currentChar = chars[i];
            int count = 0;

            // Count the number of occurrences of the current character
            while (i < n && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Update the chars array with the current character
            chars[index++] = currentChar;

            // If the character occurs more than once, append the count
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {
        LC443 solution = new LC443();

        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int length1 = solution.compress(chars1);
        System.out.println("Compressed Length: " + length1);
        System.out.println("Compressed Array: " + new String(chars1, 0, length1));

        char[] chars2 = {'a'};
        int length2 = solution.compress(chars2);
        System.out.println("Compressed Length: " + length2);
        System.out.println("Compressed Array: " + new String(chars2, 0, length2));

        char[] chars3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int length3 = solution.compress(chars3);
        System.out.println("Compressed Length: " + length3);
        System.out.println("Compressed Array: " + new String(chars3, 0, length3));
    }
}

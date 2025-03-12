package add.binary;

// https://leetcode.com/problems/add-binary/
public class AddBinary {
    public String addBinary(String first, String second) {
        StringBuilder result = new StringBuilder();
        int firstIndex = first.length() - 1;
        int secondIndex = second.length() - 1;
        int carry = 0;
        while (firstIndex > -1 || secondIndex > -1) {
            int firstBit = getBitAt(first, firstIndex);
            int secondBit = getBitAt(second, secondIndex);

            carry = add(firstBit, secondBit, carry, result);
            firstIndex--;
            secondIndex--;
        }
        if (carry > 0) result.append(1);

        return result.reverse().toString();
    }

    // returns carry
    private int add(int firstBit, int secondBit, int carry, StringBuilder result) {
        int sumResult = firstBit + secondBit + carry; // values are: 0 (0+0), 1 (0+1), 2 (1+1+0), 3(1+1+1)

        boolean hasCarry = sumResult >= 2; // 2, 3

        int toAppend = hasCarry ? sumResult - 2 : sumResult;
        result.append(toAppend);

        return hasCarry ? 1 : 0;
    }

    // '1' means true
    // '0' means false
    private int getBitAt(String str, int index) {
        if (index < 0) return 0;

        return str.charAt(index) - '0';
    }
}

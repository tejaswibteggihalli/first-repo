class Eridianconvert{

    // Method to convert decimal to base 6
    public static String decimalToBase6(int decimal) {
        if (decimal == 0) return "0";

        StringBuilder base6 = new StringBuilder();
        int num = decimal;
        char eridianunit ;

        while (num > 0) {
            int remainder = num % 6;

            //convert to eridian symbols
            if (remainder == 0) {
            eridianunit = 'ℓ';
            }
            else if (remainder == 1) {
                eridianunit = 'Ɪ';
            }
            else if (remainder == 2) {
                eridianunit = 'V';
            }
            else if (remainder == 3) {
                eridianunit = 'λ';
            }
            else if (remainder == 4) {
                eridianunit = '+';
            }
            else{
                eridianunit = '∀';
            }
            base6.append(eridianunit);
            num /= 6;
        }

        // Reverse the string since digits are appended in reverse order
        return base6.reverse().toString();
    }

    // Example usage
    public static void main(String[] args) {
        int decimalNumber = 36;
        String base6Number = decimalToBase6(decimalNumber);
        System.out.println("Decimal " + decimalNumber + " in base 6 is: " + base6Number);
    }
}
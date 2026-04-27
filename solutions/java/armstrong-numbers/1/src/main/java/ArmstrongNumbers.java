class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        char[] numberArray = String.valueOf(numberToCheck).toCharArray();
        int count = 0;
        for(char number : numberArray){
            count += Math.pow(number - '0', numberArray.length);
        }
        return numberToCheck == count;

    }

}

class ReverseString {

    String reverse(String inputString) {
        char[] charArray = inputString.toCharArray();
        String reversed = "";
        for(int i = charArray.length - 1; i >= 0; i-- ){
            reversed += charArray[i];
        }

        return reversed;
    }
}

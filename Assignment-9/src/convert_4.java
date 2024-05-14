public class convert_4 {
    public static void main(String args[]){
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str = new String(charArray);
        System.out.println("String: " + str);

        // Converting string to character array
        String str2 = "World";
        char charArray2[] = str2.toCharArray();
        System.out.println("\nCharacters: ");
        for(int i=0;i<charArray2.length;i++){
            System.out.print(charArray2[i] + " ");
        }
    }
}

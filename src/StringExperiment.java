public class StringExperiment {
    public static void main(String[] args) {
        String message = "Java!";
        for (int i=0; i<message.length(); i++)
        {
            System.out.printf("character at: %d is: %c%n",i,message.charAt(i));
        }
    }
}

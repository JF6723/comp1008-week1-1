public class Main {
    public static void main(String[] args) {
        for (int i=1; i<=10; i=i+2)
        {
            System.out.printf("%3d",i);
            if (i%4 == 0)
                System.out.println();
        }
    }
}
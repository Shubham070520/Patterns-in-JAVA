public class patterns {
    // Star pattern
    // *
    // **
    // ***
    // ****
    public static void star_pattern(int line) {
        for (int i = 1; i <= line; i ++) {
            //one line 
            for (int j = 1; j <= i ;j ++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
    // public static void main(String[] args) {
    //     star_pattern(4);
    // }

    //inverted star pattern
    // ****
    // ***
    // **
    // *
    public static void inverted_star_pattern(int n) {
        for (int i = 1; i <= n; i ++) {
            //one line 
            for (int j = 1; j <= n-i+1; j ++) {
                System.out.print("*");
            }
        System.out.println();
        }
    // }
    // public static void main(String[] args) {
    //     inverted_star_pattern(4);
    // }
    }

    //Half-Pyramid Pattern
    // 1 
    // 1 2 
    // 1 2 3 
    // 1 2 3 4 
    // 1 2 3 4 5
    public static void half_pyramid(int n) {
        for (int i = 1; i <= n; i ++) {
            //print numbers 
            for (int j = 1; j <= i; j ++) {
                System.out.print(j + " ");
            }
        System.out.println();
        }
    }
    // public static void main(String[] args) {
    //     half_pyramid(5);
    // }

    //Print Character pattern
    // A
    // BC
    // DEF
    // GHIJ
    // KLMNO
    public static void char_pattern(int n) {
        char ch = 'A';
        //for outer loop
        for (int i = 1; i <= n; i ++) {
            //for inner loop
            for (int chars = 1; chars <= i; chars ++) {
                System.out.print(ch);
                ch++;
            }
        System.out.println();
        }
    }
    //  public static void main(String[] args) {
    //     char_pattern(5);
    // }
}       
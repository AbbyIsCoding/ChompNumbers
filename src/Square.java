public class Square {
    public int a;
    public int b;
    public int c;
    public int x;

    public static void main(String[] args) {
        Square s = new Square();
    }

    public Square() {

        for (a = 1; a < 4; a++) {
            for (b = 0; b <= a; b++) {
                for (c = 0; c <= b; c++) {
                    System.out.println("board: " + a + " " + b + " " + c);
                    printResultBoards(a, b, c);
                }
            }
        }
    }

    public void printResultBoards(int A, int B, int C) {
        for (int c2 = C - 1; c2 >= 0; c2--) { // third col

            System.out.println(A + " " + B + " " + c2 + " move to make: " + c2 + "," + (C - 1));
            System.out.println(C);

        }


        for (int b2 = B - 1; b2 >= 0; b2--) { // second col

            if (b2 < C) {
                System.out.println(A + " " + b2 + " " + b2 + " move to make: " + b2 + "," + (B - 1));
            } else {
                System.out.println(A + " " + b2 + " " + C + " move to make: " + b2 + "," + (B - 1));
            }
            System.out.println(B);

        }

        for (int a2 = A - 1; a2 >= 1; a2--) { // first col


            if (a2 < B && a2 < C) {
                System.out.println(a2 + " " + a2 + " " + a2 + " move to make: " + a2 + "," + (A - 1));

            }
            else if (a2 < B) {
                System.out.println(a2 + " " + a2 + " " + C + " move to make: " + a2 + "," + (A - 1));
            }else {

                System.out.println(a2 + " " + B + " " + C + " move to make: " + a2 + "," + (A - 1));
            }
            System.out.println(A);


        }
    }


// how to get coordinates?? if you start from 322 and go to 111, you are clicking on


}

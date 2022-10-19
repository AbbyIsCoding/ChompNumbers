public class Square {
    public int a;
    public int b;
    public int c;
    public int x;

    public static void main(String[] args) {
        Square s = new Square();
    }

    public Square(){

        for (a = 1; a < 4; a++){

            for (b = 0;b <= a; b++){

                for (c = 0; c <= b; c++){
                       System.out.println("board: "+ a + " " + b + " " + c);
                    printResultBoards(a,b,c);



                }
            }
        }


    }

    public void printResultBoards(int A, int B, int C){


            for (int c2 = C; c2 > 0;c2--) {
                C--;
                System.out.println(A + " " + B + " " + C);
            }

            C = 3;

            for (int b2 = B; b2 > 0; b2--) {

                B--;

                if (B<C){
                    C = B;
                }
                    System.out.println(A + " " + B + " " + C);
            }

            for (int a2 = A; a2 > 0; a2--) {
                A--;
                System.out.println(A + " " + B + " " + C);


            }

    }













    }








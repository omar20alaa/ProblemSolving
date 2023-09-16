package app.problem_solving.code_forces;

class MultiplicationTable {

    public static void main(String[] args) {

        System.out.println("Welcome To Multiplication Table");
        for (int i = 1; i <= 10; i++) {
            if (i == 1) {
                System.out.print("   ");
            }
            System.out.print(i + "  ");

        }
        System.out.println(" ");


        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i < 10) {
                System.out.print(" ");
            }


            for (int j = 1; j <= 10; j++) {
                int multip = i * j;
                System.out.print(multip + " ");

                if (multip < 10)
                    System.out.print(" ");

            }
            System.out.println("");
        }


    }
}

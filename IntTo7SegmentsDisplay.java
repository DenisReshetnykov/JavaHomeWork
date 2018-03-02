import java.util.Scanner;

public class IntTo7SegmentsDisplay {

    public static void main(String[] args) {
        System.out.println("Please enter integer value: ");

        Scanner in = new Scanner(System.in);
        int Integer = in.nextInt();
        int DigitNumber = 0;

        int IntegerCounter = Integer;
        int[] Digits = new int[10];
        while (IntegerCounter != 0){
            Digits[DigitNumber] = IntegerCounter - IntegerCounter/10*10;
            DigitNumber++;
            IntegerCounter /= 10;
        }

        for (int i=DigitNumber-1; i>=0; i-- ){

            if ((Digits[i] == 1) ^ (Digits[i] == 4)){
                System.out.print( "... ");
            } else {
                System.out.print("._. ");
            }

        }
        System.out.println();
        for (int i=DigitNumber-1; i>=0; i-- ){

            if ((Digits[i] == 4) ^ (Digits[i] > 7)){
                System.out.print("|_| ");
            } else {
                if ((Digits[i] == 5) ^ (Digits[i] == 6)) {
                    System.out.print("|_. ");
                } else {
                    if ((Digits[i] == 2) ^ (Digits[i] == 3)) {
                        System.out.print("._| ");
                    } else {
                        if ((Digits[i] == 1) ^ (Digits[i] == 7)) {
                            System.out.print("..| ");
                        } else {
                            System.out.print("|.| ");
                        }
                    }
                }
            }

        }
        System.out.println();
        for (int i=DigitNumber-1; i>=0; i-- ){

            if ((Digits[i] == 1) ^ (Digits[i] == 4) ^ (Digits[i] == 7) ^ (Digits[i] == 9)){
                System.out.print("..| ");
            } else {
                if ((Digits[i] == 0) ^ (Digits[i] == 6) ^ (Digits[i] == 8)) {
                    System.out.print( "|_| " );
                } else {
                    if ((Digits[i] == 3) ^ (Digits[i] == 5)) {
                        System.out.print( "._| " );
                    } else {
                        System.out.print( "|_. " );
                    }
                }
            }

        }
    }

}

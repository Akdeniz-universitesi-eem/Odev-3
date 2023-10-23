import java.util.Scanner;
public class soru5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();
        boolean isPrimeXResult = isPrimeX(number);
        System.out.println("isPrimeX(" + number + ") = " + isPrimeXResult);
        scanner.close();
    }

    public static boolean isPrimeX(int num) {
        if (num <= 1) {
            return false;
        }

        if (isPrime(num)) {
            while (num > 9) {
                int sumOfDigits = 0;
                while (num > 0) {
                    sumOfDigits += num % 10;
                    num /= 10;
                }

                if (!isPrime(sumOfDigits)) {
                    return false;
                }

                num = sumOfDigits;
            }
            return true;
        }
        return false;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        if (num <= 3) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;

	}

}

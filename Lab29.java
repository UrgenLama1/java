class Complex {
    int real, img;

    // Constructor to initialize real and img parts of a complex number
    Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    // Method to get the sum of real and img parts of two Complex objects
    void getSum(Complex c1, Complex c2) {
        int sumReal = c1.real + c2.real;
        int sumImg = c1.img + c2.img;
        System.out.println("Sum of the complex numbers: " + sumReal + " + " + sumImg + "i");
    }
}

// Class containing the main method
class Lab29 {
    public static void main(String[] args) {
        // Create two objects of Complex
        Complex c1 = new Complex(3, 2); // For example, 3 + 2i
        Complex c2 = new Complex(9, 5); // For example, 9 + 5i

        // Create an object to call getSum method
        Complex result = new Complex(0, 0);
        result.getSum(c1, c2);
    }
}

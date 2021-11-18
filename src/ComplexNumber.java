public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add (double real, double imaginary) { // adding one complex number to this
        this.real+=real;
        this.imaginary+=imaginary;
    }

    public void add (ComplexNumber complexNumber) {// adding one complex number to this
        this.real+=complexNumber.getReal();
        this.imaginary+=complexNumber.getImaginary();
    }

    public void subtract (double real, double imaginary) { //subtracting one complex number from this
        this.real-=real;
        this.imaginary-=imaginary;
    }

    public void subtract (ComplexNumber complexNumber){ //subtracting one complex number from this
        this.real-= complexNumber.getReal();
        this.imaginary-=complexNumber.getImaginary();
    }
}


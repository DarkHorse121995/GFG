package practice.basics;

public class AddComplexNumbers {

    public static void main(String[] args) {
        ComplexNumberDTO no1 = new ComplexNumberDTO(2,3);
        ComplexNumberDTO no2 = new ComplexNumberDTO(4,5);

        ComplexNumberDTO sum = new ComplexNumberDTO();
        sum.setReal(no1.getReal() + no2.getReal());
        sum.setImaginary(no1.getImaginary() + no2.getImaginary());
        System.out.println("Sum of " + no1.toString() + " + " + no2.toString() + " = " + sum.toString());

    }


}


package practice.basics;

public class ComplexNumberDTO {
    Integer real;
    Integer imaginary;

    public ComplexNumberDTO() {
    }

    public ComplexNumberDTO(Integer real, Integer imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }

    public Integer getReal() {
        return real;
    }

    public void setReal(Integer real) {
        this.real = real;
    }

    public Integer getImaginary() {
        return imaginary;
    }

    public void setImaginary(Integer imaginary) {
        this.imaginary = imaginary;
    }
}

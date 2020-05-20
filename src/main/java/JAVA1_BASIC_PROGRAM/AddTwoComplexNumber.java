package JAVA1_BASIC_PROGRAM;

public class AddTwoComplexNumber {
double real, imaginary;

AddTwoComplexNumber(double r, double i){
    this.real = r;
    this.imaginary = i;
}

public static  AddTwoComplexNumber sum(AddTwoComplexNumber c1, AddTwoComplexNumber c2){

    AddTwoComplexNumber temp = new AddTwoComplexNumber(0,0);

    temp.real = c1.real + c2.real;
    temp.imaginary = c1.imaginary + c2.imaginary;
    return temp;
}

    public static void main(String[] args) {
        AddTwoComplexNumber c1 = new AddTwoComplexNumber(1.1, 2.1);
        AddTwoComplexNumber c2 = new AddTwoComplexNumber(1.1, 2.1);

        AddTwoComplexNumber temp = sum(c1,c2);

        System.out.println("The sum of two number is: " + temp.real + " + " + temp.imaginary+"i");
    }

}

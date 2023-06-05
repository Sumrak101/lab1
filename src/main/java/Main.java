import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            getname();
            difference(195, 210);

        System.out.println("Сумма чисел = " + sum());
        maincircle();

        System.out.println();
           }
//задача 1
    public static String getname(){
        String b = "Спирин Кирилл Павлович";
        System.out.println("Спирин Кирилл Павлович");
        return b;
    }

//задача 2
    public static void difference(int value1, int value2){
       int diff = value2-value1;
        System.out.println(diff);
    }
//Задача 3
    public static int sum(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        System.out.println("Введите третье число:");
        int c = scanner.nextInt();

        int result = a+b+c;

        return a+b+c;

    }

//Задача 4
    public  static void maincircle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус окружности(в сантиметрах):");
        int a = scanner.nextInt();
        double pi = 3.14;
        Length(a,pi);
        Ploza(a,pi);
    }
    public static double Length(int a,double pi){


        double S = pi * Math.pow(a, 2);
        System.out.println("Площадь окружности равна: "+S);

        return S;

    }
    public static double Ploza(int a,double pi){

        Scanner scanner = new Scanner(System.in);
        double L = 2 * pi * a;
        System.out.println("Длина окружности равна: "+L);
        return L;

    }

}

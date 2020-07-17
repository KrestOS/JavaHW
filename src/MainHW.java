public class MainHW {
    public static <string> void main(String[] args) {

        //Объявление и инициализация значений переменных
        byte byt = 5;
        short sh = 7;
        int in = 10;
        long lg = 929292929929292l;
        float fl = 3.45f;
        double dbl = 4.86934869;
        char ch = 'F';
        boolean bool = true;
        String st = "str";
        int x = 4; //используется в sumLim()
        int y = 15; //используется в sumLim()
        int p = -7; //используется в boolPositiveOrNegativeNumb()
        int year = 800; //используется в leapYear()
        System.out.println("a * (b + (c / d)) = " + task(1.9f,3.4f,5.8f,2.1f) + "\n");
        System.out.println("Сумма чисел " + x + " и " + y + " лежит в пределах от 10 до 20? Ответ:" + sumLim(x,y) + "\n");
        positiveOrNegativeNumb(-5);
        System.out.println("Число "  + p + " отрицательное? - " + boolPositiveOrNegativeNumb(p) + "\n");
        helloName("Фанзиль");
        leapYear(year);
    }

    //Метод вычисляющий выражение a * (b + (c / d)) с аргументами типа float
    public static float task(float a, float b, float c, float d){
        return a*(b+c/d);
    }

    /*Метод, принимающий на вход два целых числа и проверяющий,
     что их сумма лежит в пределах от 10 до 20 (включительно),
     если да – вернуть true, в противном случае – false. */
    public static boolean sumLim(int x,int y){
        return x+y>=10&&x+y<=20;
    }

    /*Метод, которому в качестве параметра передается целое число,
      метод должен напечатать в консоль, положительное ли число передали или отрицательное.
      Замечание: ноль считаем положительным числом.*/
    public static void positiveOrNegativeNumb(int p){
        if (p>=0) {
            System.out.println("Число " + p + " положительное\n");
        }else {
            System.out.println("Число " + p + " отрицательное\n");
        }
    }

    /*Метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное*/
    public static boolean boolPositiveOrNegativeNumb(int p){
            return p<0;
    }

    /*Метод, которому в качестве параметра передается строка, обозначающая имя.
     Метод должен вывести в консоль сообщение «Привет, указанное_имя!».*/
    public static void helloName(String name){
        System.out.println("\"Привет, " + name + "!\"");
    }

    /*Метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
    public static void leapYear(int year){
        if (year % 4 == 0 && year % 400 == 0 || year % 100  != 0) {
            System.out.println("Год " + year + " високосный");
        }else {
            System.out.println("Год " + year + " невисокосный");}
    }
}




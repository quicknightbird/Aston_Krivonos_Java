import java.util.Scanner;

public class Tasks {

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Выберете алгоритм, указав его номер, для выхода укажите 0");
            System.out.println("1.Число больше 7");
            System.out.println("2.Вячеслав ли?");
            System.out.println("3.Пример, где на входе числовой массив, вывести числа кратные 3");
            System.out.println("4.Пример, где человек сам вводит массив чисел, вывести числа кратные 3");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите номер алгоритма: ");
            int numberAl = scanner.nextInt();
            if(numberAl==1){
                Number();
            }
            else if(numberAl==2){
                Name();
            }
            else if(numberAl==3){
                int[] sss = {1,2,3,4,5,6,7,8,9,10};
                Arr(sss);
            }
            else if(numberAl==4){
                Arr2();
            }else if(numberAl == 0) {
                exit = true;
            }
            else{
                System.out.println("Неправильно указан номер, попробуйте еще раз");
                System.out.println(" ");
            }
        }

    }
    public static void Number(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (number > 7){
            System.out.println("Привет");
        }
    }

    public static void Name(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        if (name.equals("Вячеслав")){
            System.out.println("Привет "+name);
        }else{
            System.out.println("Нет такого имени");
        }
    }
    public static void Arr(int[] arr){
        System.out.println("Пример где на входе числовой массив: ");
        for(int num:arr) {
            if(num%3==0){
                System.out.print(num+" ");
            }
        }
        System.out.println(" ");
    }
    public static void Arr2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве");
        int amount = scanner.nextInt();
        int[] array = new int[amount];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i + 1) + " элемент массива:");
            array[i] = scanner.nextInt();
        }
        for(int num:array) {
            if(num%3==0){
                System.out.print(num+" ");
            }
        }
    }

}
/*
[((())()(())]] - данная последовательность неправильная
у нее отсутсвует одна закрывающееся круглая скобка и одна открывающееся квадратная скобка
соответсвенно, нужно либо добавить еще одну квадратную скобку или убрать одну закрывающееся квадратную скобку
и добавить одну закрывающееся круглую
в принципе через стек можно реализовать проверку на правильность, но в задание(надеюсь правильно понял,
не надо было писать код, только текстовая форма)
Примеры:
[((()))()(())]
[[()(())()(())]]
*/

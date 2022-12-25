package model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in)) {
            label:
            while (true) {

                System.out.print("Выберите пункт меню: ");
                if (scanner.hasNextInt()) {
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                            inputTask(scanner);
                            break;
                        case 2:
                            // todo: обрабатываем пункт меню 2
                            break;
                        case 3:
                            // todo: обрабатываем пункт меню 3
                            break;
                        case 0:
                            break label;
                    }
                } else {
                    scanner.next();
                    System.out.println("Выберите пункт меню из списка!");
                }
            }
        }
    }

    private static void inputTask(Scanner scanner) {
        System.out.print("Введите название задачи: ");
        String taskName = scanner.next();
        System.out.print("Введите описанние задачи: ");
        String taskDescription = scanner.next();
        Type type;
        do {
            System.out.println("Введите тип задачи: 1.Личная\n2. Рабочая\nТип задачи: ");
            if (scanner.hasNextInt()){
                int number = scanner.nextInt();
                System.out.println("Введите 1 или 2");
                if (number!=1 && number !=2){
                    continue;
                }
                if (number==1){
                    type = Type.PERSONAL;
                }else {
                    type = Type.WORK;
                }
                break;
        }else{
                scanner.next();
            }
        }while (true);

        }


    }
}
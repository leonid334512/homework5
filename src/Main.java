//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1

        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 2

        int clientDeviceYear = 2009;
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 3

        int year = 2024;
        if (year > 1584) {
            if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
                System.out.println("Год является високосным");
            } else {
                System.out.println("Год не является високосным");
            }
        } else {
            System.out.println("Год не может быть меньше 1584");
        }

        //Задача 4
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 сутки на доставку");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 суток для доставки");
        } else if (deliveryDistance >=60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 суток для доставки");
        } else {
            System.out.println("Доставки нет");
        }
        // Задача 5

        int monthNumber = 3;
        switch (monthNumber) {
            case 1:
                System.out.println("1-й месяц (он же январь) принадлежит к сезону Зима");
                break;
            case 2:
                System.out.println("2-й месяц (он же февраль) принадлежит к сезону Зима");
                break;
            case 3:
                System.out.println("3-й месяц (он же март) принадлежит к сезону Весна");
                break;
            case 4:
                System.out.println("4-й месяц (он же апрель) принадлежит к сезону Весна");
                break;
            case 5:
                System.out.println("5-й месяц (он же май) принадлежит к сезону Весна");
                break;
            case 6:
                System.out.println("6-й месяц (он же июнь) принадлежит к сезону Лето");
                break;
            case 7:
                System.out.println("7-й месяц (он же июль) принадлежит к сезону Лето");
                break;
            case 8:
                System.out.println("8-й месяц (он же август) принадлежит к сезону Лето");
                break;
            case 9:
                System.out.println("9-й месяц (он же сентябрь) принадлежит к сезону Осень");
                break;
            case 10:
                System.out.println("10-й месяц (он же октябрь) принадлежит к сезону Осень");
                break;
            case 11:
                System.out.println("11-й месяц (он же ноябрь) принадлежит к сезону Осень");
                break;
            case 12:
                System.out.println("12-й месяц (он же декабрь) принадлежит к сезону Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }

    }
}

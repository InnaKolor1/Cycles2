public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача 1 ");

        int sumOfManey = 2_459_000;
        int sum = 0;
        int accumulation = 15_000;
        int month = 0;
        double procent = 10 / 100;
        while (sum < sumOfManey) {
            sum += accumulation;
            sum = (int) (sum * (1 + procent));
            month++;
            System.out.println(" Месяц " + month + " сумма накоплений равна " + sum + " рублей");

        }

        System.out.println(" Задача 2 ");
        int numbers = 0;
        while (numbers < 10) {
            numbers++;
            System.out.print(numbers);
        }
        System.out.println();
        for (; numbers >= 1; numbers--) {
            System.out.print(numbers);
        }
        System.out.println();


        System.out.println(" Задача 3 ");
        int countryY = 12_000_000;
        int birthRate = 17;
        int death = 8;
        int year = 2014;
        for (int year2 = year; year2 < year + 10; year2++) {
            countryY += countryY * birthRate / 1000 - countryY * death / 1000;
            System.out.println("Год" + year2 + " численность населения составляет " + countryY);
        }


        System.out.println(" Задача 4 ");

        double procent2 = 70 / 100;
        int month2 = 0;
        int accumulation2 = 12_000_000;
        sum = accumulation;
        while (sum < accumulation2) {
            sum += accumulation;
            sum = (int) (sum * (1 + procent2));
            month2++;
            System.out.println(" Месяц " + month2 + " сумма накоплений равна " + sum + " рублей");
        }

        System.out.println(" Задача 5 ");
        sum = accumulation;
        month2 = 0;
        while (sum < accumulation2) {
            sum += accumulation;
            sum = (int) (sum * (1 + procent2));
            month2++;
            if (month2 % 6 == 0) {
                System.out.println(" Месяц " + month2 + " сумма накоплений равна " + sum + " рублей");
            }
        }
        System.out.println(" Задача 6 ");
        sum = accumulation;
        month2 = 0;
        int year9 = 9 * 12;
        while (month2 < year9) {
            sum += accumulation;
            sum = (int) (sum * (1 + procent2));
            month2++;
            if (month2 % 6 == 0) {
                System.out.println(" Месяц " + month2 + " сумма накоплений равна " + sum + " рублей");
            }


            System.out.println(" Задача 7 ");
            int friday1 = 3;
            for (int i = friday1; i <= 31; i += 7) {
                System.out.println(" Сегодня пятница " + i + " -е число. Необходимо подготовить отчет ");
            }

            System.out.println(" Задача 8 ");
            int interval = 79;
            int total = 0;
            int year2 = 2024;
            int start = year2 - 200;
            int finish = year2 + 100;
            for (int year3 = start; year3 < finish; year3++) {
                if (year3 %interval==total) {
                    System.out.println(year3);
                }
            }
        }
    }
}

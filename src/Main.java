public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int totalSum = 2_459_000;
        int sum = 0;
        int accumulation = 15_000;
        double percent = 1D / 100;
        int month = 0;
        while (sum < totalSum) {
            sum += accumulation;
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
        }
        System.out.println();
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int currentYear = 2025;
        for (int year = currentYear; year < currentYear + 10; year++) {
            population += population * birthRate / 1000 - population * mortality / 1000;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
        System.out.println();
        System.out.println("Задача 4");

        percent = 7D / 100;
        totalSum = 12_000_000;
        sum = accumulation;
        month = 0;
        while (sum < totalSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
        }
        System.out.println();
        System.out.println("Задача 5");
        sum = accumulation;
        month = 0;
        while (sum < totalSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
            }
        }
        System.out.println();
        System.out.println("Задача 6");
        sum = accumulation;
        month = 0;
        int months = 12 * 9;
        while (month < months) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
            }
        }
        System.out.println();
        System.out.println("Задача 7");
        int firstFriday = 7;
        for (int day = firstFriday; day <= 31; day+= 7){
            System.out.println("Сегодня пятница, " + day + " -е число. Необходимо подготовить отчет");
        }
        System.out.println();
        System.out.println("Задача 8");
        int period = 79;
        int startComet = 0;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = startComet; year < end; year += period){
            if (year > start){
                System.out.println(year);
            }
        }
        }
    }
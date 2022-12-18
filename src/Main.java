public class Main {
    public static void main(String[] args) {
        task1();
        // С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        //Результат программы должен быть выведен в консоль с тем количеством месяцев, которое необходимо для накопления данной суммы. Формат сообщения: «Месяц …, сумма накоплений равна … рублей» .
        task2();
        // Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
        //На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
        task3();
        // В стране Y население равно 12 миллионов человек.
        //
        //Рождаемость составляет 17 человек на 1000, смертность — 8 человек. Рассчитайте, какая численность населения будет через 10 лет, если показатели рождаемости и смертности постоянны.
        //В консоль выведите результат операции на каждый год в формате: «Год …, численность населения составляет …».
        task4();
        // Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%. Первоначальная сумма вклада — 15 тысяч рублей.
        //Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется, а всегда равен 7%.
        //Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
        task5();
        // Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только каждый шестой. Должны быть видны накопления за 6, 12, 18, 24-й и следующие месяцы.
        task6();
        // Василий решил, что будет копить деньги ближайшие 9 лет. Он хочет знать, какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
        //Исходная сумма всё та же — 15 тысяч рублей, проценты банка – 7% ежемесячно.
        //Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.
        task7();
        // В компании пятница — отчетный день.
        //Нужно написать программу, которая считает дни месяца по датам, определяет, какой день пятница, и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
        //Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        //Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида: «Сегодня пятница, ...-е число. Необходимо подготовить отчет».
        //В нашем месяце 31 день. В результате у вас должно получиться от 4 до 5 сообщений с напоминаниями по разным датам.
        task8();
        // Нам нужно написать астрономическое приложение, которое считает, когда над Землей пролетает комета.
        //Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
        //В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления (ближайшие 100 лет).
        //Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.


    }

    public static void task1() {
        System.out.println("task1");
        int amountFinally = 2459000;
        int amount = 0;
        int month = 1;
        while (amount < amountFinally) {
            amount = amount + 15000;
            month++;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + amount + " рублей ");
        }
    }

    public static void task2() {
        System.out.println("task");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }
        System.out.println(" ");

        for (int j = 10; j > 0; j--) {
            System.out.print(" " + j);
        }
    }


    public static void task3() {
        System.out.println("task3");

        int population = 12_000_000;
        float fertility = (float) 17 / 1000;
        float mortality = (float) 8 / 1000;
        for (int i = 1; i < 11; i++) {
            population = (int) (population + (population * fertility) - (population * mortality));

            System.out.println("Год " + i + " численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("task4");

        int monthlyDeposit = 15000;
        double monthlyPercent = 0.07;
        int totalAmount = 0;
        int monthCount = 1;
        int maxAmount = 12000000;
        while (totalAmount <= maxAmount) {
            totalAmount += monthlyDeposit + totalAmount * monthlyPercent;
            System.out.println("Месяц " + monthCount + " сумма накоплений составит " + " " + totalAmount);
            monthCount++;
        }
    }


    public static void task5() {
        System.out.println("task5");

        int monthlyDeposit = 15000;
        double monthlyPercent = 0.07;
        int totalAmount = 0;
        int monthCount = 1;
        int maxAmount = 12000000;
        while (totalAmount <= maxAmount) {
            totalAmount += monthlyDeposit + totalAmount * monthlyPercent;
            if (monthCount % 6 == 0) {
                System.out.println("Месяц " + monthCount + "  сумма накоплений составит " + " " + totalAmount);
            }
                monthCount++;
            }
        }

        public static void task6() {
            System.out.println("task6");

            int monthlyDeposit = 15000;
            double monthlyPercent = 0.07;
            int timeAccumulation = 12 * 9;
            int totalAmount = 0;
            int monthCount = 1;
            while (monthCount <= timeAccumulation) {
                totalAmount += monthlyDeposit + totalAmount * monthlyPercent;
                if (monthCount % 6 == 0) {
                    System.out.println("Месяц " + monthCount + " сумма накоплений составит " + " " + totalAmount);
                }
                monthCount++;

            }
    }


        public static void task7() {
            System.out.println("task7");
            int friday = 2;
            int totalDays = 31;
            while (friday <= totalDays) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
                friday += 7;
            }

        }

        public static void task8() {
            System.out.println("task8");
            int currentYear = 2022;
            int startYear = currentYear - 200;
            int endYear = currentYear + 100;
            for (int year = startYear; year <= endYear; year++ ) {
                if (year % 79 == 0);
                System.out.println(year);
                System.out.println("  ");
            }
        }

        }


public class Main {
        public static void main(String[] args) {
            // Объявляете переменные для входных данных и
            // параметров программы: одну для хранения
            // стоимости билета, другую для хранения количества
            // рублей для одной бонусной милли

            // Рассчитываете количество бонусных милль, используя
            // значения заведённых переменных. Ответ сохраняете в
            // новую переменную и выводите на экран
        int price_ticket = 995;
        int bonus = 20;
        int mili =  price_ticket/bonus;
                    System.out.println("Количество Ваших бесплатных милей = " + mili);
        }
    }

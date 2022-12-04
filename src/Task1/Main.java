package Task1;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashTel hashTel = new HashTel();
        hashTel.addPhone(new FullName("Иванов", "Иван"), "89992134876");
        hashTel.addPhone(new FullName("Сергеев", "Сергей"), "89605689231");
        hashTel.addPhone(new FullName("Моисеева", "Валентина"), "89028734810");
        hashTel.addPhone(new FullName("Ракина", "Екатерина"), "89825193671");
        hashTel.addPhone(new FullName("Андреев", "Анатолий"), "89082647820");
        hashTel.addPhone(new FullName("Андреев", "Олег"), "89523281869");
        hashTel.addPhone(new FullName("Осокин", "Алексей"), "89082453243");
        hashTel.addPhone(new FullName("Андров", "Дмитрий"), "89082721160");
        hashTel.addPhone(new FullName("Вотинова", "Елена"), "89523293769");
        hashTel.addPhone(new FullName("Габов", "Альберт"), "89922041820");
        hashTel.addPhone(new FullName("Гладикова", "Тамара"), "89922390893");
        hashTel.addPhone(new FullName("Дикидзина", "Евгения"), "+79194841616");
        hashTel.addPhone(new FullName("Лебедева", "Анастасия"), "89026320534");
        hashTel.addPhone(new FullName("Лягаева", "Алена"), "89526402026");
        hashTel.addPhone(new FullName("Мазеин", "Сергей"), "+79922117928");
        hashTel.addPhone(new FullName("Нешатаев", "Владимир"), "89028070577");
        hashTel.addPhone(new FullName("Нешатаева", "Людмила"), "89024775531");
        hashTel.addPhone(new FullName("Рагозин", "Сергей"), "89504551901");
        hashTel.addPhone(new FullName("Сальникова", "Надежда"), "890263222709");
        hashTel.addPhone(new FullName("Зубарев", "Александр"), "9824806782");

        System.out.println("Телефонный справочник:");
        for (Map.Entry<FullName, String> entry : hashTel.getEntries()) {
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
        }
    }

}



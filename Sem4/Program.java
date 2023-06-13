package Sem4;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        SimpleAccount simpleAccount = new SimpleAccount(4452, 300.78);
        System.out.println(simpleAccount);

        UniversalAccount universalAccount = new UniversalAccount("asw123", 74523.23);
        System.out.println(universalAccount);

        UniversalAccount universalAccount1 = new UniversalAccount(new AccountIdentifier(784, "Qweds"), 74523.23);
        System.out.println(universalAccount1);

        System.out.println(((AccountIdentifier) universalAccount1.getId()).getPrefix());

        Account<AccountIdentifier> account = new Account<>(new AccountIdentifier(784, "trewfgds"), 455.12);
        System.out.println(account);
        AccountIdentifier accountIdentifier = account.getId();
        System.out.println(accountIdentifier.getPrefix());

        int a = 12;
        double b = 2.13;
        boolean c = true;
        char d = 'w';

        Object[] elements = new Object[4];
        elements[0] = a;
        elements[1] = b;
        elements[2] = c;
        elements[3] = d;

        for (Object element : elements) {
            if (element instanceof Double) {
                //((double)element)
            }
        }

        ArrayList<String> list = new ArrayList<>();


        Integer[] numbers = {1, 8, 89, 4, 5};
        String[] names = {"Влад", "Виктор", "Сергей", "Вадим"};

        Object[] newNames = ArrayUtils.replaysToElements(names, 0, 3);
        for (Object element : newNames) {
            System.out.println(element);
        }

        Integer[] newNumbers = ArrayUtils.replaysTwoElementsV2(numbers, 1 , 2);
        for (Integer element: newNumbers) {
            System.out.println(element);
        }

    }
}



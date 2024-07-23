package org.example.nested;

public class Main {
    public static void main(String[] args) {
        Class1 cl1 = new Class1(3, 4);

        System.out.println(cl1.aPlusB());
        System.out.println(Class2.Class3.c);

    }
}

// Пример обычного класса
class Class1 {
    int a;
    int b;

    public Class1(int a, int b) {
        this.a = a;
        this.b = b;
        // Код ниже не сработает - класс APlusBSummer локальный
        // new APlusBSummer();
    }

    public int aPlusB() {
        class APlusBSummer {
            final int a;
            final int b;

            public APlusBSummer(int a, int b) {
                this.a = a;
                this.b = b;
            }

            public int sumAAndB() {
                return a + b;
            }
        }

        // А это - пример использования анонимного класса
        // В Java он представляет собой инициалазированный и тут же переопределённый интерфейс.
        // Причём будут доступны только те методы и поля, которые были определены в интерфейсе.
        I aAndBSummer = new I() {
            @Override
            public int abc() {
                return a + b;
            }

            public String cde() {
                return Integer.toString(a + b);
            }
        };

        aAndBSummer.abc();

        return new APlusBSummer(a, b).sumAAndB();
    }
}

// Статичным классом может быть только вложенный класс. Код ниже - не сработает
// static class Class2
class Class2 {
    public Class2() {

    }

    // Основная причина использования nested static класс -
    // необходимость показать взаимосвязь классов, без необходимости создавать внешний класс.
    // Если внешний класс создаётся в любом случае, то можно обойтись и inner-классом
    public static class Class3 {
        int a;
        int b;

        public static int c = 0;
    }
}

interface I {
    int a = 0;
    int b = 0;

    int abc();
}
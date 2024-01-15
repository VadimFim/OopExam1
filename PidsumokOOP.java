interface MyInterface {
    void method1();
    void method2();
}

//Імплементація (Реалізація методів).
class MyClass implements MyInterface {
    @Override
    public void method1() {
        System.out.println("Виклик методу 1");
    }

    @Override
    public void method2() {
        System.out.println("Виклик методу 2");
    }

    public void additionalMethod() {
        System.out.println("Додатковий метод");
        // Місце для довільної логіки.
    }

    public void anotherAdditionalMethod() {
        System.out.println("Інший додатковий метод");
        // Місце для довільної логіки у додатковому методі.
    }
}

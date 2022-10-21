package Wzorce.WzorceProjektowe.VIDEO;

public class LaW {
    private SomeClass thisClassField;

    public void examplesTheLawOfDemeter(SomeClass2 methodArgum){
        //1.  wywołanie własnej metody jako klasy OK
        classOwnedMethod();

        //2.  wywołanie metody klasy przekazanej jako argument metody OK
        methodArgum.someMethod2();

        //3. worzenie obiektu wewnątrz klasy i zawołanie metody tej klasy OK
        SomeClass3 objectCreateInsideMethod = new SomeClass3();
        objectCreateInsideMethod.someMethod3();

        //4. wywołanie metody bezpośredniego komponentu klasy (pola, agregowaneg obiektu itp.) OK
        thisClassField.someMethod1();

        //5. odczyt globalenj zmiennej, dostępnej dla klasy z poziomu bloku metody -> OK
        var globalVariable = InnaKlasa.PUBLIC_STATIC_FINAL;
}
    private void classOwnedMethod() {
    }
}
class SomeClass{
    void someMethod1() {}
}
class SomeClass2{
    void someMethod2() {}
}
class SomeClass3{
    void someMethod3() {}
}
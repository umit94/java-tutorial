package accessModifiers.PckgB;

public class C {
    B b = new B(); //B public olmamasına rağmen C ile aynı package içerisinde bulunduğundan C tarafından erişilebilir durumdadır.
    void testMethod(){
        b.defaultTest();
        b.protectedTest();
        b.publicTest();
    }
}

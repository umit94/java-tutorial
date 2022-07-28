package accessModifiers.PckgB;

import accessModifiers.PckgA.A;

class B { //B classı public olmadığı için sadece kendi package'ından erişilebilir
    A a = new A(); //A classı public olduğu için diğer packagelardan erişilebilir
    protected void protectedTest(){}
    void defaultTest(){
        a.publicTest();
        //a.defaultTest(); //public olmadığı için sadece kendi package'ından erişilebilir
    }
    public void publicTest(){}
}

package exceptions;

import exceptions.closableClass.ClosableClass;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.handleException();
        //test.doSomething(); //handle etmediğimiz için hata çıkar






        //----try with resource----

        try(ClosableClass closableClass = new ClosableClass("closableClass"); ClosableClass closableClass2 = new ClosableClass("closableClass2")){ //AutoCloseable'u implement eden bir class olmalı
            // noktalı virgül ile ayrılır
            // kapatma sırası son yazılandan ilk yazılana doğrudur (kapatma sırası -> 1-closableClass2    2-closableClass)

            Test.throwException();
            // closableClass.close(); //exception fırlatıldığı takdirde try with resource zaten close methodunu otomatik olarak çalıştırdığı için yazmaya gerek yoktur
        }catch (Exception e){

        }

        //----try with resource----
    }

    public static void throwException() throws Exception{ //try with resource örneği için yazılan method
        throw new Exception();
    }

    public void handleException() {
        // doSomething(); //bu method exception throw ettiği için handle edilmesi gerekmektedir. ya try-catch içerisine yazılır ya da içinde bulunduğu method'da throw eder ve bir üst method tarafından handle edilir
        try {
            doSomething();
            System.out.println("Bir üst satırda hata oluştuğu için program bu satıra hiç gelmeyecektir");
        }catch(InterruptedException|EnumConstantNotPresentException t){ //İki farklı exception tek blokda yakalanabilir
            System.out.println(t);
        }
        catch (RuntimeException t) { //methodtan fırlatılan RuntimeException burada handle edilir
            System.out.println("Oluşan hata:" + t.getMessage());
        }catch (Exception t){ //methodtan fırlatılan IOException burada handle edilir, çünkü üst tarafta ona özel bir catch bloğu bulunmamakta ve Exception parentı tarafından handle edilir
            System.out.println(t);
        }catch (Throwable t){ //Throwable<=Exception<=RuntimeException ilişkisi olduğu için bu şekilde birden fazla catch ile handle edilebilir. Daha genel olan exception alta yazılır
            System.out.println(t);
        }finally { //try dan sonra kesinlikle bir catch veya finally olmalı. ikisi birlikte de olabilir
            //try'dan sırasında exception fırlatılsın ya da fırlatılmasın program her koşulda finally bloğuna girer (catch'den sonra girer)
            System.out.println("finally");
        }
    }

    //---- checked ve unchecked exceptionlar
    // unchecked exceptionlar programıcının hatasından kaynaklanır. Bu exceptionlar programda bug olduğu anlamına gelir. Ancak checked exceptionlar programcı tarafından yazılır
    // ve istenmeyen durumlarda bu exception fırlatılarak bu istenmeyen durumun çözülmesi sağlanır. Örneğin veri tabanından alınan bir veride id olması beklenirken bulunmuyor ise
    // bunun çözülmesi gereklidir. IdNotFoundException gibi bir checked exception fırlatılıp bu exception handle edilebilir.
    // unchecked exceptionlar ise kesinlikle prod ortamına çıkmadan dev ortamında düzeltilmesi gereken sorunlardır ve program bu exceptionlardan arındırılmalıdır

    public void doSomething() throws IOException,InterruptedException { //throw edebilmek için throws deyip tipini belirtmemiz gerekir. Birden fazla farklı exception fırlatılabilir.
        //throws RuntimeException yazılmasına gerek yoktur, çünkü unchecked exceptiondır.

        if(true)
            throw new RuntimeException(); //RuntimeException'lar unchecked expceptiondır ve yakalanması gerekmez. Unchecked exceptionlar programcı hatasıdır ve çözülmesi gereklidir
        else
            throw new IOException(); // checked exceptiondır yakalanması ve handle edilmesi gereklidir
    }
}

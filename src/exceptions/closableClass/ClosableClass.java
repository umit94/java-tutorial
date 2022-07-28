package exceptions.closableClass;

public class ClosableClass implements AutoCloseable{
    private String name;

    public ClosableClass(String name){
        this.name=name;
    }

    @Override
    public void close() throws Exception { //override ederken fırlatılan exception, ya override edilen methodun fırlattığı exception ile aynı
        // yada bu exception'ın alt sınıflarından olmalı. hiç throw fırlatmamayı da tercih edebiliriz
        System.out.println("Closing "+name);
    }
}

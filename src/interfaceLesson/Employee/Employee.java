package interfaceLesson.Employee;

public class Employee implements Worker,OverrideTest, Comparable<Employee>{ //Birden fazla interface implement edilebilir
    private int no;

    public Employee(){}

    public Employee(int no){
        this.no=no;
    }

    public void printNo() {
        System.out.println(no);
    }

    @Override
    public void work() {
        // concrete class olduğundan Worker interface'inin içerisinde tanımlandığı için burada bir implementation verilmelidir
        // abstract class olsaydı verilmesine gerek olmazdı, çünkü child classlarda verilmek zorunda olacaktı
    }

//    @Override
//    public void workMuch() {
//        //Bu method sadece Worker interface'inde default olarak bulunduğu için override edilmek zorunda değildir.
//    }


    @Override
    public void workHarder(){
        // implement edilen Worker ve OverrideTest methodların ikisinde de aynı signature'a ve implementation'a (yani default olan) sahip workHarder methodu bulunduğu için
        // bu methodu override etmek zorundayız. Yalnızca bir tane olsaydı override etmek zorunda olmazdık.
        // implementation interfacelerin yalnızca bir tanesinde olsa bile override edilmelidir
    }

    @Override
    public int compareTo(Employee e){
        if(e.no>no)
            return 1;
        else if(e.no==no)
            return 0;
        else
            return -1;

        // return Integer.compare(e.no,no); //Integer karşılaştırması olduğu için bu şekilde kısaca yapılabilir
    }
}

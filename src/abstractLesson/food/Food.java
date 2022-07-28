package abstractLesson.food;

public abstract class Food { // final veya private yapılamaz, çünkü abstract yapılmasının sebebi zaten alt sınıflara aktarılmak istenmesidir
    public Food(){

    }

    public abstract void eat();//implementation yazılmaz, çünkü alt sınıflarda yazmak zorunludur

    public void doSomething(){ //abstract class, abstract olmayan methodlar içerebilir, ancak abstract olmayan(concrete) classlar abstract methodlar içeremez

    }

    //private abstract void doSomething(); //final veya private yapılamaz, çünkü abstract yapılmasının sebebi zaten alt sınıflara aktarılmak istenmesidir

//    public Food createFood(){
//        return new Food(); // abstract class'ın hiçbir şekilde nesnesi oluşturulamaz
//    }
}

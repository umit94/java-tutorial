package memoryLeak;

public class MemoryLeakTest {
    String leaker = "Leaker";
    public static void main(String[] args) {
        MemoryLeakTest[] mem=new MemoryLeakTest[1000000000];
        for(int i=0;i<1000000000;i++){
            mem[i]=new MemoryLeakTest();

        }
    }
}

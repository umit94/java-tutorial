package nestedClass.staticInner;

public class Outer {
    private static int a=3;
    private Inner inner;

    public Outer(Inner inner){
        this.inner=inner;
    }

    public int getInnerNo(){
        return inner.getNo();
    }

    public static class Inner{
        private int no;
        public Inner(int no){
            this.no=no;
        }

        public int getNo() {
            return no;
        }
    }
}

package nestedClass.memberInner;

public class MemberOuter {
    private static int a=3;
    private Inner inner;

    public MemberOuter(){
    }

    public int getInnerNo(){
        return inner.getNo();
    }

    public class Inner{
        private int no;
        public Inner(int no){
            this.no=no;
        }

        public int getNo() {
            return no;
        }
    }
}

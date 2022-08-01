public class override {
    public static void main(String[] args) {
        var op=new opration();
        op.sum(10,15);
        var s=new sum();
        s.sum(10,15);
    }
    static class sum{
        public static void sum(int x,int y){
            System.out.println(x+"+"+y+"="+(x+y));
        }
    }
    static class opration extends sum{
        public static void sum(int x, int y){
            System.out.println("sum="+(x+y));
        }


    }
}

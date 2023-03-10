package Collection;

public class NonLambdaImpl implements LambdaInterface {
    @Override
    public void makeString(String s1, String s2) {
        System.out.println(s1 + ","+ s2);
    }
}

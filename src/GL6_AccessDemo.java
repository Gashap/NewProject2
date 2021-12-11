class MyClass{
    private int alpha;
    public int beta;
    int gamma;  //тип доступа public

    //Методы доступа к закрытой переменной
    void setAlpha(){
        alpha = -99;
    }
    int getAlpha(){
        return alpha;
    }
}

public class GL6_AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        //Доступ к переменной alpha возможен только с
        // помощью специально предназначенных методов
        ob.setAlpha();
        System.out.println("ob.alpha: " + ob.getAlpha());
        //ob.alpha = 10 -- так делать нельзя из-за
        // модификатора доступа private
        ob.beta = 5;
        ob.gamma = 10;
    }
}

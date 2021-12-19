//Простые типы данных передаются по значению
class Test{
    //Этот метод не может изменить значения аргументов,
    //передаваемых ему при вызове
    void noChange(int i, int k){
        i = i + k;
        k = i-k;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();

        int a  = 15, b = 20;
        System.out.println("a и b перед вызовом: " + a + ", " + b);

        ob.noChange(a, b);
        System.out.println("a и b после вызова: " + a + ", " + b);
    }
}

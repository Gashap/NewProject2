//Объекты передаются методам по ссылке
class Tests{
    int a, b;

    Tests(int i, int k){
        a = i;
        b = k;
    }

    //Передача объекта методу
    void change(Tests obo){
        obo.a = obo.a + obo.b;
        obo.b = -obo.b;
    }
}

public class GL6_CallByRef {
    public static void main(String[] args) {
        Tests ob = new Tests(15, 20);
        System.out.println("ob.a и ob.b перед вызовом: " + ob.a + ", " + ob.b);

        ob.change(ob);
        System.out.println("ob.a и ob.b после вызовом: " + ob.a + ", " + ob.b);
    }
}

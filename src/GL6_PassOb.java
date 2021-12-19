//Методам можно передовать объекты
class  Block{
    int a, b, c;
    int volume;

    Block(int i, int j, int k){
        a = i;
        b = j;
        c = k;
        volume = a*b*c;
    }

    //Вернуть логическое значение true, если параметр ob определяет тот же переллелепипед
    boolean sameBlock(Block ob){    //объект в качестве параметра
        return (ob.a == a) & (ob.b == b) & (ob.c == c);
    }

    //Вернуть логическое значение true, если параметр ob определяет переллелепипед того же объёма
    boolean sameVolume(Block ob){   //объект в качестве параметра
        return ob.volume == volume;
    }
}

public class GL6_PassOb {
    public static void main(String[] args) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);

        System.out.println("ob1 имеет те же размеры, что и ob2: " + ob1.sameBlock(ob2));
        System.out.println("ob2 имеет те же размеры, что и ob3: " + ob2.sameBlock(ob3));
        System.out.println("ob1 имеет тот же объём, что и ob3: " + ob1.sameVolume(ob3));
    }
}

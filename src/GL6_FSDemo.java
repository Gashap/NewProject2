class FailSoftArray{
    private int[] a;    //ссылка на массив
    private int errval; //возвращаемое значение в случае ошибки
                        //при выполнеии метода get()
    int length;

    //Конструктору данного класса передаётся размер массва и значение,
    //которое должен возвращать при возникновении ошибки метод get()
    FailSoftArray (int size, int err){
        a = new int[size];
        errval = err;
        length = size;
    }

    //Возвращать значение элемента массива с заданным индексом
    int get(int index){
        if (indexOK(index)) return a[index];
        return errval;
    }

    //Установить значение элемента с заданным индексом.
    //При ошибке вернуть значение false.
    boolean put(int index, int val){
        if (indexOK(index)){
            a[index] = val;
            return true;
        }
        return false;
    }

    //Вернуть значение true, если индекс не выходит за границы массива
    private boolean indexOK(int index){
        if (index >= 0 & index < length) return true;
        return false;
    }
}

public class GL6_FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        //демонстрация корректной обработки ошибок
        System.out.println("Обработка ошибок без вывода отчёта.");
        for (int i = 0; i < (fs.length * 2); i++) fs.put(i, i*10);
        for (int i = 0; i < (fs.length * 2); i++){
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
        }

        System.out.println();

        //Обработка ошибки
        System.out.println("\nОбработка ошибки с выводом отчёта.");
        for (int i = 0; i < (fs.length * 2); i++)
            if (!fs.put(i, i*10))
                System.out.println("Индекс " + i + " вне допустимого диапазона");

        for (int i = 0; i < (fs.length * 2); i++){
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
            else System.out.print("\nИндекс " + i + " вне допустимого диапазона");
        }
    }
}

class Queue {
    private final char[] q;   //массив для хранения элементов очереди
    private int putlok, getlok; //индексы для вставки и извлечения элементов очереди

    Queue(int size){
        q = new char[size+1];   //выделение памяти для очереди
        putlok = getlok = 0;
    }

    //Поместить символы в очередь
    void put(char ch){
        if (putlok == q.length-1){
            System.out.println(" - Очердеь заполнена.");
            return;
        }
        putlok++;
        q[putlok] = ch;
    }

    //Извлечь символ из очереди
    char get(){
        if (getlok == putlok){
            System.out.println(" - Очередь пустая");
            return (char) 0;
        }
        getlok++;
        return q[getlok];
    }

}

public class GL6_Queue {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue srnallQ = new Queue(4);
        char ch;
        int i;
        System.out.println("Использование очереди ЬigQ для сохранения алфавита");

        // Поместить буквенные символы в очередь ЬigQ
        for(i=0; i < 26; i++)
            bigQ.put((char) ('А' + i));

        // Извлечь буквенные символы из очереди ЬigQ и отобразить
        System.out.print("Содержимое очереди ЬigQ: ");
        for (i=0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
            System.out.println("\n");
            System.out.println("Использование очереди srnallQ для генерации ошибок");
        }

        // Использовать очередь srnallQ для генерации ошибок
        for (i = 0; i < 5; i++) {
            System.out.print("Попытка сохранения " +
                    (char) ('z' - i));
            srnallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        // Дополнительные ошибки при обращении к очереди srnallQ
        System.out.print("Содержимое srnallQ: ");
        for (i = 0; i < 5; i++) {
            ch = srnallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}

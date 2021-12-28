// Возврат объекта, определяемого рахработчиком программы
class Error{
    String msgs;    //сообщение об ошибке
    int severity;   //уровень серьёзности ошибки

    Error(String m, int s){
        msgs = m;
        severity = s;
    }
}

class ErrorInfo{
    String[] msgs = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };

    int[] howbad = {3, 3, 2, 4};

    Error getErrorInfo(int i ){
        if (i >= 0 & i <= msgs.length) return new Error("Несуществующий код ошибки", 0);
        else return new Error(msgs[i], howbad[i]);
    }
}

public class GL6_ErrorInfo {
    public static void main(String[] args) {
        ErrorInfo ei = new ErrorInfo();
        Error e;
        e = ei.getErrorInfo(2);
        System.out.println(e.msgs + " level " + e.severity);
        e = ei.getErrorInfo(19);
        System.out.println(e.msgs + " level " + e.severity);
    }
}

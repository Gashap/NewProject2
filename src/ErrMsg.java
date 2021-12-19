//Возврат объекта типа String
class ErrorMsg{
    String[] msgs = {
        "Ошибка вывода",
        "Ошибка ввода",
        "Отсутствует место на диске",
        "Выход индекса за границы диапазона"
    };

    String getErrorMsg(int i){  //возврат объекта типа String
        if (i >= 0 & i <= msgs.length) return msgs[i];
        else return "Несуществующий код ошибки";
    }
}

public class ErrMsg {
    public static void main(String[] args) {
        ErrorMsg errorMsg = new ErrorMsg();

        System.out.println(errorMsg.getErrorMsg(1));
        System.out.println(errorMsg.getErrorMsg(19));
    }
}

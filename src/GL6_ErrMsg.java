//Возврат объекта типа String
class ErrorMsg{
    String[] msgs = {
        "Ошибка вывода",
        "Ошибка ввода",
        "Отсутствует место на диске",
        "Выход индекса за границы диапазона"
    };

    String getErrorMsg(int i){  //возврат объекта типа String
        //Если выражение true, i присвоется значение индекса массива msgs
        if (i >= 0 & i <= msgs.length) return msgs[i];
        else return "Несуществующий код ошибки";
    }
}

public class GL6_ErrMsg {
    public static void main(String[] args) {
        ErrorMsg errorMsg = new ErrorMsg();

        System.out.println(errorMsg.getErrorMsg(3));
        System.out.println(errorMsg.getErrorMsg(19));
    }
}

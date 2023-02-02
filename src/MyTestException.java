public class MyTestException  extends ArithmeticException{
    public MyTestException(Exception e) {
        super("Произошла ошибка при интеграции с сервисом клиента:"
                + e.getClass() + "-> "
                + e.getMessage());
    }
}

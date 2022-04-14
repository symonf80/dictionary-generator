import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String sourceText = "Задача заключается в том, чтобы написать генератор словаря аборигенов" +
                " в функциональном стиле. Представьте, что у вас есть исходный текст сообщения" +
                " местного жителя. Программа должна разбить текст на слова и отсортировать их в" +
                " естественном порядке. В комментариях укажите, какие отличительные черты" +
                " функционального стиля присутствуют в вашей программе.";
        Function<String, List<String>> function = (a) ->
                Arrays.stream(a.split(" ")).sorted().distinct().toList();
        function.apply(sourceText).forEach(System.out::println);
    }
}
//Присутствуют следующие черты функционального стиля: реализация интерфейса Function;
// в качестве монада используется Stream API.
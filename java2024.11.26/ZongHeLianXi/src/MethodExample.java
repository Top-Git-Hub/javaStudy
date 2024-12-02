import java.util.ArrayList;
import java.util.List;

public class MethodExample {
    public static void main(String[] args) {
        MethodExample example = new MethodExample();
        List<String> list = example.createList();
        example.processList(list);
    }

    public List<String> createList() {
        List<String> resultList = new ArrayList<>();
        resultList.add("元素1");
        resultList.add("元素2");
        return resultList;
    }

    public void processList(List<String> inputList) {
        for (String element : inputList) {
            System.out.println(element);
        }
    }
}
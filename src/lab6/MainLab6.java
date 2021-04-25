package lab6;


import java.util.ArrayList;
import java.util.List;

public class MainLab6 {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        List<String> list1 = new ArrayList<>();
        list1.add("itme 1");//0
        list1.add("item 2");//1
        list1.add("item 3");//2
        list1.add("item 4");//3
        list1.add("item 5");//4
        list1.add("item 6");//5


        op.listEx1(list1, 0);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);


        op.listEx2(list2, 99);
        op.listaEx3(list1, 2);
        op.listaEx4(list1, 5);
        op.listEx5(list1, 4, "newItem");
        op.listaEx6(list2, 6);
        op.listaEx7(list2);
        op.listaEx8(list2);

    }
}



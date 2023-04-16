package LR3;

import java.util.*;

public class variation_4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 4000000; i++) {
            arrayList.add(i);
        }

        TreeSet treeSet = new TreeSet<>(arrayList);
        //for (int i = 0; i < 4000000; i++) {
        //    treeSet.add(i);
        //}

        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        for (int i = 0; i < 4000000; i++) {
            linkedHashMap.put(i, ""+i);
        }

        long startAL = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            arrayList.add(0, i);;
        }
        System.out.println("Время выполнения операции добавления элемента в начало ArrayList = " + (System.currentTimeMillis() - startAL));

        startAL = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            arrayList.add(4000000+i);
        }
        System.out.println("Время выполнения операции добавления элемента в конец ArrayList = " + (System.currentTimeMillis() - startAL));

        startAL = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            arrayList.add(2000000+i, i);
        }
        System.out.println("Время выполнения операции добавления элемента в середину ArrayList = " + (System.currentTimeMillis() - startAL));

        long startTS = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            treeSet.add(4000000+i);
        }
        System.out.println("Время выполнения операции добавления элемента в TreeSet = " + (System.currentTimeMillis() - startTS));

        long startLHM = System.currentTimeMillis();
        for (int i = 4000000; i < 4020000; i++) {
            linkedHashMap.put(i, ""+i);
        }
        System.out.println("Время выполнения операции добавления элемента в LinkedHashMap = " + (System.currentTimeMillis() - startLHM));


        startAL = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            arrayList.remove(i);
        }
        System.out.println("Время выполнения операции удаления элемента в начале ArrayList = " + (System.currentTimeMillis() - startAL));

        startAL = System.currentTimeMillis();
        for (int i = 3999999; i > 3979999; i--) {
            arrayList.remove(i);
        }
        System.out.println("Время выполнения операции удаления элемента в конце ArrayList = " + (System.currentTimeMillis() - startAL));

        startAL = System.currentTimeMillis();
        for (int i = 2000000; i < 2020000; i++) {
            arrayList.remove(2000000);
        }
        System.out.println("Время выполнения операции удаления элемента в середине ArrayList = " + (System.currentTimeMillis() - startAL));

        startLHM = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            linkedHashMap.remove(i);
        }
        System.out.println("Время выполнения операции удаления элемента в LinkedHashMap = " + (System.currentTimeMillis() - startLHM));

        startTS = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            treeSet.remove(i);
        }
        System.out.println("Время выполнения операции удаления элемента в TreeSet = " + (System.currentTimeMillis() - startTS));

        for (int i = 4000000; i < 10000000; i++) {
            arrayList.add(i);
        }

        for (int i = 4000000; i < 10000000; i++) {
            treeSet.add(i);
        }

        for (int i = 4000000; i < 10000000; i++) {
            linkedHashMap.put(i, ""+i);
        }

        startAL = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            arrayList.get(i);
        }
        System.out.println("Время выполнения операции получения элемента по индексу ArrayList = " + (System.currentTimeMillis() - startAL));

        startTS = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            treeSet.iterator().next();
        }
        System.out.println("Время выполнения операции получения элемента по индексу LinkedHashMap = " + (System.currentTimeMillis() - startTS));

        startLHM = System.currentTimeMillis();
        Iterator<String> iterator = treeSet.iterator();
        for (int i = 0; i < 20000; i++) {
            iterator.next();
        }
        System.out.println("Время выполнения операции получения элемента по индексу TreeSet = " + (System.currentTimeMillis() - startLHM));
    }
}

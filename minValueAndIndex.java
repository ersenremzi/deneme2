//SORU3

import java.util.TreeMap;
public class minValueAndIndex {

    public static void main(String[] args) {
        int [] list = {49,5,8,4,3,7,6,21}; //soruda belirtilen diziyi oluşturuyoruz.

        TreeMap<Integer , Integer> sayi2 = new TreeMap<Integer, Integer>(); // bu framework eklentisi sayesinde istenilen datayı sıralı bir şekilde gösterebiliyoruz.

        for (int i = 0 ; i < list.length ; i++){ //dizi içindeki sayıları tek tek dönen döngüyü yazıyoruz.

            if (list[i] % 7 == 0){   // istenen kuralı if bloğu içine yazıyhoruz.
                sayi2.put(list[i] , i);
            }
        }

        System.out.println(" 7'ye bölümden 0 kalanını veren en küçük sayı : " +sayi2.firstEntry().getKey() + " ve onun index'i : " + sayi2.get(sayi2.firstEntry().getKey()));


    }
}

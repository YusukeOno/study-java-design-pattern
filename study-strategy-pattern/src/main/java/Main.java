import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // 線形探索のAPI
        SearchApi sequencialApi = new SearchApi(new SequencialStrategy());

        // 二分探索のAPI
        SearchApi binaryApi = new SearchApi(new BinaryStrategy());

        // 1~10,000までの乱数を生成
        int random = new Random().nextInt(10000) + 1;
        System.out.println("乱数:" + random);

        // 線形探索で検索
        Employee employee1 = sequencialApi.searchEmployee(random);
        System.out.println(employee1);

        // 改行
        System.out.println();

        // 二分探索で検索
        Employee employee2 = binaryApi.searchEmployee(random);
        System.out.println(employee2);
    }
}

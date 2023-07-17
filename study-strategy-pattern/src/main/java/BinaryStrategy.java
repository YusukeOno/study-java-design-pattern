import java.util.List;

public class BinaryStrategy implements Strategy {

    @Override
    public Employee search(List<Employee> employeesList, int id) {
        // 結果格納用
        Employee result = null;

        int left = 1; // 最小値
        int right = employeesList.size(); // 最大値
        int count = 0; // 探索回数

        // 処理前の時刻を取得
        long startTime = System.nanoTime();

        // 従業員を検索（二分探索木）
        while (left < right) {
            // 探索回数のインクリメント
            count++;

            // 中央値を計算
            int median = left + (right - left) / 2;

            // 中央値のIDと等しいかどうか
            if (median == id) {
                // 中央値が目的の値の場合、探索終了
                result = employeesList.get(median);
                break;
            } else if (id < median) {
                // 中央値よりもIDが小さかった場合
                right = median;

            } else if (median < id) {
                // 中央値よりもIDが大きかった場合
                left = median + 1;
            }
        }
        //　処理後の時刻の取得
        long endTime = System.nanoTime();

        // 処理時間を表示
        System.out.println("二分探索の処理時間:"
                + (endTime - startTime) + "ナノ秒");
        System.out.println("探索回数:" + count + "回");

        return result;
    }
}

import java.util.List;

public class SequencialStrategy implements Strategy {

    @Override
    public Employee search(List<Employee> employeeList, int id) {
        // 結果格納用
        Employee result = null;

        // 処理前の時刻を取得
        long startTime = System.nanoTime();

        // 従業員を検索（順次アクセス）
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                result = employee;
                break;
            }
        }

        // 処理後の時刻を取得
        long endTime = System.nanoTime();

        // 処理時間を表示
        System.out.println("線形探索の処理時間:"
                + (endTime - startTime) + "ナノ秒");
        return result;
    }
}

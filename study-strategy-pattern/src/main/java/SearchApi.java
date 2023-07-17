import java.util.ArrayList;
import java.util.List;

public class SearchApi {
    // 戦略
    private Strategy strategy;

    // 従業員のリスト
    private static List<Employee> employeeList = new ArrayList<>();

    // 初期化
    static {
        // 従業員を生成（10000件）
        for (int i = 0; i < 10000; i++) {
            Employee employee = new Employee(i, "user" + i);
            employeeList.add(employee);
        }
    }

    // コンストラクタ
    public SearchApi(Strategy strategy) {
        super();
        this.strategy = strategy;
    }

    // 指定されたIDで従業員を検索するメソッド
    public Employee searchEmployee(int id) {
        Employee employee = strategy.search(employeeList, id);

        return employee;
    }
}

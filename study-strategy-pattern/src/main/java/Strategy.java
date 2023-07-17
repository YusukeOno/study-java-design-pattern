import java.util.List;

public interface Strategy {

    // 従業員を検索するメソッド
    public Employee search(List<Employee> employeeList, int id);
}

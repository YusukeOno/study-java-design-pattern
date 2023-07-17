public class Employee {

    // ID
    private int id;

    // 名前
    private String name;

    // コンストラクタ
    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    // IDのgetter
    public int getId() {
        return id;
    }

    // toString
    @Override
    public String toString() {
        return "Employee [id=" + id + ",name=" + name + "]";
    }
}

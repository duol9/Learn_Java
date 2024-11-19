public class DataStore {
    private String data;

    public void setData(String data) {
        if (data.equals("a")) {
            System.out.println("a 입력하지 마세요....");
        }
        this.data = data;
    }
}

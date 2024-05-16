package learning;

public class Me {

    private static String name;
    private static int Id; 

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void getName(){
        name = "Some name";
        System.out.println(name);
    };

    public static int getId(){
        Id = 001;
        return Id;
    }

}

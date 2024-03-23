package programmerzamannow.records.data;

public record Customer(String id, String name, String email, String phone) {
    //canonical
    public Customer(String id, String name, String email, String phone){
        System.out.println("Create customer");
        this.id = id.toLowerCase();
        this.name = name;
        this.email = email != null ? email.toLowerCase():null;
        this.phone = phone != null ? phone.toLowerCase():null;
    }

    //constructor atasnya
    public Customer(String id, String name, String email){
        this(id,name,email,null);
    }

    //constructor atasnya
    public Customer(String id, String name){
        this(id,name,null);
    }

    public String sayHello(String name){
        return "Hello "+name+", my name is "+this.name;
    }

}

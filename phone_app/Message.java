public class Message {
    private String text;
    private String recipient;
    private int id;

    public Message(String text, String recipient, int id){
        this.text = text;
        this.recipient = recipient;
        this.id = id;
    }

    //Message details printing
    public void getDetails(){
        System.out.println("Contact Name: "  + recipient + 
        "\nMessag: " + text + 
        "\nID: " + id);
    }

    public String getText(){
        return this.text;
    }

    public void setText(String text){
        this.text = text;
    }

    public String getRecipient(){
        return this.recipient;
    }

    public void setRecipient(String recipient){
        this.recipient = recipient;
    }

    public int geId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }
}

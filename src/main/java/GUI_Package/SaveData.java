package GUI_Package;

public class SaveData implements java.io.Serializable {
private static final long serialVersionUID = 1l;

    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1;
    }

    private String note1;
    private String note2;
    private String note3;
    private String note4;
    private String note5;
    public boolean Strikethrough1;
    public boolean Strikethrough2;
    public boolean Strikethrough3;
    public boolean Strikethrough4;
    public boolean Strikethrough5;

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }

    public String getNote3() {
        return note3;
    }

    public void setNote3(String note3) {
        this.note3 = note3;
    }

    public String getNote4() {
        return note4;
    }

    public void setNote4(String note4) {
        this.note4 = note4;
    }

    public String getNote5() {
        return note5;
    }

    public void setNote5(String note5) {
        this.note5 = note5;
    }




}

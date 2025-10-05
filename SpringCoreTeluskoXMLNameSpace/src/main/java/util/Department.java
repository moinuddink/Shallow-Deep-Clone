package util;

public class Department {

    private Integer dpNo;

    private String dpName;

    public Department( String dpName,Integer dpNo) {
        super();
        this.dpNo = dpNo;
        this.dpName = dpName;
    }



    @Override
    public String toString() {
        return "Department{" +
                "dpNo=" + dpNo +
                ", dpName='" + dpName + '\'' +
                '}';
    }
}

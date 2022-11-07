
package modelos;

public class PruebaModel {
    
    private int idTest;
    
    private String nameTest;
    
    private String detailTest;

    public PruebaModel(int idTest, String nameTest, String detailTest) {
        this.idTest = idTest;
        this.nameTest = nameTest;
        this.detailTest = detailTest;
    }

    public int getIdTest() {
        return idTest;
    }

    public String getNameTest() {
        return nameTest;
    }

    public String getDetailTest() {
        return detailTest;
    }

    public void setIdTest(int idTest) {
        this.idTest = idTest;
    }

    public void setNameTest(String nameTest) {
        this.nameTest = nameTest;
    }

    public void setDetailTest(String detailTest) {
        this.detailTest = detailTest;
    }
    
    

}

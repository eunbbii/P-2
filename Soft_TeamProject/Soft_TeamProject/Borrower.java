
/**
 * Borrower 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Borrower
{
    private String name;
    private int id;
    public Borrower(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName(String name){
        return name;
    }
    public int getId(int id){
        return id;
    }
    public static Borrower Find(String name){
        return null;
    }
    public boolean Check(){
        return true;
    }
}

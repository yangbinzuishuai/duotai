import java.util.Random;
class FK{
    void bx(){
        System.out.println("变形");
    }
}
class FK_tzx extends FK{
    void bx(){
        System.out.println("田字形方块正在变形");
    }
}
class FK_cfx extends FK{
    void bx(){
        System.out.println("长方形方块正在变形");
    }
}
class FK_lzx extends FK{
    void bx(){
        System.out.println("L字形方块正在变形");
    }
}
class FK_szx extends FK{
    void bx(){
        System.out.println("山字形方块正在变形");
    }
}
public class DuoTai {
    public static void main(String[] args) {
        Random num=new Random();
        int a=num.nextInt(4);
        FK fk=null;
        switch (a){
            case 0:
                fk=new FK_cfx();
                break;
            case 1:
                fk=new FK_lzx();
                break;
            case 2:
                fk=new FK_szx();
                break;
            case 3:
                fk=new FK_tzx();
                break;
        }
        fk.bx();
    }
}

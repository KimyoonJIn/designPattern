import com.rosa.dp.AbstGameConnectionHelper;
import com.rosa.dp.DefaultGameConnectionHelper;

public class main {
    public static void main(String[] args){
        AbstGameConnectionHelper helper = new DefaultGameConnectionHelper();

        helper.requestConnection("아이디 비밀번호 등 개인정보 암호화 데이터");

}
}


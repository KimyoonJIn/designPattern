package com.rosa.dp;

public abstract class AbstGameConnectionHelper {

    protected abstract String doSecurity(String string);

    protected abstract boolean authentication(String id, String password);

    protected abstract int authorization(String userName);

    protected abstract String connection(String info);

    public  String requestConnection(String encodedInfo){
        //보안작압: 암호화된 문자열을 decode한다.
        String decodedInfo = doSecurity(encodedInfo);

        String id= "test1";
        String password = "testpw1";
        if (!authentication(id, password)){
            throw new Error("Invalid ID or Password");
        }

        String userName= "John";
        int i = authorization(userName);

        switch(i){
            case 0: //game manager
                System.out.println("game manager");
                break;
            case 1: //유료 회원
                System.out.println("Paid member");
                break;
            case 2: //무료 회원
                System.out.println("Unpaid member");
                break;
            case 3: //권한 없음
                System.out.println();
                break;
            default: //기타
                break;
        }
        return connection(decodedInfo);

    }
}

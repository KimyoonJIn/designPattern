package com.rosa.dp;

public class DefaultGameConnectionHelper extends AbstGameConnectionHelper{

    @Override
    protected String doSecurity(String string){
        System.out.println("decode 고도화");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password){
        System.out.println("Verified Id and Password");
        return true;

    }

    @Override
    protected int authorization(String userName){
        System.out.println("Verified authorization");
        return 0;

    }

    @Override
    protected String connection(String info){
        System.out.println("final connection step");
        return info;
    }
}
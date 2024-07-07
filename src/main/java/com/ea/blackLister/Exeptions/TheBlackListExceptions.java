package com.ea.blackLister.Exeptions;

public class TheBlackListExceptions extends Exception{
    private CustomExceptions customExceptions;
    public TheBlackListExceptions(CustomExceptions customExceptions) {
        super(customExceptions.getMsg());
        this.customExceptions=customExceptions;
    }
}

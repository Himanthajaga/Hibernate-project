package lk.ijse.culinary.bo;

import lk.ijse.culinary.bo.custom.impl.*;

public class BOFactory {

    private static BOFactory bOFactory;
    private BOFactory(){}

    public static BOFactory getInstance(){
        return (bOFactory==null)?bOFactory=new BOFactory():bOFactory;
    }

    public enum BOTypes{
       USER,ADMIN,COURSE,STUDENT
    }

    public SuperBO getBO(BOTypes boTypes){
        switch(boTypes){
            case USER:
                return new UserBOImpl();
            case ADMIN:
                return new AdminBOImpl();
            case COURSE:
                return new CourseBOImpl();
            case STUDENT:
                return new StudentBOImpl();
            default:
                return null;
        }
    }




}


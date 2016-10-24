package Controlers;

import Model.Client;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ClientControler {

    private String dbCreateInfo = "";


    public static void init() {
        Key key = new Key();
        key.setNameTable("Client");
        key.setNamePrimaryKey("id");
        ArrayList<String> infoList = new ArrayList<String>();
        infoList.add("login varchar(255),");
        infoList.add("name varchar (255), ");
        infoList.add("surName varchar (255), ");
        infoList.add("login varchar (255)");
        key.setNameRecords(infoList);
        key.build();
        System.out.println(key.getInfo());

    }
public static void main(String [ ] args){
    init();
}
}

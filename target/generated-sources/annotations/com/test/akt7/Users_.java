package com.test.akt7;

import com.test.akt7.Departments;
import com.test.akt7.Employees;
import com.test.akt7.Inventoryhelper;
import com.test.akt7.Offices;
import com.test.akt7.Transfer;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-25T21:19:37")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile CollectionAttribute<Users, Employees> employeesCollection;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile CollectionAttribute<Users, Offices> officesCollection;
    public static volatile SingularAttribute<Users, Integer> id;
    public static volatile CollectionAttribute<Users, Departments> departmentsCollection;
    public static volatile SingularAttribute<Users, String> login;
    public static volatile CollectionAttribute<Users, Transfer> transferCollection;
    public static volatile CollectionAttribute<Users, Inventoryhelper> inventoryhelperCollection;

}
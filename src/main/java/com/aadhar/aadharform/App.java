package com.aadhar.aadharform;

import java.util.List;

import com.aadhar.aadharform.dao.RegisterDao;
import com.aadhar.aadharform.dao.RegisterHqlDao;
import com.aadhar.aadharform.entity.AadharRegistration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      AadharRegistration registration = new AadharRegistration();
      /* registration.setId(1);
       registration.setAadharno(87356367283L);
       registration.setName("vishu");
       registration.setAge(21);
       registration.setPhoneno("8094219586");
       registration.setState("delhi");
       registration.setCountry("india");*/
     
     registration.setId(2);
       registration.setAadharno(8734324346L);
       registration.setName("sai");
       registration.setAge(21);
       registration.setPhoneno("709506302");
       registration.setState("telengana");
       registration.setCountry("india");
     
     RegisterDao registerdao = new RegisterDao();
    // System.out.println(registration);
     // registerdao.saveUser(registration);
      
     RegisterHqlDao hqlDao = new RegisterHqlDao();
     // List<AadharRegistration> list = hqlDao.getUsers();
    // list.forEach(user->System.out.println(user));
      
    // hqlDao.deleteUserId(2);
     
     hqlDao.updateUserDetails("7095063020", "charan", 1);
    
 
    }
}

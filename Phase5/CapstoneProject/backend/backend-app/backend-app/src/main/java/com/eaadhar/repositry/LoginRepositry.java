package com.eaadhar.repositry;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eaadhar.Login;



@Repository
public interface LoginRepositry extends JpaRepository<Login, String>{

}
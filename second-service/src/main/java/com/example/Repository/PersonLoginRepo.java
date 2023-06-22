package com.example.Repository;

import com.example.Models.PersonLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonLoginRepo extends JpaRepository<PersonLogin, Long> {


}

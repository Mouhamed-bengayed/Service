package com.example.glsib.Repository;

import com.example.glsib.Entite.Comment;
import com.example.glsib.Entite.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

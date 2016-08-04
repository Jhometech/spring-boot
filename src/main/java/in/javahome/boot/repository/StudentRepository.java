package in.javahome.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.javahome.boot.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}

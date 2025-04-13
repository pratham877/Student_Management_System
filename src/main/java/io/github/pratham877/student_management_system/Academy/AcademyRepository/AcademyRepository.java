package io.github.pratham877.student_management_system.Academy.AcademyRepository;

import io.github.pratham877.student_management_system.Academy.Academy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AcademyRepository extends JpaRepository<Academy, String> {

    @Override
    Optional<Academy> findById(String s);

    @Override
    List<Academy> findAll();

    @Override
    List<Academy> findAllById(Iterable<String> strings);
}

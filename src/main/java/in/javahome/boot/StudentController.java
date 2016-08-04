package in.javahome.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.javahome.boot.entity.Student;
import in.javahome.boot.repository.StudentRepository;

@Controller
public class StudentController {
	@Autowired
	private StudentRepository repo;
	@RequestMapping(value="/add")
	@ResponseBody
	public String addStudent(){
		Student s = new Student();
		s.setId(123);
		s.setName("Boot");
		repo.save(s);
		return "success";
	}
}

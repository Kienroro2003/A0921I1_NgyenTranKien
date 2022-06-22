package com.example.case_study.controller;

import com.example.case_study.dto.EmployeeDto;
import com.example.case_study.entity.Division;
import com.example.case_study.entity.EducationDegree;
import com.example.case_study.entity.Employee;
import com.example.case_study.entity.Position;
import com.example.case_study.service.DivisionService;
import com.example.case_study.service.EducationDegreeService;
import com.example.case_study.service.EmployeeService;
import com.example.case_study.service.PositionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DivisionService divisionService;

    @Autowired
    private PositionService positionService;

    @Autowired
    private EducationDegreeService educationDegreeService;

    private void modelSubEmployee(ModelAndView modelAndView){
        List<Position> listPosition =  positionService.findAll();
        modelAndView.addObject("positions", listPosition);
        List<Division> listDivision = divisionService.findAll();
        modelAndView.addObject("divisions", listDivision);
        List<EducationDegree> listEducationDegree = educationDegreeService.findAll();
        modelAndView.addObject("educationDegrees", listEducationDegree);
    }

    //---------------------list---------------------
    @GetMapping("/list")
    public ModelAndView getList(@RequestParam(value = "name",required = false, defaultValue = "")String name,
                                @PageableDefault(size = 5,sort = "employee_name", direction = Sort.Direction.ASC) Pageable pageable){
        return new ModelAndView("/employee/list","employees", employeeService.getList(name,pageable));
    }

    //---------------------create---------------------

    @ModelAttribute(name = "createEmployee")
    public EmployeeDto createEmployee(){
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setPosition(new Position());
        employeeDto.setDivision(new Division());
        employeeDto.setEducationDegree(new EducationDegree());
        return employeeDto;
    }

    @GetMapping("/create")
    public ModelAndView getViewCreateEmployee(){
        ModelAndView modelAndView = new ModelAndView("/employee/create");
        modelSubEmployee(modelAndView);
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView getCreateEmployee(@ModelAttribute("createEmployee") @Validated EmployeeDto employeeDto,
                                          BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView("redirect:/employee/list");
        if(bindingResult.hasFieldErrors()){
            modelSubEmployee(modelAndView);
            modelAndView.setViewName("/employee/create");
            return modelAndView;
        }
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDto,employee);
        employeeService.save(employee);
        return modelAndView;
    }

}

package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private StaffServices services;

    // handler methods go here..


    /*
    STAFF/USER CONTROLLER
     */
    //View Page for viewing staff members
    @RequestMapping("/")
    public String viewStaffPage(Model model) {
        List<Staff> listStaff = services.listAll();
        model.addAttribute("listStaff", listStaff);
        return "index";
    }

    //Allowing for A new Staff Member
    @RequestMapping("/new")
    public String showNewForm(Model model) {
        Staff staff = new Staff();
        model.addAttribute("Staff", staff);

        return "StaffReg";
    }

    //Save for new Staff
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStaff(@ModelAttribute("staff") Staff staff) {
        services.save(staff);

        return "redirect:/";
    }

    //Edit Staff Member
    @RequestMapping("/edit/{staffID}")
    public ModelAndView showEditForm(@PathVariable(name = "staffID") long StaffID) {
        ModelAndView mav = new ModelAndView("StaffEdit");
        Staff staff = services.get(StaffID);
        mav.addObject("Staff", staff);

        return mav;
    }

    /*
    It deletes record for the given id in URL and redirects to
    */
    @RequestMapping("/delete/{staffID}") //Delete Staff Member
    public String delete(@PathVariable(name = "staffID") long StaffID) {
        services.delete(StaffID);
        return "redirect:/";
    }

}

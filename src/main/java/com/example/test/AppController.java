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

        return "new_staff";
    }

    //Save for new Staff
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStaff(@ModelAttribute("Staff") Staff staff) {
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

    @Autowired
    private AnimalServices service;
    /*
    ANIMAL CONTROLLERS
     */
    //View Page for viewing staff members
    @RequestMapping("/animal_view")
    public String viewAnimalPage(Model model) {
        List<Animal> animalList = service.listAll();
        model.addAttribute("animalList", animalList);

        return "animal_view";
    }

    //Allowing for A new Animal Member
    @RequestMapping("/newanimal")
    public String showNewAnimal(Model model) {
        Animal animal = new Animal();
        model.addAttribute("Animal", animal);

        return "new_animal";
    }

    //Save for Animal Staff
    @RequestMapping(value = "/animalsave", method = RequestMethod.POST)
    public String saveAnimal(@ModelAttribute("Animal") Animal animal) {
        service.save(animal);

        return "redirect:/animal_view";
    }

    //Edit Staff Member
    @RequestMapping("/mod/{animalID}")
    public ModelAndView showAnimalEdit(@PathVariable(name = "animalID") int animalID) {
        ModelAndView rav = new ModelAndView("animalEdit");
        Animal animal = service.get(animalID);
        rav.addObject("Animal", animal);

        return rav;
    }

    /*
    It deletes record for the given animal ID in URL and redirects to
    */
    @RequestMapping("/remove/{animalID}") //Delete Staff Member
    public String deleteAnimal(@PathVariable(name = "animalID") int animalID) {
        service.delete(animalID);
        return "redirect:/animal_view";
    }
}

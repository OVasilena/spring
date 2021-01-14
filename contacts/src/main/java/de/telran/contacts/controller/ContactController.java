package de.telran.contacts.controller;

import de.telran.contacts.model.Contact;
import de.telran.contacts.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class ContactController {

    ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("contacts")
    public String getAll(Model model) {
        //List<Contact> contacts = contactService.getAll();
        List<Contact> contacts = Arrays.asList(
                new Contact(1,"Max","Arek", 20),
                new Contact(2,"Alex","Weiss", 20)

        );

        model.addAttribute("contactList", contacts);

        return "contacts";
    }

}

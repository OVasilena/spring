package de.telran.contacts.repository;

import de.telran.contacts.model.Contact;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

// TODO implement the class, eg. HashMap or ArrayList under the hoad
// And test
@Repository
public class InMemoryContactRepo implements IContactRepo {

    HashMap<Integer, Contact> source;
    // ArrayList<Contact> contactList;

    @Override
    public void save(Contact contact) {

    }

    @Override
    public Contact find(int id) {
        return null;
    }

    @Override
    public Contact remove(int id) {
        return null;
    }

    @Override
    public List<Contact> findAll() {
        return null;
    }
}

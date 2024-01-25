package ru.job4j.bank;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccounts = getAccounts(user);
            if (!userAccounts.contains(account)) {
                userAccounts.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        User user = null;
        for (User result : users.keySet()) {
            if (result.getPassport().equals(passport)) {
                user = result;
                break;
            }
        }
        return user;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account userAccount = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccounts = getAccounts(user);
            for (Account result : userAccounts) {
                if (result.getRequisite().equals(requisite)) {
                    userAccount = result;
                    break;
                }
            }
        }
        return userAccount;
    }

    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        boolean result = false;
        Account source = findByRequisite(sourcePassport, sourceRequisite);
        Account destination = findByRequisite(destinationPassport, destinationRequisite);
        if (source != null && destination != null) {
            if (source.getBalance() >= amount) {
                source.setBalance(source.getBalance() - amount);
                destination.setBalance(destination.getBalance() + amount);
                result = true;
            }
        }
        return result;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}

package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User searchResult = null;
        for (User us : users) {
            if (us.getUsername().equals(login)) {
                searchResult = us;
                break;
            }
        }
        if (searchResult == null) {
            throw new UserNotFoundException("User not found");
        }
        return searchResult;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3 || !user.isValid()) {
            throw new UserInvalidException("User is not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException userInvEx) {
            userInvEx.printStackTrace();
        } catch (UserNotFoundException userNFEx) {
            userNFEx.printStackTrace();
        }
    }
}

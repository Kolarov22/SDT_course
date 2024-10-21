package Observer;

import java.util.ArrayList;

public class SocialNetwork {
    private ArrayList<User> users;

    public SocialNetwork() {
        users = new ArrayList<>();
    }

    public void addUser(User u) {
        users.add(u);
    }

    public void subscribe(User follower, User followee) {
        followee.addFollower(follower);
    }

    public void start() {
        for (User user : users) {
            user.start();
        }
    }
}
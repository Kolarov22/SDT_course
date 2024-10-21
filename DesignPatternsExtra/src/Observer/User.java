package Observer;

import java.util.ArrayList;
import java.util.List;

public class User extends Thread implements UserI {
    private String name;
    private List<User> followers;
    private SocialNetwork socialNetwork;

    public User(String name, SocialNetwork socialNetwork) {
        this.name = name;
        this.socialNetwork = socialNetwork;
        this.followers = new ArrayList<>();
    }

    public void follow(User user) {
        user.addFollower(this);
    }

    public void addFollower(User follower) {
        followers.add(follower);
    }

    @Override
    public void update(User trigger) {
        System.out.println(this.name + " was notified that " + trigger.getUsername() + " posted the status '" + trigger.getLastStatus() + "'");
    }

    private String lastStatus;

    public String post(String message) {
        lastStatus = message;
        System.out.println(this.name + " posted the status '" + message + "'");
        notifyFollowers();
        return message;
    }

    private void notifyFollowers() {
        for (User follower : followers) {
            follower.update(this);
        }
    }

    public String getUsername() {
        return name;
    }
    public String getLastStatus() {
        return lastStatus;
    }

    @Override
    public void run() {
        // Simulate posting statuses randomly
        try {
            while (true) {
                Thread.sleep((int) (Math.random() * 10000));
                post("made omelette, looks delicious");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork();
        User alice = new User("Alice", socialNetwork);
        User bob = new User("Bob", socialNetwork);
        User charlie = new User("Charlie", socialNetwork);

        socialNetwork.addUser(alice);
        socialNetwork.addUser(bob);
        socialNetwork.addUser(charlie);

        socialNetwork.subscribe(bob, alice);
        socialNetwork.subscribe(charlie, alice);

        socialNetwork.start();
    }
}
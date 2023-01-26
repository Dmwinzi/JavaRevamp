public class NetworkImpl implements  Network{
    @Override
    public void login(String username) {
        System.out.println("Welcome back" +username);
    }

    @Override
    public void logout() {
        System.out.println("You logged out");
    }

    @Override
    public void passwordtest(String password) {
       if (password.length() < 8){
           System.out.println(Strength.LOW);
       } else if (password.length() == 8) {
           System.out.println(Strength.MEDIUM);
       } else {
           System.out.println(Strength.STRONG);
       }
    }

}

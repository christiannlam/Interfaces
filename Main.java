public class Main
{
    public static void main(String[] args) {
        SimpleName name = new SimpleName();
        name.setName("Christian Lam");
        FullNameInterface fullName = new SimpleNameToFullNameAdapter(name);
        fullName.setFirstName(name.getName());
        fullName.setLastName(name.getName());
        System.out.println(fullName.getFirstName());
        System.out.println(fullName.getLastName());
    }
}

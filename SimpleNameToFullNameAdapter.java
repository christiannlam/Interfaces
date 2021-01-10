public class SimpleNameToFullNameAdapter implements FullNameInterface{
    private SimpleName name;
    private String firstName;
    private String lastName;

    public SimpleNameToFullNameAdapter(SimpleName name)
    {
        this.name = name;
        this.firstName = name.getName().split(" ")[0];
        this.lastName = name.getName().split(" ")[1];
    }

    public void setFirstName(String f)
    {
        firstName = f.split(" ")[0];
    }

    public void setLastName(String l)
    {
        lastName = l.split(" ")[1];;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

}

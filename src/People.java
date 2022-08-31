public class People {

    private String _name;
    private int _level;
    private String _job;
    private String _skill;
    public People(String name, int level,String job,String skill){
        _name = name;
        _level = level;
        _job = job;
        _skill = skill;

    }
    public String getName()
    {
        return this._name;
    }
    public void printPeople() {
        System.out.println("name:" + this._name );
        System.out.println("level:" + this._level);
        System.out.println("job:" + this._job );
        System.out.println("skill:" + this._skill);

    }
}

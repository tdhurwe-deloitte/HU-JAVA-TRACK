class Animal_class{
    private String name;
    private String sound;
    private float height;

    public void set_name(String n)
    {
        name = n;
    }

    public void set_sound(String s) {
        sound = s;
    }

    public void set_height(float h)
    {
        height = h;
    }

    public String get_name(){
        return name;
    }
    public String get_sound(){
        return sound;
    }
    public Float get_height(){
        return height;
    }

};
public class Animal {
    public static void main(String[] args)
    {
        Animal_class obj = new Animal_class();
        obj.set_name("Dog");
        obj.set_sound("bark");
        obj.set_height(50);
        System.out.println("Name : " + obj.get_name());
        System.out.println("Sound : " + obj.get_sound());
        System.out.println("Height : " + obj.get_height());
    }
}

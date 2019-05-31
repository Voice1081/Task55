import java.lang.reflect.Field;
public class Main {
    public static void main(String[] args) throws DeserializeException {
        MyClass a = new MyClass();
        a.b = "test";
        a.c = new MyClass();
        Serializator<MyClass> s = new Serializator<>();
        s.register(new IntSerializator());
        s.register(new StringSerializator());
        s.register(new DoubleSerializator());
        byte[] serialized = s.Serialize(a);
        MyClass aCopy = s.Deserialize(serialized);
        System.out.println(aCopy);
    }
}
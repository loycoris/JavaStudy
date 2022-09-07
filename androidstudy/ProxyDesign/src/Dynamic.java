import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Dynamic {
    static Object obj;

    public Dynamic(Object obj) {
        this.obj = obj;
    }

    public static Dynamic instance = new Dynamic(obj);

    IShop create(Class service) {
        return (IShop) Proxy.newProxyInstance(service.getClassLoader(), new Class[]{service}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getDeclaringClass() == Object.class) {
                    if (method.getName().equals("buy")) {
                        System.out.println("liu is buying");
                    }
                    return method.invoke(obj, args);
                }
                if (method.getName().equals("buy")) {
                    System.out.println("liu2 is buying");
                }
                return method.invoke(obj, args);
            }
        });
    }
}

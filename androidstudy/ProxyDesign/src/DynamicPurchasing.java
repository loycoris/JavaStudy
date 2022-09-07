import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//
class DynamicPurchasing implements InvocationHandler {
    Object obj;

    public DynamicPurchasing(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(obj, args);
        if (method.getName().equals("buy")) {
            System.out.println("liu is buying");
        }
        return result;
    }
}

package Ch11_ProxyPattern.javaProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Yuan Hao on 2018/11/10 17:01
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
  private PersonBean person;
  
  NonOwnerInvocationHandler(PersonBean person) {
    this.person = person;
  }
  
  public Object invoke(Object proxy, Method method, Object[] args)
      throws IllegalAccessException {
    try {
      if (method.getName().startsWith("get")) {
        return method.invoke(person, args);
      } else if (method.getName().equals("setHotOrNotRating")) {
        return method.invoke(person, args);
      } else if (method.getName().startsWith("set")) {
        throw new IllegalAccessException();
      }
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
    return null;
  }
}

package Ch11_ProxyPattern.javaProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Yuan Hao on 2018/11/10 16:58
 */
public class OwnerInvocationHandler implements InvocationHandler {
  private PersonBean personBean;
  
  OwnerInvocationHandler(PersonBean personBean) {
    this.personBean = personBean;
  }
  
  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    try {
      if (method.getName().startsWith("get")) {
        return method.invoke(personBean, args);
      } else if (method.getName().equals("setHotOrNotRating")) {
        throw new IllegalAccessException();
      } else if (method.getName().startsWith("set")) {
        return method.invoke(personBean, args);
      }
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
    return null;
  }
}

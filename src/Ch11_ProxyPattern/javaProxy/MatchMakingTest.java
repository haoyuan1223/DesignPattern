package Ch11_ProxyPattern.javaProxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;

/**
 * Created by Yuan Hao on 2018/11/10 17:02
 */
public class MatchMakingTest {
  private HashMap<String, PersonBean> datingDB = new HashMap<>();
  
  public static void main(String[] args) {
    MatchMakingTest test = new MatchMakingTest();
    test.drive();
  }
  
  private MatchMakingTest() {
    initializeDatabase();
  }
  
  private void drive() {
    PersonBean joe = datingDB.get("Joe Javabean");
    PersonBean ownerProxy = getOwnerProxy(joe);
    System.out.println("Name is " + ownerProxy.getName());
    ownerProxy.setInterests("bowling, Go");
    System.out.println("Interests set from owner proxy");
    try {
      ownerProxy.setHotOrNotRating(10);
    } catch (Exception e) {
      System.out.println("Can't set rating from owner proxy");
    }
    System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
    
    PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
    System.out.println("Name is " + nonOwnerProxy.getName());
    try {
      nonOwnerProxy.setInterests("bowling, Go");
    } catch (Exception e) {
      System.out.println("Can't set interests from non owner proxy");
    }
    nonOwnerProxy.setHotOrNotRating(3);
    System.out.println("Rating set from non owner proxy");
    System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
  }
  
  private PersonBean getOwnerProxy(PersonBean person) {
    return (PersonBean) Proxy.newProxyInstance(
        person.getClass().getClassLoader(),
        person.getClass().getInterfaces(),
        new OwnerInvocationHandler(person));
  }
  
  private PersonBean getNonOwnerProxy(PersonBean person) {
    return (PersonBean) Proxy.newProxyInstance(
        person.getClass().getClassLoader(),
        person.getClass().getInterfaces(),
        new NonOwnerInvocationHandler(person));
  }
  
  private void initializeDatabase() {
    PersonBean joe = new PersonBeanImpl();
    joe.setName("Joe Javabean");
    joe.setInterests("cars, computers, music");
    joe.setHotOrNotRating(7);
    datingDB.put(joe.getName(), joe);
    
    PersonBean kelly = new PersonBeanImpl();
    kelly.setName("Kelly Klosure");
    kelly.setInterests("ebay, movies, music");
    kelly.setHotOrNotRating(6);
    datingDB.put(kelly.getName(), kelly);
  }
}

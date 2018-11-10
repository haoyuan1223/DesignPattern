package Ch11_ProxyPattern.javaProxy;

/**
 * Created by Yuan Hao on 2018/11/10 16:55
 */
public interface PersonBean {
  String getName();
  
  String getGender();
  
  String getInterests();
  
  int getHotOrNotRating();
  
  void setName(String name);
  
  void setGender(String gender);
  
  void setInterests(String interests);
  
  void setHotOrNotRating(int rating);
}

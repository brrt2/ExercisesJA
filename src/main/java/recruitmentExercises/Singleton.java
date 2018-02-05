package recruitmentExercises;

public class Singleton {

  private static Singleton singletonInstance = null;

  private Singleton() {}

  public Singleton getInstance () {

    if(singletonInstance == null) singletonInstance = new Singleton();
    return singletonInstance;
  }

}

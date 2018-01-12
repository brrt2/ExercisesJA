package java8mito.ReferanciasDeMetodos;

public class App {

  public static void main(String[] args) {

    App app1 = new App();
//    VPersona vp = (n,a)-> new Persona(n,a);
    VPersona vp = Persona::new;
   Persona p1 =  vp.create("ab",25);
    System.out.println(p1);

    Operate op = Persona::introduceYourself;
    op.doStuff();

    Operate op1 = p1::showNames;
    Operate op3 = p1::introduce;
    op1.doStuff();
    op3.doStuff();

  }

}

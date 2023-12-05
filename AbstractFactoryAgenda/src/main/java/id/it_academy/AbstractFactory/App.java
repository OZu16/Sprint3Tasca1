package id.it_academy.AbstractFactory;


public class App 
{
    public static void main( String[] args )
    {
        
        AgendaFactory spa = new SpainFactory();
        AgendaFactory ita = new ItaFactory();

        AgendaProducer a1 = new AgendaProducer(spa);
        AgendaProducer a2 = new AgendaProducer(ita);
        
        a1.print();
        a2.print();
    }
}

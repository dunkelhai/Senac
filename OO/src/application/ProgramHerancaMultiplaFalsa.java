package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class ProgramHerancaMultiplaFalsa {
    public static void main(String[] args) {
        ConcretePrinter p = new ConcretePrinter("1234");
        p.print("teste");
        p.processDoc("teste2");

        ConcreteScanner s = new ConcreteScanner("456");
        s.processDoc("teste3");
        System.out.println(s.scan());

        ComboDevice c = new ComboDevice("789");
        c.print("teste5");
        c.processDoc("teste6");
        System.out.println(c.scan());
    }
}

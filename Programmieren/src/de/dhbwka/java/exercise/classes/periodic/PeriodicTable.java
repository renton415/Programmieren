package de.dhbwka.java.exercise.classes.periodic;
public class PeriodicTable {
    Element[] elements = new Element[119];

    public PeriodicTable() {}

    public void addElement(Element e){
        if (!hasElement(e.getOrdinal())) {
            elements[e.getOrdinal()] = e;
        }
    }
    public boolean hasElement(int o) {
        return elements[o] != null;
    }
    public Element getElement(int o) {
        return elements[o];
    }
    public Element[] getMetals() {
        int countMetals = 0;
        for (int i = 0;i<elements.length;i++) {
            if (elements[i] instanceof Metal){
                countMetals++;
            }
        }
        Element[] metals = new Metal[countMetals];
        int counter = 0;
        for (int i = 0;i<elements.length;i++) {
            if (elements[i] != null && elements[i] instanceof Metal){
                metals[counter] = (Metal)elements[i];
                counter++;
            }
        }
        return metals;
    }

    public static void main (String[] args) {
        PeriodicTable periodicTable = new PeriodicTable();
        periodicTable.addElement(new Element("Wasserstoff", "H", 1, "K", 3, true));
        periodicTable.addElement(new Element("Helium", "He", 2, "K", 3, true));
        periodicTable.addElement(new Metal("Natrium", "Na", 11, "M", 1, true, false, 2.1E7));
        periodicTable.addElement(new Metal("Eisen", "Fe", 26, "N", 1, false, false, 1.002E7));
        periodicTable.addElement(new Metal("Germanium", "Ge", 32, "N", 1, false, true, 1.45));
        periodicTable.addElement(new Element("Brom", "Br", 35, "N", 2, true));
        periodicTable.addElement(new Metal("Tellur", "Te", 52, "O", 1, true, true, 0.005));
        periodicTable.addElement(new Metal("Gold", "Au", 79, "P", 1, false, false, 4.4E7));

        System.out.println("Alle Elemente:");
        for (int i = 0; i<119; i++) {
            if (periodicTable.hasElement(i)) {
                System.out.println(periodicTable.getElement(i));
            }
        }
        System.out.println("Metalle:");
        
        
        for (Element e : periodicTable.getMetals()) {
            System.out.println(e);
        }

        System.out.println("Element mit Ordnungszahl 79:");
        System.out.println(periodicTable.getElement(79));
    }

}

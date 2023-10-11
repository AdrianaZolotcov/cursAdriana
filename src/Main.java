import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//primul program
       /* Masina mercedes = new Masina();
        System.out.println("******************");
        System.out.println("PRIMUL PROGRAM:" + "\n");
        System.out.println("Marca este: " + mercedes.marca);
        System.out.println("Modelul  este: " + mercedes.model);
        System.out.println("Cai putere este: " + mercedes.getCaiPutere() + "\n");

        Masina BMW = new Masina("X5");
        System.out.println("marca pentru obiectul 2 este: " + BMW.marca);
        System.out.println("modelul pentru obiectul 2 este: " + BMW.model);
        System.out.println("cai putere pentru obiectul 2 este: " + BMW.getCaiPutere() + "\n");

        Masina Kia = new Masina("kia", "rio", 160);
        System.out.println("marca pentru obiectul 3 este: " + Kia.marca);
        System.out.println("modelul pentru obiectul 3 este: " + Kia.model);
        System.out.println("cai putere pentru obiectul 3 este: " + Kia.getCaiPutere() + "\n");

        //programul 2
        Queue list = new Queue();
        list.addValueToQueue("lamaie");
        list.addValueToQueue("lime");

        System.out.println("******************");
        System.out.println("AL DOILEA PROGRAM" + "\n");
        System.out.println("lista este:" + list.queue);

        list.addValueToSpecificPos("portocala", 2);
        System.out.println("lista noua este" + list.queue);

        list.removeFirst();
        System.out.println("lista cu 1 intex sters este:" + list.queue);

        list.removeGivenIndex(3);
        System.out.println("lista fara valoarea 3 este:" + list.queue);

        list.switchValues(1, 2);
        System.out.println("lista dupa schimvarea a 2 valori cu locul este:" + list.queue);
        //programul bonus

        System.out.println("******************");
        System.out.println("PROGRAMMUL BONUS" + "\n");
        LinkedQueue legume = new LinkedQueue(7);
        System.out.println("lista 2 este:" + legume.linkedList);

        legume.push("varza");
        legume.push("morcov");
        legume.push("ceapa");

        System.out.println("lista dupa push:" + legume.linkedList);

        legume.pop();
        System.out.println("lista dupa pop:" + legume.linkedList);
        System.out.println("lista dupa scoaterea ultimului:" + legume.getLast());

        LinkedQueue nuci = new LinkedQueue();
        nuci.push("nuca");
        nuci.push("arahide");
        nuci.push("caju");

        System.out.println("lista cu 3 elemengte adause ste:" + nuci.linkedList);
        System.out.println("ultimul element so scos :" + nuci.getLast());


        Data date = new Data(28, 2, 2023);
        System.out.println("PROGRAMUL ÎNTĂI");
        System.out.println("Data inițială: " + date);

        // Operatorul de adăugare
        Data newDate = date.add(10);
        System.out.println("Data după adăugarea a 10 zile: " + newDate);

        // Operatorul de scădere
        newDate = date.subtract(5);
        System.out.println("Data după scăderea a 5 zile: " + newDate);

        // Operatorul de incrementare și decrementare prefixat și postfixat
        Data originalDate = new Data(31, 12, 2022);
        System.out.println("Data inițială: " + originalDate);

        Data incrementedDate1 = originalDate.incrementPrefix();
        System.out.println("Data după incrementare prefixată: " + incrementedDate1);

        Data incrementedDate2 = originalDate.incrementPostfix();
        System.out.println("Data după incrementare postfixată: " + incrementedDate2);

        Data decrementedDate1 = originalDate.decrementPrefix();
        System.out.println("Data după decrementare prefixată: " + decrementedDate1);

        Data decrementedDate2 = originalDate.decrementPostfix();
        System.out.println("Data după decrementare postfixată: " + decrementedDate2);

        System.out.println("date este:" + date.toString());//ppentru verificare

        Data data2 = new Data( 30, 11, 2023);
        date.add(data2);
        System.out.println("Suma a doua date este:" + date.toString() +"\n");

        System.out.println("PROGRAMUL AL DOILEA");

        Fractie fractie1 = new Fractie(1, 2);
        Fractie fractie2 = new Fractie(3, 4);

        Fractie suma = fractie1.aduna(fractie2);
        Fractie diferenta = fractie1.scade(fractie2);
        Fractie produs = fractie1.inmulteste(fractie2);
        Fractie impartire = fractie1.imparte(fractie2);

        System.out.println("Suma: " + suma);
        System.out.println("Diferenta: " + diferenta);
        System.out.println("Produs: " + produs);
        System.out.println("Impartire: " + impartire +"\n");

        System.out.println("PROGRAM BONUL");
        StringManipulator strManipulator = new StringManipulator("You decide what to do!");

        // Eliminarea caracterului 'a' din șir
        StringManipulator result = strManipulator.subtract('a');

        System.out.println("Original Text: " + strManipulator.getText());
        System.out.println("Result Text: " + result.getText());
   */
        Colaborator colaborator1 = new Colaborator();
        colaborator1.citesteDate();

        Colaborator colaborator2 = new Colaborator(colaborator1);
        Colaborator colaborator3 = new Colaborator();
        colaborator3 = colaborator1;

        System.out.println("\nDetalii despre colaboratorul 1:");
        colaborator1.afiseazaDate();

        System.out.println("\nDetalii despre colaboratorul 2 (clonat):");
        colaborator2.afiseazaDate();

        System.out.println("\nDetalii despre colaboratorul 3 (atribuit):");
        colaborator3.afiseazaDate();

        System.out.println("************" + "\n");


        Scanner scanner = new Scanner(System.in);

        CosCumparaturi cosCumparaturi = new CosCumparaturi();

        // Adaugare produse in cos
        cosCumparaturi.adaugaProdus(new ProdusElectronic("Laptop", 2000, "Dell"));
        cosCumparaturi.adaugaProdus(new Haina("Bluza", 100, "M"));
        cosCumparaturi.adaugaProdus(new Alimente("Ciocolata", 5, "01/12/2023"));

        Produs produse = new Produs();
        produse.addNewProdus(new ProdusElectronic("Laptop", 2000, "Dell"));
        produse.addNewProdus(new ProdusElectronic("Masina", 200, "BMW"));
        produse.afisare();


        // Afisare cos de cumparaturi
        cosCumparaturi.afiseazaCos();

        // Calculare total
        double total = cosCumparaturi.calculeazaTotal();
        System.out.println("Total de plata: " + total + " RON");
        Client clien = new Client();
        Client vasile = new Client("Vasile", "straseni", "vasilica@gmail.com");
        clien.addNewClent(vasile);
        clien.addNewClent(new Client("Ion", "straseni", "ion@gmail.com"));
        clien.addNewClent(new Client("Maria", "straseni", "maria@gmail.com"));
        clien.addNewClent(new Client("Ana", "straseni", "ana@gmail.com"));
        clien.addNewClent(new Client("Irina", "straseni", "irina@gmail.com"));

        clien.afisareClienti();
        cosCumparaturi.adaugaProdusPerClient(new ProdusElectronic("banana", 10, "bbb"),vasile,clien);
        cosCumparaturi.afiseazaCos();

    }


}








    


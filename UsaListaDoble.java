public class UsaListaDoble
{
    public static void Main(String[] args)
    {
        ListaDoble lista = new ListaDoble();
        lista.insertaPrimerNodo("R");
        lista.imprimir();
        lista.insertaPrimerNodo("F");
        lista.imprimir();
        System.out.println(lista);
        lista.insertaAntesPrimerNodo("H");
        System.out.println(lista);
        lista.insertaAlFinal("Z");
        System.out.println(lista);
        lista.insertaAntesPrimerNodo("K");
        System.out.println(lista);
        lista.insertaAntesPrimerNodo("Ñ ");
        System.out.println(lista);
    }
}
/**
 * Clase para comprobar que el programa funciona correctamente
 */
public class Test
{
    /**
     * Test para comprobar el funcionamiento correcto de los métodos
     * checkIndex, validIndex, listFile y removeFile.
     */
   public void test1()
   {
       MusicOrganizer organizador = new MusicOrganizer();
       
       System.out.println("##Comprobación de que no hay elementos en la lista##");
       organizador.checkIndex(0);
       
       System.out.println("##Comprueba valores correctos en la lista##"); 
       System.out.println("(Se añaden dos elementos nuevos a la lista y se comprueban sin mostrar nada por pantalla)");
       organizador.addFile("canción1.mp3");
       organizador.addFile("canción2.mp3");
       organizador.checkIndex(0);
       organizador.checkIndex(1);
       
       System.out.println("##Comprueba valores incorrectos de la lista ##");
       organizador.checkIndex(2);
       
       System.out.println("##Comprobación de que muestra elementos de la lista##");
       organizador.listFile(0);
       organizador.listFile(1);
       
       System.out.println("##Eliminación un elemento de la lista##");
       organizador.removeFile(0);
       System.out.println("(El segundo elemento de la lista pasa a ser el primero)");
       organizador.listFile(0);
   }
}

public class Main {
    public static void main(String[] args) {
        // Crear y usar un zapato especial a través del adaptador
        zapatos zapatoEspecial = new zapatoEspecialAdapter();
        zapatoEspecial.hacerMolde();
        zapatoEspecial.fabricarMolde();
        
        System.out.println("------------------------------------------------");
        
        // Crear y usar un zapato clásico
        zapatos zapatoClasico = new zapatoClasico();
        zapatoClasico.hacerMolde();
        zapatoClasico.fabricarMolde();
        
        System.out.println("------------------------------------------------");
        
        // Crear y usar un zapato deportivo
        zapatos zapatoDeportivo = new zapatosDeportivos();
        zapatoDeportivo.hacerMolde();
        zapatoDeportivo.fabricarMolde();
    }
}

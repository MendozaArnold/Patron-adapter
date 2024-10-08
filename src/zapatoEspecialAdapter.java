public class zapatoEspecialAdapter extends zapatos {
    private final zapatoEspecial zapatoEspecial;

    public zapatoEspecialAdapter() {
        System.out.println("Zapato adaptador especial creado");
        this.zapatoEspecial = new zapatoEspecial();
    }

    @Override
    public void hacerMolde() {
        System.out.println("Molde para zapato especial creado");
        zapatoEspecial.crearLogo(); // Llama al método para crear logo
    }

    @Override
    public void fabricarMolde() {
        System.out.println("Molde de zapato especial fabricado");
    }
}

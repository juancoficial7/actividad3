
package ejerciciores_10;


public class PagoEstudiante implements InterfazEjercicio10 {
    double NI; //Número de inscripción.
    String NOM; //Nombre
    String APE; //Apellidos
    int PAT; //Patrimonio
    int EST; //Estrato social

    public PagoEstudiante( int PAT, int EST) {
        this.PAT = PAT;
        this.EST = EST;
    }
    
    @Override
    public int PagoMatricula(int PAT, int EST) {
    int PAGMAT = 50000;

    if (PAT > 2000000 && EST > 3) {
        PAGMAT = (int) (PAGMAT + (0.03 * PAT));
    }

    return PAGMAT;
    }
}

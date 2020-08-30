package builder;

public interface Builder {
	void setTipo(Tipo tipo);
    void setAssentos(int assentos);
    void setMotor(Motor motor);
    void setTransmissao(Transmissao transmissao);
    void setComputadorDeBordo(ComputadorDeBordo computadorDeBordo);
    void setNavegadorGps(NavegadorGPS navegadorGPS);
}

package builder;

public class NavegadorGPS {
	private String rota;

    public NavegadorGPS() {
        this.rota = "Av. Pres. Vargas, 2560 - Cidade Nova, Rio de Janeiro - RJ, 20210-031";
    }

    public NavegadorGPS(String rotaManual) {
        this.rota = rotaManual;
    }

    public String getRota() {
        return rota;
    }
}

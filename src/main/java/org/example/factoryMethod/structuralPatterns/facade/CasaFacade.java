package org.example.factoryMethod.structuralPatterns.facade;

public class CasaFacade {
    private SistemaDeIluminacion iluminacion;
    private SistemaDeClimatizacion climatizacion;
    private SistemaDeSeguridad seguridad;
    private SistemaDeEntretenimiento entretenimiento;

    public CasaFacade() {
        this.iluminacion = new SistemaDeIluminacion();
        this.climatizacion = new SistemaDeClimatizacion();
        this.seguridad = new SistemaDeSeguridad();
        this.entretenimiento = new SistemaDeEntretenimiento();
    }

    public void modoNoche(){
        iluminacion.apagarLuces();
        climatizacion.encenderAire();
        seguridad.activarSistema();
        entretenimiento.apagarTv();
        System.out.println("Modo noche onnn");
    }

    public void modoDia(){
        iluminacion.encenderLuces();
        climatizacion.apagarAire();
        seguridad.desactivarSistema();
        entretenimiento.encenderTv();
        System.out.println("Modo día onnn");
    }
}

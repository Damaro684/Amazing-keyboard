public class Switch {
    private int pulsaciones;
    private String tipoSwitch;
    
    public Switch(String switchTeclado){
        pulsaciones = 0;
        tipoSwitch = switchTeclado;        
    }
    
    public void setPulsaciones(){
        pulsaciones++;
    }
    
    public String getSwith(){
        return tipoSwitch;
    }
}

public class Gold extends State{
    public Gold(Customer C){
        C.setStatus("GOLD");
    }
    
    @Override
    public void UpdateStatus(Customer C){
        if(C.getPoints() >= 1000){
            C.setState(new Gold(C));
        } else if (C.getPoints() >= 0 && C.getPoints() < 1000){
            C.setState(new Silver(C));
        }
    }
}
package fileIOvol2;

interface Service{
    void loginWithYoutube();
}

class ServiceImp implements Service{
    @Override
    public void loginWithYoutube() {
        System.out.println("Login successfully");
    }
    void get(){

    }
}

public class Test1 {
    public static void main(String[] args) {
        Service service = new ServiceImp();
        service.loginWithYoutube();
    }
}

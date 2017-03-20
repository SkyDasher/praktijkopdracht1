package PaneelGen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

/**
 * Created by KevinPC on 12/03/2017.
 */
class PaneelImplTest {
    @Test
    void storePaneel() {
        System.out.println("Begin test");
        Request request = new Request();

        request.setId(BigInteger.valueOf(100));
        request.setName("Paneel");
        request.setCost(BigInteger.valueOf(5000));
        request.setStoredate(2017-12-12);

        PaneelImpl paneel = new PaneelImpl();
        try{
            paneel.storePaneel(request);
            System.out.println("test succeed");
        }catch (Error_Exception e){
            System.out.println("error in test");
        }
    }

}
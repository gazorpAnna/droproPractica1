import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ThreadMain {

    public void leerSerie (InputStream in)
    {
        byte[] buffer = new byte[1024];
        int len = -1;
        try
        {
            while ( ( len = in.read(buffer)) > -1 )
            {
                System.out.print(new String(buffer,0,len));
            }
        }
        catch ( IOException e )
        {
            e.printStackTrace();
        }
    }

    public void escribirSerie (OutputStream out)
    {
        try
        {
            int c = 0;
            while ( ( c = System.in.read()) > -1 )
            {
                out.write(c);
            }
        }
        catch ( IOException e )
        {
            e.printStackTrace();
        }
    }


}

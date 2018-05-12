import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
//credit by ferico
public class Main {
    public static void main(String[] args) throws IOException {
        Reader inputan = new InputStreamReader(System.in);
        System.out.println("Masukkan kalimat:");

        char[] kata = new char[100];
        int i=0;
        for(i = 0;i<kata.length;i++){
            kata[i] = (char) inputan.read();
            if (kata[i] == '\n') {
                break;
            }
        }
        System.out.println("Kalimat baru:");
        for (int j=0;j<i;j++){
            if (kata[j] == 'a' || kata[j] == 'u' || kata[j] == 'o' || kata[j] == 'e') {
                kata[j] = 'i';
                System.out.print(kata[j]);
            }
            else{
                System.out.print(kata[j]);
            }
        }

    }
}

package mainpack;
import java.io.*;
import soundrecorder.*;
import java.util.ArrayList;
import soundrecorder.JavaSoundRecorder;
import WaveToText.Converter;
import com.google.api.translate.Language;
import com.google.api.translate.Translator;
import WaveToText.Converter;;
public class Translation {
    private static String s1;

	public static void main(String[] args) throws FileNotFoundException, IOException {                
		final JavaSoundRecorder recorder = new JavaSoundRecorder();
        Thread stopper = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(JavaSoundRecorder.RECORD_TIME);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                recorder.finish();
            }
        });
 
        stopper.start();
 
        // start recording
        recorder.start();

		Converter Exc = new Converter();
	    Exc.ConvertToTxt();
    	FileReader in;
    	try{
			in = new FileReader("C:\\Users\\Abhay Gill\\Desktop\\file\\Notes.txt");
	
    	BufferedReader br=new BufferedReader(in);
   
			  s1=br.readLine();
		}
    	catch (Exception e) {
		
			e.printStackTrace();
		}
    	
        Translator translator = new Translator();
        System.out.println(translator.translate(s1));
        System.out.println();

            /*// Translate a single English String to various different languages
        System.out.println("Saying goodbye in different languages:");
        ArrayList<String> translations = translator.translate("goodbye", Language.ENGLISH, Language.ITALIAN, Language.DUTCH, Language.CHINESE_TRADITIONAL);
        for (String translation : translations) {
                System.out.println(translation);
        }

        System.out.println();

        // Translate multiple strings from one language to another
       System.out.println("Saying goodbye and hello in French:");
        translations = translator.translate(Language.ENGLISH, Language.FRENCH, "goodbye", "hello");
        for (String translation : translations) {
                System.out.println(translation);
        }*/
    }
}


package gson_test;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

public class Gson_test {

	private String text;






	public Gson_test() {
		
		Spremanje s = new Spremanje();
		
		procitajSDiska();
		System.out.println("Gotovo!");
		spremiNaDisk();
		
		System.out.println(s.getText());
		
	}
	
	public static void main(String[] args) {
		new Gson_test();
	}
	
	
	
	
	
	
	
	private void procitajSDiska() {
		Gson g = new Gson();
		Type dataType = (new TypeToken<Spremanje>()
		{
		}).getType();

		try {
			Spremanje s = g.fromJson(Files.readString(Path.of("bezvezni_podaci.json")), dataType);
			this.text=s.getText();
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	private void spremiNaDisk() {
		Spremanje s = new Spremanje();
		s.setText("Type this into json file");
		
		ExclusionStrategy strategija = new ExclusionStrategy(){
            @Override
            public boolean shouldSkipField(FieldAttributes fa) {
                if(true){
                    return false;
                }
                return true;
            }

            @Override
            public boolean shouldSkipClass(Class<?> type) {
                return false;
            }
            
        };
        
        
        Gson gson = new GsonBuilder()
                .setExclusionStrategies(strategija)
                .setPrettyPrinting()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                .create();
		
		try {
			FileWriter fw = new FileWriter("bezvezni_podaci.json");
			fw.write(gson.toJson(s));
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
 
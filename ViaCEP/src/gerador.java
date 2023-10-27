import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import models.endereco;

public class gerador {
    public void salvarJson(endereco endereco) throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter texto = new FileWriter(endereco.cep() + ".json");
        texto.write(gson.toJson(endereco));
        texto.close();
    }
}

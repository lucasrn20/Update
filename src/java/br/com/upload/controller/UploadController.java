package br.com.upload.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.event.FileUploadEvent;

@ManagedBean(name="uploadMB")
@RequestScoped
public class UploadController implements Serializable{
    
    private String arquivo;

    public UploadController() {
        arquivo = new String();
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
    
    public void upload(FileUploadEvent fileUploadEvent) { 
        byte[] contents = fileUploadEvent.getFile().getContents();
        String dados = new String(contents);
        arquivo = dados;
   }
}

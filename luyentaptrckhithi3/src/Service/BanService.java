/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Ban;
import Repostiory.BanRepostiory;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BanService {
    private BanRepostiory br ;

    public BanService() {
        this.br = new BanRepostiory();
    }
    public ArrayList<Ban> getlist(){
        return  this.br.all();
    }
    public void insert(Ban b){
        this.br.insert(b);
    }
    public void update(String ma , Ban b){
        this.br.update(ma, b);
    }
    public ArrayList<Ban> sreach(String ma){
        return this.br.srech(ma);
    }
   
}

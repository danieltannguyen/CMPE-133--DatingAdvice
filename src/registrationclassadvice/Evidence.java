/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationclassadvice;

import java.util.ArrayList;

/**
 *
 * @author hen
 */
public class Evidence {
    public Poster poster;
    public String post;
    public ArrayList<Evidence> replies = new ArrayList<>();
    
    public Evidence(Poster poster, String post) {
        this.poster = poster;
        this.post = post;
    }
}

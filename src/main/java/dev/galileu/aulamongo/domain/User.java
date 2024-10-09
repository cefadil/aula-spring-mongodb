package dev.galileu.aulamongo.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user") //se o parametro collection não for informado, o nome da coleção será o nome da classe em minúsculo
public class User {
    @Id
    private String id;
    private String name;
    private String email;

    @DBRef(lazy = true)
    private List<Post> posts = new ArrayList<>();


    
    public User() {}
    
    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;   
        this.email = email; 
    }
    
    public String getId() {return id;}
    
    public String getName() {return name;}
    
    public String getEmail() {return email;}
    
    public void setId(String id) {this.id = id;}
    
    public void setName(String name) {this.name = name;}
    
    public void setEmail(String email) {this.email = email;}
    
    public List<Post> getPosts() {return posts;}

    public void setPosts(List<Post> posts) { this.posts = posts;}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }   

}

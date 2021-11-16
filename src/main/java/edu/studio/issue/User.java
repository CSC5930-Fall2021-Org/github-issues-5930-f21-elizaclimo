package edu.studio.issue;

public class User implements Comparable<User>{
    
    private String login; //the user’s GitHub username
    private long id; //the user’s GitHub internal id
    
    public User() {}
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
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
        if (id != other.id)
            return false;
        return true;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    @Override
    public int compareTo(User other) {
        // TODO Auto-generated method stub
        //based on id 
        //comparing this and other by id 
        if( this.id > other.id) {
            return 1;
        }
        else if(this.id < other.id) {
            return -1;
        }
        return 0;
    }
    
}

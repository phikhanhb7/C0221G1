package models;

public class CinemaTicket {
    private String id ;
    private String nameFilm ;

    public CinemaTicket(String id, String nameFilm) {
        this.id = id;
        this.nameFilm = nameFilm;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    @Override
    public String toString() {
        return "CinemaTicket{" +
                "id='" + id + '\'' +
                ", nameFilm='" + nameFilm + '\'' +
                '}';
    }

    public String styleWrite(){
        return id + "," + nameFilm ;
    }
}

package Model;

/**
 * Created by hitesh on 12/02/18.
 */

public class ListItem {


    private String name;
    private String description;
    private String rating;

    public ListItem(String name, String description, String rating){
        this.rating = rating;
        this.name = name;
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public ListItem() {
    }


}

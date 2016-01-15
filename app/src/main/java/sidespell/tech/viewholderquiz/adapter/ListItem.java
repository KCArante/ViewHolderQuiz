package sidespell.tech.viewholderquiz.adapter;

/**
 * Created by SARJ on 1/14/2016.
 */
public class ListItem {

    private String itemTitle;
    private String genre;

    public String getGenre(){
        return genre;
    }
    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }

    public ListItem(String title){
        this.itemTitle = title;
       // this.genre = genre;
    }

    public ListItem(String title, String genre){
        this.itemTitle = title;
        this.genre = genre;
    }

}

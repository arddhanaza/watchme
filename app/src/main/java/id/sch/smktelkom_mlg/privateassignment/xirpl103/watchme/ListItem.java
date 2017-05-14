package id.sch.smktelkom_mlg.privateassignment.xirpl103.watchme;

/**
 * Created by Arddhana Zhafran on 5/14/2017.
 */

public class ListItem {

    private String judul;
    private String desc;
    private String imageUrl;

    public ListItem(String judul, String desc, String imageUrl) {
        this.judul = judul;
        this.desc = desc;
        this.imageUrl = imageUrl;
    }

    public String getJudul() {
        return judul;
    }

    public String getDesc() {
        return desc;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}




import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Customers customers;
    Artwork artwork;
    Gallery gallery;
    Artist artist;
    ArrayList<Artwork> stock;

    @BeforeEach

    public void setUp(){
        customers = new Customers("John", 100);
        artist = new Artist( "van gough");
        artwork = new Artwork("Sunflowers",50, artist);
//        stock.add(artwork);
        gallery = new Gallery("Herbert",0, stock);


    }

    @Test
    public void checkGetGalleryName(){
        assertThat(gallery.getName()).isEqualTo("Herbert");

    }


    @Test
    public void checkGetTill(){
        assertThat(gallery.getTill()).isEqualTo(0);


    }


    @Test
    public void checkSetTill(){
         gallery.setTill(5);
        assertThat(gallery.getTill()).isEqualTo(5);

    }

 



}

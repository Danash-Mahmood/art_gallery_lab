import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Customers customers;
    Artwork artwork;
    Gallery gallery;
    Artist artist;
    Artwork artwork2;
    Artist artist2;


    @BeforeEach

    public void setUp(){
        customers = new Customers("John", 100);
        artist = new Artist( "van gough");
        artwork = new Artwork("Sunflowers",80, artist);
        artist2 = new Artist("Vermeer");
        artwork2 = new Artwork("Girl with pearl",3,artist2);

        gallery = new Gallery("Herbert");
        gallery.addToStock(artwork);
        gallery.addToStock(artwork2);


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

    @Test

    public void checkPurchaseArtwork(){

        gallery.purchaseArtwork("Sunflowers",customers);
        assertThat(customers.getMoney()).isEqualTo(20);
        assertThat(gallery.getTill()).isEqualTo(80);

    }

    @Test

    public void checkStockTake(){



        assertThat(gallery.stockTake()).isEqualTo(83);

    }

 



}

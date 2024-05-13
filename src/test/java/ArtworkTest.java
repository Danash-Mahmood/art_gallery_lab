import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork painting;
    Artist artist;

    @BeforeEach

    public void setUp(){
        artist = new Artist("Da Vinci");
        painting = new Artwork("Mona Lisa",1000, artist);
    }

    @Test

    public void checkGetTitle(){
        assertThat(painting.getTitle()).isEqualTo("Mona Lisa");
    }

    @Test

    public void checkSetTitle(){
        painting.setTitle("The Starry Night");
        assertThat(painting.getTitle()).isEqualTo("The Starry Night");
    }

    @Test

    public void checkGetArtist(){
        assertThat(painting.getArtist()).isEqualTo(artist.getName());

    }

    @Test

    public void checkGetPrice(){
        assertThat(painting.getPrice()).isEqualTo(1000);
    }

    @Test

    public void checkSetPrice(){
        painting.setPrice(900);
        assertThat(painting.getPrice()).isEqualTo(900);
    }

















}

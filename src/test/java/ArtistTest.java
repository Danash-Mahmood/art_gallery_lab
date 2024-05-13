import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    Artist artist;

    @BeforeEach
    public void setuo () {
        artist = new Artist("George");


    }

    @Test

    public void checkGetName () {
        assertThat("George").isEqualTo(artist.getName());

    }

}

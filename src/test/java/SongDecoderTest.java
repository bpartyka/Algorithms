import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SongDecoderTest {


    @Test
    public void shouldFindABC() {
        assertEquals("ABC", SongDecoder.solution("WUBWUBABCWUB"));
    }
}


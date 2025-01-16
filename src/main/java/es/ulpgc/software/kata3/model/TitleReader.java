package es.ulpgc.software.kata3.model;

import java.io.IOException;
import java.util.List;

public interface TitleReader {
    List<Title> load() throws IOException;
}

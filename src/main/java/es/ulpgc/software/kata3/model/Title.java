package es.ulpgc.software.kata3.model;

public record Title(String tconst,
                    String titleType,
                    String primaryTitle,
                    String originalTitle,
                    int isAdult,
                    int startYear,
                    String endYear,
                    int runtimeMinutes) {
}

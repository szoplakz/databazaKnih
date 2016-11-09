package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

class Tag {

    private int id;
    private boolean stav;//1-overeny, 0-neovereny
    private String name;
    private List<Book> booksWithTag;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the booksWithTag
     */
    public List<Book> getBooksWithTag() {
        return booksWithTag;
    }

    /**
     * @param booksWithTag the booksWithTag to set
     */
    public void setBooksWithTag(List<Book> booksWithTag) {
        this.booksWithTag = booksWithTag;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the stav
     */
    public boolean isStav() {
        return stav;
    }

    /**
     * @param stav the stav to set
     */
    public void setStav(boolean stav) {
        this.stav = stav;
    }
}

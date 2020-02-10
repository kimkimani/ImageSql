package tips.admin.tipsscore.imagesql;

public class Product {
    private String image;
    private String name;
    private String gaols;
    private String assits;
    private String cleansheet;
    private String rating;
    private String stats;

    private String yellow;
    private String red;
    private String club;
    private String position;
    private String match;
    private String price;
    private String narration;
    private String gameweek;

    public Product() {

    }



    public Product(String gameweek ,String narration ,String match ,String price ,String image ,String club , String position, String name , String gaols , String assits , String cleansheet , String rating , String stats , String yellow , String red) {
        this.image=image;
        this.name=name;
        this.gaols=gaols;
        this.assits=assits;
        this.cleansheet=cleansheet;
        this.rating=rating;
        this.stats=stats;
        this.club=club;
        this.position=position;
        this.yellow=yellow;
        this.red=red;

        this.gameweek=gameweek;
        this.narration=narration;
        this.match=match;
        this.price=price;


    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match=match;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price=price;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration=narration;
    }

    public String getGameweek() {
        return gameweek;
    }

    public void setGameweek(String gameweek) {
        this.gameweek=gameweek;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getGaols() {
        return gaols;
    }

    public void setGaols(String gaols) {
        this.gaols=gaols;
    }

    public String getAssits() {
        return assits;
    }

    public void setAssits(String assits) {
        this.assits=assits;
    }

    public String getCleansheet() {
        return cleansheet;
    }

    public void setCleansheet(String cleansheet) {
        this.cleansheet=cleansheet;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating=rating;
    }

    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats=stats;
    }

    public String getYellow() {
        return yellow;
    }

    public void setYellow(String yellow) {
        this.yellow=yellow;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red=red;
    }
    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club=club;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position=position;
    }
}


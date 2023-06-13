package AimsProject.hust.soict.dsai.test.store;
import AimsProject.hust.soict.dsai.aims.media.DigitalVideoDisc;
import AimsProject.hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        store.addDVD();

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        store.addDVD();
        store.displayStore();
        store.removeMedia(dvd1);
        store.displayStore();
    }
}
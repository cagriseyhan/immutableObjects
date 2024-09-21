import java.util.ArrayList;
import java.util.List;

/**
 * ImmutableReferanceField
 */
public final class ImmutableReferanceField {
private final List<String> items;

    public ImmutableReferanceField(List<String> items) {
        this.items = new ArrayList<>(items);
    }

    public List<String> getItems() {
        return new ArrayList<>(items);
    }
    
}
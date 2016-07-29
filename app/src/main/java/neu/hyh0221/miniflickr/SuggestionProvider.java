package neu.hyh0221.miniflickr;

import android.content.SearchRecentSuggestionsProvider;
import android.provider.SearchRecentSuggestions;

/**
 * Created by hyh0221 on 7/26/16.
 */
public class SuggestionProvider extends SearchRecentSuggestionsProvider {

    // part of content uri which is defined in AndroidManifest.xml
    public static final String AUTHORITY = "neu.hyh0221.miniflickr" + ".SuggestionProvider";

    // suggestion mode which gives recent queries
    public static final int MODE = DATABASE_MODE_QUERIES;

    public SuggestionProvider() {
        setupSuggestions(AUTHORITY, MODE);
    }
}

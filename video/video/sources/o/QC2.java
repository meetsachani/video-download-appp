package o;

import android.content.UriMatcher;
import android.net.Uri;

/* loaded from: classes.dex */
public class QC2 {
    public static /* synthetic */ boolean a(UriMatcher uriMatcher, Uri uri) {
        if (uriMatcher.match(uri) != -1) {
            return true;
        }
        return false;
    }

    public static LF1<Uri> b(final UriMatcher uriMatcher) {
        return new LF1() { // from class: o.PC2
            @Override // o.LF1
            public final boolean test(Object obj) {
                return QC2.a(uriMatcher, (Uri) obj);
            }
        };
    }
}

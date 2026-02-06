package o;

import android.net.Uri;
import java.io.File;

/* loaded from: classes.dex */
public final class NC2 {
    public static final File a(Uri uri) {
        if (C6562gT0.g(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path);
            }
            throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
        }
        throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
    }

    public static final Uri b(File file) {
        return Uri.fromFile(file);
    }

    public static final Uri c(String str) {
        return Uri.parse(str);
    }
}

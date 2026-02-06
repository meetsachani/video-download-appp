package o;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class SU {
    public static final File a(Context context, String str) {
        C6562gT0.p(context, "<this>");
        C6562gT0.p(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), C6562gT0.C("datastore/", str));
    }
}

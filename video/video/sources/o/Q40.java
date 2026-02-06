package o;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* loaded from: classes.dex */
public abstract class Q40 {
    public static final String b = "DocumentFile";
    public final Q40 a;

    public Q40(Q40 q40) {
        this.a = q40;
    }

    public static Q40 h(File file) {
        return new C7270jO1(null, file);
    }

    public static Q40 i(Context context, Uri uri) {
        return new C8197n82(null, context, uri);
    }

    public static Q40 j(Context context, Uri uri) {
        String h = S40.h(uri);
        if (S40.i(context, uri)) {
            h = S40.g(uri);
        }
        if (h != null) {
            Uri d = S40.d(uri, h);
            if (d != null) {
                return new C6666gu2(null, context, d);
            }
            throw new NullPointerException("Failed to build documentUri from a tree: " + uri);
        }
        throw new IllegalArgumentException("Could not get document ID from Uri: " + uri);
    }

    public static boolean p(Context context, Uri uri) {
        return S40.i(context, uri);
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract Q40 c(String str);

    public abstract Q40 d(String str, String str2);

    public abstract boolean e();

    public abstract boolean f();

    public Q40 g(String str) {
        Q40[] u;
        for (Q40 q40 : u()) {
            if (str.equals(q40.k())) {
                return q40;
            }
        }
        return null;
    }

    public abstract String k();

    public Q40 l() {
        return this.a;
    }

    public abstract String m();

    public abstract Uri n();

    public abstract boolean o();

    public abstract boolean q();

    public abstract boolean r();

    public abstract long s();

    public abstract long t();

    public abstract Q40[] u();

    public abstract boolean v(String str);
}

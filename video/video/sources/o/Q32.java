package o;

import android.os.Bundle;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class Q32 {
    public static final String e = "androidx.browser.trusted.sharing.KEY_ACTION";
    public static final String f = "androidx.browser.trusted.sharing.KEY_METHOD";
    public static final String g = "androidx.browser.trusted.sharing.KEY_ENCTYPE";
    public static final String h = "androidx.browser.trusted.sharing.KEY_PARAMS";
    public static final String i = "GET";
    public static final String j = "POST";
    public static final String k = "application/x-www-form-urlencoded";
    public static final String l = "multipart/form-data";
    public final String a;
    public final String b;
    public final String c;
    public final c d;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static final String c = "androidx.browser.trusted.sharing.KEY_FILE_NAME";
        public static final String d = "androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES";
        public final String a;
        public final List<String> b;

        public b(String str, List<String> list) {
            this.a = str;
            this.b = Collections.unmodifiableList(list);
        }

        public static b a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString(c);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(d);
            if (string == null || stringArrayList == null) {
                return null;
            }
            return new b(string, stringArrayList);
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(c, this.a);
            bundle.putStringArrayList(d, new ArrayList<>(this.b));
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static final String d = "androidx.browser.trusted.sharing.KEY_TITLE";
        public static final String e = "androidx.browser.trusted.sharing.KEY_TEXT";
        public static final String f = "androidx.browser.trusted.sharing.KEY_FILES";
        public final String a;
        public final String b;
        public final List<b> c;

        public c(String str, String str2, List<b> list) {
            this.a = str;
            this.b = str2;
            this.c = list;
        }

        public static c a(Bundle bundle) {
            ArrayList arrayList = null;
            if (bundle == null) {
                return null;
            }
            ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList(f);
            if (parcelableArrayList != null) {
                arrayList = new ArrayList();
                for (Bundle bundle2 : parcelableArrayList) {
                    arrayList.add(b.a(bundle2));
                }
            }
            return new c(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), arrayList);
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.a);
            bundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.b);
            if (this.c != null) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (b bVar : this.c) {
                    arrayList.add(bVar.b());
                }
                bundle.putParcelableArrayList(f, arrayList);
            }
            return bundle;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface d {
    }

    public Q32(String str, String str2, String str3, c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cVar;
    }

    public static Q32 a(Bundle bundle) {
        String string = bundle.getString(e);
        String string2 = bundle.getString(f);
        String string3 = bundle.getString(g);
        c a2 = c.a(bundle.getBundle(h));
        if (string != null && a2 != null) {
            return new Q32(string, string2, string3, a2);
        }
        return null;
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(e, this.a);
        bundle.putString(f, this.b);
        bundle.putString(g, this.c);
        bundle.putBundle(h, this.d.b());
        return bundle;
    }
}

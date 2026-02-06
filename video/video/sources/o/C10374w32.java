package o;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.w32  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10374w32 {
    public static final String d = "androidx.browser.trusted.sharing.KEY_TITLE";
    public static final String e = "androidx.browser.trusted.sharing.KEY_TEXT";
    public static final String f = "androidx.browser.trusted.sharing.KEY_URIS";
    public final String a;
    public final String b;
    public final List<Uri> c;

    public C10374w32(String str, String str2, List<Uri> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public static C10374w32 a(Bundle bundle) {
        return new C10374w32(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), bundle.getParcelableArrayList(f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.a);
        bundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.b);
        if (this.c != null) {
            bundle.putParcelableArrayList(f, new ArrayList<>(this.c));
        }
        return bundle;
    }
}

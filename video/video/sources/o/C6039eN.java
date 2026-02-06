package o;

import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* renamed from: o.eN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6039eN<T, I> extends AbstractC9727tP<T, I> {
    public static final String g = "wahr";
    public static final String[] i = {g, "ja", "j", "1", "w"};
    public static final String h = "falsch";
    public static final String[] j = {h, "nein", GoogleApiAvailabilityLight.e, "0", "f"};

    @Override // o.AbstractC9727tP
    public String[] r() {
        return j;
    }

    @Override // o.AbstractC9727tP
    public String[] s() {
        return i;
    }

    @Override // o.AbstractC9727tP
    public String t() {
        return h;
    }

    @Override // o.AbstractC9727tP
    public String u() {
        return g;
    }
}

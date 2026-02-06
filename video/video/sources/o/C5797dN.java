package o;

import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* renamed from: o.dN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5797dN<T, I> extends AbstractC9727tP<T, I> {
    public static final String g = "vrai";
    public static final String[] i = {g, "oui", W12.e, "1", "v"};
    public static final String h = "faux";
    public static final String[] j = {h, "non", GoogleApiAvailabilityLight.e, "0", "f"};

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

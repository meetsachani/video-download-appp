package o;

import java.util.Map;

/* renamed from: o.Cn1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2667Cn1<L, R> extends AbstractC4280Sx1<L, R> {
    public static final C2667Cn1<?, ?>[] Y0 = new C2667Cn1[0];
    private static final long serialVersionUID = 4954918890077093841L;
    public L Y;
    public R Z;

    public C2667Cn1() {
    }

    public static <L, R> C2667Cn1<L, R>[] n() {
        return (C2667Cn1<L, R>[]) Y0;
    }

    public static <L, R> C2667Cn1<L, R> o(L l, R r) {
        return new C2667Cn1<>(l, r);
    }

    public static <L, R> C2667Cn1<L, R> p(Map.Entry<L, R> entry) {
        L l;
        R r;
        if (entry != null) {
            l = entry.getKey();
            r = entry.getValue();
        } else {
            l = null;
            r = null;
        }
        return new C2667Cn1<>(l, r);
    }

    @Override // o.AbstractC4280Sx1
    public L h() {
        return this.Y;
    }

    @Override // o.AbstractC4280Sx1
    public R i() {
        return this.Z;
    }

    public void q(L l) {
        this.Y = l;
    }

    public void r(R r) {
        this.Z = r;
    }

    @Override // java.util.Map.Entry
    public R setValue(R r) {
        R i = i();
        r(r);
        return i;
    }

    public C2667Cn1(L l, R r) {
        this.Y = l;
        this.Z = r;
    }
}

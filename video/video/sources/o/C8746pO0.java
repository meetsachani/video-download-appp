package o;

import java.util.Map;

/* renamed from: o.pO0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8746pO0<L, R> extends AbstractC4280Sx1<L, R> {
    public static final C8746pO0<?, ?>[] Y0 = new C8746pO0[0];
    public static final C8746pO0 Z0 = q(null, null);
    private static final long serialVersionUID = 4954918890077093841L;
    public final L Y;
    public final R Z;

    public C8746pO0(L l, R r) {
        this.Y = l;
        this.Z = r;
    }

    public static <L, R> C8746pO0<L, R>[] n() {
        return (C8746pO0<L, R>[]) Y0;
    }

    public static <L, R> AbstractC4280Sx1<L, R> o(L l) {
        return q(l, null);
    }

    public static <L, R> C8746pO0<L, R> p() {
        return Z0;
    }

    public static <L, R> C8746pO0<L, R> q(L l, R r) {
        return new C8746pO0<>(l, r);
    }

    public static <L, R> C8746pO0<L, R> r(Map.Entry<L, R> entry) {
        L l;
        R r;
        if (entry != null) {
            l = entry.getKey();
            r = entry.getValue();
        } else {
            l = null;
            r = null;
        }
        return new C8746pO0<>(l, r);
    }

    public static <L, R> AbstractC4280Sx1<L, R> s(R r) {
        return q(null, r);
    }

    @Override // o.AbstractC4280Sx1
    public L h() {
        return this.Y;
    }

    @Override // o.AbstractC4280Sx1
    public R i() {
        return this.Z;
    }

    @Override // java.util.Map.Entry
    public R setValue(R r) {
        throw new UnsupportedOperationException();
    }
}

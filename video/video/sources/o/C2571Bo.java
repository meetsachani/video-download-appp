package o;

/* renamed from: o.Bo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2571Bo extends AbstractC10602x0 {
    @Override // o.TT1
    /* renamed from: s */
    public Nx2 k(QT1 qt1) {
        String g = qt1.g();
        if (!g.startsWith("MEBKM:")) {
            return null;
        }
        String r = AbstractC10602x0.r("TITLE:", g, true);
        String[] q = AbstractC10602x0.q("URL:", g, true);
        if (q == null) {
            return null;
        }
        String str = q[0];
        if (!Ox2.q(str)) {
            return null;
        }
        return new Nx2(str, r);
    }
}

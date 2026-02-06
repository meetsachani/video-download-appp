package o;

/* loaded from: classes3.dex */
public final class Qx2 extends TT1 {
    @Override // o.TT1
    /* renamed from: q */
    public Nx2 k(QT1 qt1) {
        int indexOf;
        String c = TT1.c(qt1);
        String str = null;
        if ((!c.startsWith("urlto:") && !c.startsWith("URLTO:")) || (indexOf = c.indexOf(58, 6)) < 0) {
            return null;
        }
        if (indexOf > 6) {
            str = c.substring(6, indexOf);
        }
        return new Nx2(c.substring(indexOf + 1), str);
    }
}

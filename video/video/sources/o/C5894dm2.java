package o;

/* renamed from: o.dm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5894dm2 extends TT1 {
    @Override // o.TT1
    /* renamed from: q */
    public C5651cm2 k(QT1 qt1) {
        String str;
        String substring;
        String c = TT1.c(qt1);
        if (!c.startsWith("tel:") && !c.startsWith("TEL:")) {
            return null;
        }
        if (c.startsWith("TEL:")) {
            str = "tel:" + c.substring(4);
        } else {
            str = c;
        }
        int indexOf = c.indexOf(63, 4);
        if (indexOf < 0) {
            substring = c.substring(4);
        } else {
            substring = c.substring(4, indexOf);
        }
        return new C5651cm2(substring, str, null);
    }
}

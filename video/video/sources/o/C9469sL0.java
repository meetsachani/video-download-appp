package o;

/* renamed from: o.sL0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9469sL0 extends TT1 {
    @Override // o.TT1
    /* renamed from: q */
    public C9226rL0 k(QT1 qt1) {
        if (qt1.b() != EnumC3839Ok.EAN_13) {
            return null;
        }
        String c = TT1.c(qt1);
        if (c.length() != 13) {
            return null;
        }
        if (!c.startsWith("978") && !c.startsWith("979")) {
            return null;
        }
        return new C9226rL0(c);
    }
}

package o;

/* loaded from: classes3.dex */
public final class DI1 extends TT1 {
    @Override // o.TT1
    /* renamed from: q */
    public CI1 k(QT1 qt1) {
        String str;
        EnumC3839Ok b = qt1.b();
        if (b != EnumC3839Ok.UPC_A && b != EnumC3839Ok.UPC_E && b != EnumC3839Ok.EAN_8 && b != EnumC3839Ok.EAN_13) {
            return null;
        }
        String c = TT1.c(qt1);
        if (!TT1.d(c, c.length())) {
            return null;
        }
        if (b == EnumC3839Ok.UPC_E && c.length() == 8) {
            str = Kx2.s(c);
        } else {
            str = c;
        }
        return new CI1(c, str);
    }
}

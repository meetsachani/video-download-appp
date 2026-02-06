package o;

/* renamed from: o.s7  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9412s7 extends AbstractC10602x0 {
    public static String t(String str) {
        int indexOf = str.indexOf(44);
        if (indexOf >= 0) {
            return str.substring(indexOf + 1) + ' ' + str.substring(0, indexOf);
        }
        return str;
    }

    @Override // o.TT1
    /* renamed from: s */
    public C9655t7 k(QT1 qt1) {
        String[] q;
        String str;
        String c = TT1.c(qt1);
        if (!c.startsWith("MECARD:") || (q = AbstractC10602x0.q("N:", c, true)) == null) {
            return null;
        }
        String t = t(q[0]);
        String r = AbstractC10602x0.r("SOUND:", c, true);
        String[] q2 = AbstractC10602x0.q("TEL:", c, true);
        String[] q3 = AbstractC10602x0.q("EMAIL:", c, true);
        String r2 = AbstractC10602x0.r("NOTE:", c, false);
        String[] q4 = AbstractC10602x0.q("ADR:", c, true);
        String r3 = AbstractC10602x0.r("BDAY:", c, true);
        if (!TT1.d(r3, 8)) {
            str = null;
        } else {
            str = r3;
        }
        return new C9655t7(TT1.j(t), null, r, q2, null, q3, null, null, r2, q4, null, AbstractC10602x0.r("ORG:", c, true), str, null, AbstractC10602x0.q("URL:", c, true), null);
    }
}

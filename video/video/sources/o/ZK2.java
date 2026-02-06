package o;

/* loaded from: classes3.dex */
public final class ZK2 extends TT1 {
    @Override // o.TT1
    /* renamed from: q */
    public YK2 k(QT1 qt1) {
        String substring;
        String g;
        String c = TT1.c(qt1);
        if (!c.startsWith("WIFI:") || (g = TT1.g("S:", (substring = c.substring(5)), C10928yK2.l, false)) == null || g.isEmpty()) {
            return null;
        }
        String g2 = TT1.g("P:", substring, C10928yK2.l, false);
        String g3 = TT1.g("T:", substring, C10928yK2.l, false);
        if (g3 == null) {
            g3 = "nopass";
        }
        return new YK2(g3, g, g2, Boolean.parseBoolean(TT1.g("H:", substring, C10928yK2.l, false)), TT1.g("I:", substring, C10928yK2.l, false), TT1.g("A:", substring, C10928yK2.l, false), TT1.g("E:", substring, C10928yK2.l, false), TT1.g("H:", substring, C10928yK2.l, false));
    }
}

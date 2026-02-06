package o;

import java.util.ArrayList;

/* renamed from: o.r7  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9169r7 extends TT1 {
    public static String[] q(String str, int i, String str2, boolean z) {
        ArrayList arrayList = null;
        for (int i2 = 1; i2 <= i; i2++) {
            String g = TT1.g(str + i2 + ':', str2, C8206nB.d, z);
            if (g == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(i);
            }
            arrayList.add(g);
        }
        if (arrayList == null) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // o.TT1
    /* renamed from: r */
    public C9655t7 k(QT1 qt1) {
        String c = TT1.c(qt1);
        if (!c.contains("MEMORY") || !c.contains(VI0.D)) {
            return null;
        }
        String g = TT1.g("NAME1:", c, C8206nB.d, true);
        String g2 = TT1.g("NAME2:", c, C8206nB.d, true);
        String[] q = q("TEL", 3, c, true);
        String[] q2 = q("MAIL", 3, c, true);
        String g3 = TT1.g("MEMORY:", c, C8206nB.d, false);
        String g4 = TT1.g("ADD:", c, C8206nB.d, true);
        return new C9655t7(TT1.j(g), null, g2, q, null, q2, null, null, g3, g4 != null ? new String[]{g4} : null, null, null, null, null, null, null);
    }
}

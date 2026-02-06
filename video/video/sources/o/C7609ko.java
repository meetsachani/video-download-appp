package o;

import java.util.ArrayList;

/* renamed from: o.ko  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7609ko extends AbstractC10602x0 {
    public static String s(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        return str + ' ' + str2;
    }

    public static String[] t(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList(3);
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (str3 != null) {
            arrayList.add(str3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[size]);
    }

    @Override // o.TT1
    /* renamed from: u */
    public C9655t7 k(QT1 qt1) {
        String c = TT1.c(qt1);
        if (!c.startsWith("BIZCARD:")) {
            return null;
        }
        String s = s(AbstractC10602x0.r("N:", c, true), AbstractC10602x0.r("X:", c, true));
        String r = AbstractC10602x0.r("T:", c, true);
        String r2 = AbstractC10602x0.r("C:", c, true);
        return new C9655t7(TT1.j(s), null, null, t(AbstractC10602x0.r("B:", c, true), AbstractC10602x0.r("M:", c, true), AbstractC10602x0.r("F:", c, true)), null, TT1.j(AbstractC10602x0.r("E:", c, true)), null, null, null, AbstractC10602x0.q("A:", c, true), null, r2, null, r, null, null);
    }
}

package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: o.yW1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10973yW1 extends TT1 {
    public static void q(Collection<String> collection, Collection<String> collection2, String str) {
        int indexOf = str.indexOf(59);
        String str2 = null;
        if (indexOf < 0) {
            collection.add(str);
            collection2.add(null);
            return;
        }
        collection.add(str.substring(0, indexOf));
        String substring = str.substring(indexOf + 1);
        if (substring.startsWith("via=")) {
            str2 = substring.substring(4);
        }
        collection2.add(str2);
    }

    @Override // o.TT1
    /* renamed from: r */
    public C11216zW1 k(QT1 qt1) {
        boolean z;
        String str;
        String substring;
        String c = TT1.c(qt1);
        String str2 = null;
        if (!c.startsWith("sms:") && !c.startsWith("SMS:") && !c.startsWith("mms:") && !c.startsWith("MMS:")) {
            return null;
        }
        Map<String, String> m = TT1.m(c);
        if (m != null && !m.isEmpty()) {
            str2 = m.get(C8192n71.h);
            str = m.get("body");
            z = true;
        } else {
            z = false;
            str = null;
        }
        int indexOf = c.indexOf(63, 4);
        if (indexOf >= 0 && z) {
            substring = c.substring(4, indexOf);
        } else {
            substring = c.substring(4);
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        int i = -1;
        while (true) {
            int i2 = i + 1;
            int indexOf2 = substring.indexOf(44, i2);
            if (indexOf2 > i) {
                q(arrayList, arrayList2, substring.substring(i2, indexOf2));
                i = indexOf2;
            } else {
                q(arrayList, arrayList2, substring.substring(i2));
                return new C11216zW1((String[]) arrayList.toArray(new String[arrayList.size()]), (String[]) arrayList2.toArray(new String[arrayList2.size()]), str2, str);
            }
        }
    }
}

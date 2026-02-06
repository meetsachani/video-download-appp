package o;

import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: o.va0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10252va0 extends TT1 {
    public static final Pattern f = Pattern.compile(",");

    @Override // o.TT1
    /* renamed from: q */
    public C10009ua0 k(QT1 qt1) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String str;
        String str2;
        String[] strArr4;
        String str3;
        String c = TT1.c(qt1);
        String[] strArr5 = null;
        if (!c.startsWith(C8192n71.b) && !c.startsWith("MAILTO:")) {
            if (!C10498wa0.s(c)) {
                return null;
            }
            return new C10009ua0(c);
        }
        String substring = c.substring(7);
        int indexOf = substring.indexOf(63);
        if (indexOf >= 0) {
            substring = substring.substring(0, indexOf);
        }
        try {
            String p = TT1.p(substring);
            if (!p.isEmpty()) {
                strArr = f.split(p);
            } else {
                strArr = null;
            }
            Map<String, String> m = TT1.m(c);
            if (m != null) {
                if (strArr == null && (str3 = m.get("to")) != null) {
                    strArr = f.split(str3);
                }
                String str4 = m.get(C8192n71.f);
                if (str4 != null) {
                    strArr4 = f.split(str4);
                } else {
                    strArr4 = null;
                }
                String str5 = m.get(C8192n71.g);
                if (str5 != null) {
                    strArr5 = f.split(str5);
                }
                str2 = m.get("body");
                strArr3 = strArr5;
                strArr2 = strArr4;
                str = m.get(C8192n71.h);
            } else {
                strArr2 = null;
                strArr3 = null;
                str = null;
                str2 = null;
            }
            return new C10009ua0(strArr, strArr2, strArr3, str, str2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}

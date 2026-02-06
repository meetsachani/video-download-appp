package o;

import com.google.android.material.timepicker.ChipTextInputComboView;
import java.util.HashMap;

/* renamed from: o.qi0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9063qi0 extends TT1 {
    public static String q(int i, String str) {
        if (str.charAt(i) != '(') {
            return null;
        }
        String substring = str.substring(i + 1);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < substring.length(); i2++) {
            char charAt = substring.charAt(i2);
            if (charAt == ')') {
                return sb.toString();
            }
            if (charAt < '0' || charAt > '9') {
                return null;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String r(int i, String str) {
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(i);
        for (int i2 = 0; i2 < substring.length(); i2++) {
            char charAt = substring.charAt(i2);
            if (charAt == '(') {
                if (q(i2, substring) != null) {
                    break;
                }
                sb.append('(');
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x020d, code lost:
        if (r2.equals("10") == false) goto L12;
     */
    @Override // o.TT1
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C8820pi0 k(QT1 qt1) {
        HashMap hashMap;
        if (qt1.b() != EnumC3839Ok.RSS_EXPANDED) {
            return null;
        }
        String c = TT1.c(qt1);
        HashMap hashMap2 = new HashMap();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        int i = 0;
        while (i < c.length()) {
            String q = q(i, c);
            if (q == null) {
                return null;
            }
            char c2 = 2;
            int length = i + q.length() + 2;
            String r = r(length, c);
            int length2 = length + r.length();
            switch (q.hashCode()) {
                case I3.g /* 1536 */:
                    if (q.equals(ChipTextInputComboView.b.Y)) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1537:
                    if (q.equals("01")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1567:
                    break;
                case 1568:
                    if (q.equals("11")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1570:
                    if (q.equals("13")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1572:
                    if (q.equals("15")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1574:
                    if (q.equals("17")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1567966:
                    if (q.equals("3100")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1567967:
                    if (q.equals("3101")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1567968:
                    if (q.equals("3102")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1567969:
                    if (q.equals("3103")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1567970:
                    if (q.equals("3104")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1567971:
                    if (q.equals("3105")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1567972:
                    if (q.equals("3106")) {
                        c2 = C8206nB.d;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1567973:
                    if (q.equals("3107")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1567974:
                    if (q.equals("3108")) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1567975:
                    if (q.equals("3109")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1568927:
                    if (q.equals("3200")) {
                        c2 = 17;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1568928:
                    if (q.equals("3201")) {
                        c2 = 18;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1568929:
                    if (q.equals("3202")) {
                        c2 = 19;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1568930:
                    if (q.equals("3203")) {
                        c2 = 20;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1568931:
                    if (q.equals("3204")) {
                        c2 = 21;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1568932:
                    if (q.equals("3205")) {
                        c2 = 22;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1568933:
                    if (q.equals("3206")) {
                        c2 = 23;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1568934:
                    if (q.equals("3207")) {
                        c2 = 24;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1568935:
                    if (q.equals("3208")) {
                        c2 = 25;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1568936:
                    if (q.equals("3209")) {
                        c2 = 26;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1575716:
                    if (q.equals("3920")) {
                        c2 = 27;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1575717:
                    if (q.equals("3921")) {
                        c2 = C5588cW.n;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1575718:
                    if (q.equals("3922")) {
                        c2 = C5588cW.f706o;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1575719:
                    if (q.equals("3923")) {
                        c2 = C5588cW.p;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1575747:
                    if (q.equals("3930")) {
                        c2 = VN2.b;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1575748:
                    if (q.equals("3931")) {
                        c2 = ' ';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1575749:
                    if (q.equals("3932")) {
                        c2 = '!';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1575750:
                    if (q.equals("3933")) {
                        c2 = '\"';
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    str2 = r;
                    continue;
                    i = length2;
                case 1:
                    str = r;
                    continue;
                    i = length2;
                case 2:
                    str3 = r;
                    continue;
                    i = length2;
                case 3:
                    str4 = r;
                    continue;
                    i = length2;
                case 4:
                    str5 = r;
                    continue;
                    i = length2;
                case 5:
                    str6 = r;
                    continue;
                    i = length2;
                case 6:
                    str7 = r;
                    continue;
                    i = length2;
                case 7:
                case '\b':
                case '\t':
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 15:
                case 16:
                    hashMap = hashMap2;
                    str10 = q.substring(3);
                    str9 = C8820pi0.q;
                    str8 = r;
                    break;
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    hashMap = hashMap2;
                    str10 = q.substring(3);
                    str9 = C8820pi0.r;
                    str8 = r;
                    break;
                case 27:
                case 28:
                case 29:
                case 30:
                    hashMap = hashMap2;
                    str12 = q.substring(3);
                    str11 = r;
                    break;
                case 31:
                case ' ':
                case '!':
                case '\"':
                    if (r.length() < 4) {
                        return null;
                    }
                    str11 = r.substring(3);
                    hashMap = hashMap2;
                    str13 = r.substring(0, 3);
                    str12 = q.substring(3);
                    break;
                default:
                    hashMap2.put(q, r);
                    continue;
                    i = length2;
            }
            hashMap2 = hashMap;
            i = length2;
        }
        return new C8820pi0(c, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, hashMap2);
    }
}

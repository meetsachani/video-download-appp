package o;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* renamed from: o.d80  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5738d80 {
    public static final String a = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'";
    public static final String b = "y";
    public static final String c = "M";
    public static final String d = "d";
    public static final String e = "H";
    public static final String f = "m";
    public static final String g = "s";
    public static final String h = "S";

    public static String a(a[] aVarArr, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z) {
        int i;
        int i2;
        a[] aVarArr2 = aVarArr;
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        boolean z2 = false;
        for (int length = aVarArr2.length; i3 < length; length = i2) {
            a aVar = aVarArr2[i3];
            Object d2 = aVar.d();
            int c2 = aVar.c();
            if (d2 instanceof StringBuilder) {
                sb.append(d2.toString());
                i2 = length;
                i = i3;
            } else {
                if (d2.equals(b)) {
                    sb.append(k(j, z, c2));
                } else if (d2.equals("M")) {
                    sb.append(k(j2, z, c2));
                } else if (d2.equals("d")) {
                    i = i3;
                    sb.append(k(j3, z, c2));
                    i2 = length;
                    z2 = false;
                } else {
                    i = i3;
                    if (d2.equals(e)) {
                        i2 = length;
                        sb.append(k(j4, z, c2));
                    } else {
                        i2 = length;
                        if (d2.equals("m")) {
                            sb.append(k(j5, z, c2));
                        } else {
                            if (d2.equals("s")) {
                                sb.append(k(j6, z, c2));
                                z2 = true;
                            } else if (d2.equals("S")) {
                                if (z2) {
                                    sb.append(k(j7, true, z ? Math.max(3, c2) : 3));
                                } else {
                                    sb.append(k(j7, z, c2));
                                }
                                z2 = false;
                            }
                            i3 = i + 1;
                            aVarArr2 = aVarArr;
                        }
                    }
                    z2 = false;
                    i3 = i + 1;
                    aVarArr2 = aVarArr;
                }
                i2 = length;
                i = i3;
                z2 = false;
            }
            i3 = i + 1;
            aVarArr2 = aVarArr;
        }
        return sb.toString();
    }

    public static String b(long j, String str) {
        return c(j, str, true);
    }

    public static String c(long j, String str, boolean z) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        C11147zE2.r(0L, Long.MAX_VALUE, j, "durationMillis must not be negative");
        a[] j7 = j(str);
        if (a.b(j7, "d")) {
            j3 = j / 86400000;
            j2 = j - (86400000 * j3);
        } else {
            j2 = j;
            j3 = 0;
        }
        if (a.b(j7, e)) {
            long j8 = j2 / 3600000;
            j2 -= 3600000 * j8;
            j4 = j8;
        } else {
            j4 = 0;
        }
        if (a.b(j7, "m")) {
            long j9 = j2 / 60000;
            j2 -= 60000 * j9;
            j5 = j9;
        } else {
            j5 = 0;
        }
        if (a.b(j7, "s")) {
            j6 = j2 / 1000;
            j2 -= 1000 * j6;
        } else {
            j6 = 0;
        }
        return a(j7, 0L, 0L, j3, j4, j5, j6, j2, z);
    }

    public static String d(long j) {
        return b(j, "HH:mm:ss.SSS");
    }

    public static String e(long j) {
        return c(j, a, false);
    }

    public static String f(long j, boolean z, boolean z2) {
        String b2 = b(j, "d' days 'H' hours 'm' minutes 's' seconds'");
        if (z) {
            b2 = C4500Ve2.b + b2;
            String r2 = C4500Ve2.r2(b2, " 0 days", "");
            if (r2.length() != b2.length()) {
                String r22 = C4500Ve2.r2(r2, " 0 hours", "");
                if (r22.length() != r2.length()) {
                    b2 = C4500Ve2.r2(r22, " 0 minutes", "");
                    if (b2.length() != b2.length()) {
                        b2 = C4500Ve2.r2(b2, " 0 seconds", "");
                    }
                } else {
                    b2 = r2;
                }
            }
            if (!b2.isEmpty()) {
                b2 = b2.substring(1);
            }
        }
        if (z2) {
            String r23 = C4500Ve2.r2(b2, " 0 seconds", "");
            if (r23.length() != b2.length()) {
                b2 = C4500Ve2.r2(r23, " 0 minutes", "");
                if (b2.length() != r23.length()) {
                    String r24 = C4500Ve2.r2(b2, " 0 hours", "");
                    if (r24.length() != b2.length()) {
                        b2 = C4500Ve2.r2(r24, " 0 days", "");
                    }
                } else {
                    b2 = r23;
                }
            }
        }
        return C4500Ve2.r2(C4500Ve2.r2(C4500Ve2.r2(C4500Ve2.r2(C4500Ve2.b + b2, " 1 seconds", " 1 second"), " 1 minutes", " 1 minute"), " 1 hours", " 1 hour"), " 1 days", " 1 day").trim();
    }

    public static String g(long j, long j2, String str) {
        return h(j, j2, str, true, TimeZone.getDefault());
    }

    public static String h(long j, long j2, String str, boolean z, TimeZone timeZone) {
        boolean z2;
        int i = 0;
        if (j <= j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C11147zE2.B(z2, "startMillis must not be greater than endMillis", new Object[0]);
        a[] j3 = j(str);
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(new Date(j));
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTime(new Date(j2));
        int i2 = calendar2.get(14) - calendar.get(14);
        int i3 = calendar2.get(13) - calendar.get(13);
        int i4 = calendar2.get(12) - calendar.get(12);
        int i5 = calendar2.get(11) - calendar.get(11);
        int i6 = calendar2.get(5) - calendar.get(5);
        int i7 = calendar2.get(2) - calendar.get(2);
        int i8 = calendar2.get(1) - calendar.get(1);
        while (i2 < 0) {
            i2 += 1000;
            i3--;
        }
        while (i3 < 0) {
            i3 += 60;
            i4--;
        }
        while (i4 < 0) {
            i4 += 60;
            i5--;
        }
        while (i5 < 0) {
            i5 += 24;
            i6--;
        }
        if (a.b(j3, "M")) {
            while (i6 < 0) {
                i6 += calendar.getActualMaximum(5);
                i7--;
                calendar.add(2, 1);
            }
            while (i7 < 0) {
                i7 += 12;
                i8--;
            }
            if (!a.b(j3, b) && i8 != 0) {
                while (i8 != 0) {
                    i7 += i8 * 12;
                    i8 = 0;
                }
            }
        } else {
            if (!a.b(j3, b)) {
                int i9 = calendar2.get(1);
                if (i7 < 0) {
                    i9--;
                }
                while (calendar.get(1) != i9) {
                    int actualMaximum = i6 + (calendar.getActualMaximum(6) - calendar.get(6));
                    if ((calendar instanceof GregorianCalendar) && calendar.get(2) == 1 && calendar.get(5) == 29) {
                        actualMaximum++;
                    }
                    calendar.add(1, 1);
                    i6 = actualMaximum + calendar.get(6);
                }
                i8 = 0;
            }
            while (calendar.get(2) != calendar2.get(2)) {
                i6 += calendar.getActualMaximum(5);
                calendar.add(2, 1);
            }
            i7 = 0;
            while (i6 < 0) {
                i6 += calendar.getActualMaximum(5);
                i7--;
                calendar.add(2, 1);
            }
        }
        if (!a.b(j3, "d")) {
            i5 += i6 * 24;
            i6 = 0;
        }
        if (!a.b(j3, e)) {
            i4 += i5 * 60;
            i5 = 0;
        }
        if (!a.b(j3, "m")) {
            i3 += i4 * 60;
            i4 = 0;
        }
        if (!a.b(j3, "s")) {
            i2 += i3 * 1000;
        } else {
            i = i3;
        }
        return a(j3, i8, i7, i6, i5, i4, i, i2, z);
    }

    public static String i(long j, long j2) {
        return h(j, j2, a, false, TimeZone.getDefault());
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a[] j(String str) {
        String str2;
        ArrayList arrayList = new ArrayList(str.length());
        boolean z = false;
        StringBuilder sb = null;
        a aVar = null;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (z && charAt != '\'') {
                sb.append(charAt);
            } else if (charAt != '\'') {
                if (charAt != 'H') {
                    if (charAt != 'M') {
                        if (charAt != 'S') {
                            if (charAt != 'd') {
                                if (charAt != 'm') {
                                    if (charAt != 's') {
                                        if (charAt != 'y') {
                                            if (sb == null) {
                                                sb = new StringBuilder();
                                                arrayList.add(new a(sb));
                                            }
                                            sb.append(charAt);
                                            str2 = null;
                                        } else {
                                            str2 = b;
                                        }
                                    } else {
                                        str2 = "s";
                                    }
                                } else {
                                    str2 = "m";
                                }
                            } else {
                                str2 = "d";
                            }
                        } else {
                            str2 = "S";
                        }
                    } else {
                        str2 = "M";
                    }
                } else {
                    str2 = e;
                }
                if (str2 != null) {
                    if (aVar != null && aVar.d().equals(str2)) {
                        aVar.e();
                    } else {
                        aVar = new a(str2);
                        arrayList.add(aVar);
                    }
                    sb = null;
                }
            } else if (z) {
                z = false;
                sb = null;
                str2 = null;
                if (str2 != null) {
                }
            } else {
                sb = new StringBuilder();
                arrayList.add(new a(sb));
                z = true;
                str2 = null;
                if (str2 != null) {
                }
            }
        }
        if (!z) {
            return (a[]) arrayList.toArray(a.c);
        }
        throw new IllegalArgumentException("Unmatched quote in format: " + str);
    }

    public static String k(long j, boolean z, int i) {
        String l = Long.toString(j);
        if (z) {
            return C4500Ve2.D1(l, i, C3599Ly1.j);
        }
        return l;
    }

    /* renamed from: o.d80$a */
    /* loaded from: classes4.dex */
    public static class a {
        public static final a[] c = new a[0];
        public final Object a;
        public int b;

        public a(Object obj) {
            this.a = obj;
            this.b = 1;
        }

        public static boolean b(a[] aVarArr, Object obj) {
            for (a aVar : aVarArr) {
                if (aVar.d() == obj) {
                    return true;
                }
            }
            return false;
        }

        public int c() {
            return this.b;
        }

        public Object d() {
            return this.a;
        }

        public void e() {
            this.b++;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.a.getClass() != aVar.a.getClass() || this.b != aVar.b) {
                    return false;
                }
                Object obj2 = this.a;
                if (obj2 instanceof StringBuilder) {
                    return obj2.toString().equals(aVar.a.toString());
                }
                if (obj2 instanceof Number) {
                    return obj2.equals(aVar.a);
                }
                if (obj2 == aVar.a) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return C4500Ve2.d2(this.a.toString(), this.b);
        }

        public a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }
    }
}

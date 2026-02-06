package o;

import java.util.Locale;

@Deprecated
/* renamed from: o.bD2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5275bD2 {
    public static final String e = "RepresentationID";
    public static final String f = "Number";
    public static final String g = "Bandwidth";
    public static final String h = "Time";
    public static final String i = "$$";
    public static final String j = "%01d";
    public static final int k = 1;
    public static final int l = 2;
    public static final int m = 3;
    public static final int n = 4;
    public final String[] a;
    public final int[] b;
    public final String[] c;
    public final int d;

    public C5275bD2(String[] strArr, int[] iArr, String[] strArr2, int i2) {
        this.a = strArr;
        this.b = iArr;
        this.c = strArr2;
        this.d = i2;
    }

    public static C5275bD2 b(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new C5275bD2(strArr, iArr, strArr2, c(str, strArr, iArr, strArr2));
    }

    public static int c(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String str2;
        strArr[0] = "";
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            int indexOf = str.indexOf("$", i2);
            char c = 65535;
            if (indexOf == -1) {
                strArr[i3] = strArr[i3] + str.substring(i2);
                i2 = str.length();
            } else if (indexOf != i2) {
                strArr[i3] = strArr[i3] + str.substring(i2, indexOf);
                i2 = indexOf;
            } else if (str.startsWith(i, i2)) {
                strArr[i3] = strArr[i3] + "$";
                i2 += 2;
            } else {
                int i4 = i2 + 1;
                int indexOf2 = str.indexOf("$", i4);
                String substring = str.substring(i4, indexOf2);
                if (substring.equals(e)) {
                    iArr[i3] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                            str2 = str2 + "d";
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = j;
                    }
                    substring.getClass();
                    switch (substring.hashCode()) {
                        case -1950496919:
                            if (substring.equals(f)) {
                                c = 0;
                                break;
                            }
                            break;
                        case 2606829:
                            if (substring.equals(h)) {
                                c = 1;
                                break;
                            }
                            break;
                        case 38199441:
                            if (substring.equals("Bandwidth")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            iArr[i3] = 2;
                            break;
                        case 1:
                            iArr[i3] = 4;
                            break;
                        case 2:
                            iArr[i3] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    strArr2[i3] = str2;
                }
                i3++;
                strArr[i3] = "";
                i2 = indexOf2 + 1;
            }
        }
        return i3;
    }

    public String a(String str, long j2, int i2, long j3) {
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (true) {
            int i4 = this.d;
            if (i3 < i4) {
                sb.append(this.a[i3]);
                int i5 = this.b[i3];
                if (i5 == 1) {
                    sb.append(str);
                } else if (i5 == 2) {
                    sb.append(String.format(Locale.US, this.c[i3], Long.valueOf(j2)));
                } else if (i5 == 3) {
                    sb.append(String.format(Locale.US, this.c[i3], Integer.valueOf(i2)));
                } else if (i5 == 4) {
                    sb.append(String.format(Locale.US, this.c[i3], Long.valueOf(j3)));
                }
                i3++;
            } else {
                sb.append(this.a[i4]);
                return sb.toString();
            }
        }
    }
}

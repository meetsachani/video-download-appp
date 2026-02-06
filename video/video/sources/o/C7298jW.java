package o;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.messaging.TopicOperation;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Arrays;
import o.AbstractC4253Sp2;

/* renamed from: o.jW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7298jW {
    public static final String[] b = {"CTRL_PS", C4500Ve2.b, C2638Cg0.W4, "B", "C", "D", C2638Cg0.S4, "F", RequestConfiguration.m, C5738d80.e, "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", C2638Cg0.X4, C2638Cg0.T4, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    public static final String[] c = {"CTRL_PS", C4500Ve2.b, "a", "b", "c", "d", W12.i, "f", "g", C10901yE.i, "i", "j", "k", C10901yE.l, "m", GoogleApiAvailabilityLight.e, W12.e, "p", com.facebook.gamingservices.q.a, "r", "s", "t", "u", "v", "w", "x", C5738d80.b, W12.r, "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    public static final String[] d = {"CTRL_PS", C4500Ve2.b, "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", C11298zs.h, "^", CrashlyticsReportPersistence.m, "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    public static final String[] e = {"", "\r", VI0.D, ". ", C6566gU0.h, ": ", TopicOperation.d, AbstractC4253Sp2.b.x1, "#", "$", "%", "&", "'", C9811tl1.c, C9811tl1.d, "*", C2555Bk.p1, ",", "-", UE.h, RemoteSettings.i, ":", ";", "<", "=", ">", "?", C6566gU0.f, C6566gU0.g, "{", "}", "CTRL_UL"};
    public static final String[] f = {"CTRL_PS", C4500Ve2.b, "0", "1", C2638Cg0.Y4, C2638Cg0.Z4, "4", "5", "6", "7", "8", "9", ",", UE.h, "CTRL_UL", "CTRL_US"};
    public C5398bk a;

    /* renamed from: o.jW$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: o.jW$b */
    /* loaded from: classes3.dex */
    public enum b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    public static byte[] a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = i(zArr, i << 3);
        }
        return bArr;
    }

    public static String e(b bVar, int i) {
        int i2 = a.a[bVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return f[i];
                        }
                        throw new IllegalStateException("Bad table");
                    }
                    return e[i];
                }
                return d[i];
            }
            return c[i];
        }
        return b[i];
    }

    public static String f(boolean[] zArr) {
        int i;
        int length = zArr.length;
        b bVar = b.UPPER;
        StringBuilder sb = new StringBuilder(20);
        b bVar2 = bVar;
        int i2 = 0;
        while (i2 < length) {
            if (bVar == b.BINARY) {
                if (length - i2 < 5) {
                    break;
                }
                int j = j(zArr, i2, 5);
                int i3 = i2 + 5;
                if (j == 0) {
                    if (length - i3 < 11) {
                        break;
                    }
                    j = j(zArr, i3, 11) + 31;
                    i3 = i2 + 16;
                }
                int i4 = 0;
                while (true) {
                    if (i4 < j) {
                        if (length - i3 < 8) {
                            i2 = length;
                            break;
                        }
                        sb.append((char) j(zArr, i3, 8));
                        i3 += 8;
                        i4++;
                    } else {
                        i2 = i3;
                        break;
                    }
                }
                bVar = bVar2;
            } else {
                if (bVar == b.DIGIT) {
                    i = 4;
                } else {
                    i = 5;
                }
                if (length - i2 < i) {
                    break;
                }
                int j2 = j(zArr, i2, i);
                i2 += i;
                String e2 = e(bVar, j2);
                if (e2.startsWith("CTRL_")) {
                    bVar2 = g(e2.charAt(5));
                    if (e2.charAt(6) != 'L') {
                        bVar2 = bVar;
                        bVar = bVar2;
                    }
                } else {
                    sb.append(e2);
                }
                bVar = bVar2;
            }
        }
        return sb.toString();
    }

    public static b g(char c2) {
        if (c2 != 'B') {
            if (c2 != 'D') {
                if (c2 != 'P') {
                    if (c2 != 'L') {
                        if (c2 != 'M') {
                            return b.UPPER;
                        }
                        return b.MIXED;
                    }
                    return b.LOWER;
                }
                return b.PUNCT;
            }
            return b.DIGIT;
        }
        return b.BINARY;
    }

    public static String h(boolean[] zArr) {
        return f(zArr);
    }

    public static byte i(boolean[] zArr, int i) {
        int j;
        int length = zArr.length - i;
        if (length >= 8) {
            j = j(zArr, i, 8);
        } else {
            j = j(zArr, i, length) << (8 - length);
        }
        return (byte) j;
    }

    public static int j(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    public static int k(int i, boolean z) {
        int i2;
        if (z) {
            i2 = 88;
        } else {
            i2 = 112;
        }
        return (i2 + (i << 4)) * i;
    }

    public final boolean[] b(boolean[] zArr) throws C2605Bx0 {
        int i;
        LC0 lc0;
        boolean z;
        boolean z2;
        if (this.a.d() <= 2) {
            lc0 = LC0.j;
            i = 6;
        } else {
            i = 8;
            if (this.a.d() <= 8) {
                lc0 = LC0.n;
            } else if (this.a.d() <= 22) {
                lc0 = LC0.i;
                i = 10;
            } else {
                lc0 = LC0.h;
                i = 12;
            }
        }
        int c2 = this.a.c();
        int length = zArr.length / i;
        if (length >= c2) {
            int length2 = zArr.length % i;
            int[] iArr = new int[length];
            int i2 = 0;
            while (i2 < length) {
                iArr[i2] = j(zArr, length2, i);
                i2++;
                length2 += i;
            }
            try {
                new KP1(lc0).a(iArr, length - c2);
                int i3 = 1 << i;
                int i4 = i3 - 1;
                int i5 = 0;
                for (int i6 = 0; i6 < c2; i6++) {
                    int i7 = iArr[i6];
                    if (i7 != 0 && i7 != i4) {
                        if (i7 == 1 || i7 == i3 - 2) {
                            i5++;
                        }
                    } else {
                        throw C2605Bx0.a();
                    }
                }
                boolean[] zArr2 = new boolean[(c2 * i) - i5];
                int i8 = 0;
                for (int i9 = 0; i9 < c2; i9++) {
                    int i10 = iArr[i9];
                    if (i10 != 1 && i10 != i3 - 2) {
                        int i11 = i - 1;
                        while (i11 >= 0) {
                            int i12 = i8 + 1;
                            if (((1 << i11) & i10) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zArr2[i8] = z2;
                            i11--;
                            i8 = i12;
                        }
                    } else {
                        int i13 = (i8 + i) - 1;
                        if (i10 > 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Arrays.fill(zArr2, i8, i13, z);
                        i8 += i - 1;
                    }
                }
                return zArr2;
            } catch (MP1 e2) {
                throw C2605Bx0.b(e2);
            }
        }
        throw C2605Bx0.a();
    }

    public C9753tW c(C5398bk c5398bk) throws C2605Bx0 {
        this.a = c5398bk;
        boolean[] b2 = b(d(c5398bk.a()));
        C9753tW c9753tW = new C9753tW(a(b2), f(b2), null, null);
        c9753tW.n(b2.length);
        return c9753tW;
    }

    public final boolean[] d(C2469An c2469An) {
        int i;
        int i2;
        boolean e2 = this.a.e();
        int d2 = this.a.d();
        if (e2) {
            i = 11;
        } else {
            i = 14;
        }
        int i3 = i + (d2 << 2);
        int[] iArr = new int[i3];
        boolean[] zArr = new boolean[k(d2, e2)];
        int i4 = 2;
        if (e2) {
            for (int i5 = 0; i5 < i3; i5++) {
                iArr[i5] = i5;
            }
        } else {
            int i6 = i3 / 2;
            int i7 = ((i3 + 1) + (((i6 - 1) / 15) * 2)) / 2;
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = (i8 / 15) + i8;
                iArr[(i6 - i8) - 1] = (i7 - i9) - 1;
                iArr[i6 + i8] = i9 + i7 + 1;
            }
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < d2) {
            int i12 = (d2 - i10) << i4;
            if (e2) {
                i2 = 9;
            } else {
                i2 = 12;
            }
            int i13 = i12 + i2;
            int i14 = i10 << 1;
            int i15 = (i3 - 1) - i14;
            int i16 = 0;
            while (i16 < i13) {
                int i17 = i16 << 1;
                int i18 = 0;
                while (i18 < i4) {
                    int i19 = i14 + i18;
                    int i20 = i14 + i16;
                    zArr[i11 + i17 + i18] = c2469An.f(iArr[i19], iArr[i20]);
                    int i21 = i15 - i18;
                    zArr[(i13 * 2) + i11 + i17 + i18] = c2469An.f(iArr[i20], iArr[i21]);
                    int i22 = iArr[i21];
                    int i23 = i15 - i16;
                    zArr[(i13 * 4) + i11 + i17 + i18] = c2469An.f(i22, iArr[i23]);
                    zArr[(i13 * 6) + i11 + i17 + i18] = c2469An.f(iArr[i23], iArr[i19]);
                    i18++;
                    i4 = 2;
                }
                i16++;
                i4 = 2;
            }
            i11 += i13 << 3;
            i10++;
            i4 = 2;
        }
        return zArr;
    }
}

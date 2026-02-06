package o;

import com.facebook.internal.H;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8046mW0(name = "-SegmentedByteString")
@InterfaceC8303na2({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n63#1,12:252\n85#1,14:264\n85#1,14:278\n85#1,14:292\n85#1,14:306\n63#1,12:320\n1#2:251\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n*L\n147#1:252,12\n160#1:264,14\n182#1:278,14\n202#1:292,14\n219#1:306,14\n239#1:320,12\n*E\n"})
/* renamed from: o.o  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8404o {
    public static final int a(@NotNull int[] iArr, int i, int i2, int i3) {
        C6562gT0.p(iArr, "<this>");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 > i) {
                i4 = i5 - 1;
            } else {
                return i5;
            }
        }
        return (-i2) - 1;
    }

    public static final void b(@NotNull VZ1 vz1, int i, @NotNull byte[] bArr, int i2, int i3) {
        int i4;
        C6562gT0.p(vz1, "<this>");
        C6562gT0.p(bArr, "target");
        long j = i3;
        C8648p.e(vz1.g0(), i, j);
        C8648p.e(bArr.length, i2, j);
        int i5 = i3 + i;
        int n = n(vz1, i);
        while (i < i5) {
            if (n == 0) {
                i4 = 0;
            } else {
                i4 = vz1.v0()[n - 1];
            }
            int i6 = vz1.v0()[vz1.w0().length + n];
            int min = Math.min(i5, (vz1.v0()[n] - i4) + i4) - i;
            int i7 = i6 + (i - i4);
            C4788Ye.v0(vz1.w0()[n], bArr, i2, i7, i7 + min);
            i2 += min;
            i += min;
            n++;
        }
    }

    public static final boolean c(@NotNull VZ1 vz1, @Nullable Object obj) {
        C6562gT0.p(vz1, "<this>");
        if (obj == vz1) {
            return true;
        }
        if (obj instanceof C8859ps) {
            C8859ps c8859ps = (C8859ps) obj;
            if (c8859ps.g0() == vz1.g0() && vz1.X(0, c8859ps, 0, vz1.g0())) {
                return true;
            }
        }
        return false;
    }

    public static final int d(@NotNull VZ1 vz1) {
        C6562gT0.p(vz1, "<this>");
        return vz1.v0()[vz1.w0().length - 1];
    }

    public static final int e(@NotNull VZ1 vz1) {
        C6562gT0.p(vz1, "<this>");
        int x = vz1.x();
        if (x != 0) {
            return x;
        }
        int length = vz1.w0().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = vz1.v0()[length + i];
            int i5 = vz1.v0()[i];
            byte[] bArr = vz1.w0()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        vz1.b0(i2);
        return i2;
    }

    public static final byte f(@NotNull VZ1 vz1, int i) {
        int i2;
        C6562gT0.p(vz1, "<this>");
        C8648p.e(vz1.v0()[vz1.w0().length - 1], i, 1L);
        int n = n(vz1, i);
        if (n == 0) {
            i2 = 0;
        } else {
            i2 = vz1.v0()[n - 1];
        }
        return vz1.w0()[n][(i - i2) + vz1.v0()[vz1.w0().length + n]];
    }

    public static final boolean g(@NotNull VZ1 vz1, int i, @NotNull C8859ps c8859ps, int i2, int i3) {
        int i4;
        C6562gT0.p(vz1, "<this>");
        C6562gT0.p(c8859ps, "other");
        if (i < 0 || i > vz1.g0() - i3) {
            return false;
        }
        int i5 = i3 + i;
        int n = n(vz1, i);
        while (i < i5) {
            if (n == 0) {
                i4 = 0;
            } else {
                i4 = vz1.v0()[n - 1];
            }
            int i6 = vz1.v0()[vz1.w0().length + n];
            int min = Math.min(i5, (vz1.v0()[n] - i4) + i4) - i;
            if (!c8859ps.Y(i2, vz1.w0()[n], i6 + (i - i4), min)) {
                return false;
            }
            i2 += min;
            i += min;
            n++;
        }
        return true;
    }

    public static final boolean h(@NotNull VZ1 vz1, int i, @NotNull byte[] bArr, int i2, int i3) {
        int i4;
        C6562gT0.p(vz1, "<this>");
        C6562gT0.p(bArr, "other");
        if (i < 0 || i > vz1.g0() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int n = n(vz1, i);
        while (i < i5) {
            if (n == 0) {
                i4 = 0;
            } else {
                i4 = vz1.v0()[n - 1];
            }
            int i6 = vz1.v0()[vz1.w0().length + n];
            int min = Math.min(i5, (vz1.v0()[n] - i4) + i4) - i;
            if (!C8648p.d(vz1.w0()[n], i6 + (i - i4), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            n++;
        }
        return true;
    }

    @NotNull
    public static final C8859ps i(@NotNull VZ1 vz1, int i, int i2) {
        C6562gT0.p(vz1, "<this>");
        int l = C8648p.l(vz1, i2);
        if (i >= 0) {
            if (l <= vz1.g0()) {
                int i3 = l - i;
                if (i3 >= 0) {
                    if (i == 0 && l == vz1.g0()) {
                        return vz1;
                    }
                    if (i == l) {
                        return C8859ps.Z0;
                    }
                    int n = n(vz1, i);
                    int n2 = n(vz1, l - 1);
                    byte[][] bArr = (byte[][]) C4788Ye.l1(vz1.w0(), n, n2 + 1);
                    int[] iArr = new int[bArr.length * 2];
                    int i4 = 0;
                    if (n <= n2) {
                        int i5 = n;
                        int i6 = 0;
                        while (true) {
                            iArr[i6] = Math.min(vz1.v0()[i5] - i, i3);
                            int i7 = i6 + 1;
                            iArr[i6 + bArr.length] = vz1.v0()[vz1.w0().length + i5];
                            if (i5 == n2) {
                                break;
                            }
                            i5++;
                            i6 = i7;
                        }
                    }
                    if (n != 0) {
                        i4 = vz1.v0()[n - 1];
                    }
                    int length = bArr.length;
                    iArr[length] = iArr[length] + (i - i4);
                    return new VZ1(bArr, iArr);
                }
                throw new IllegalArgumentException(("endIndex=" + l + " < beginIndex=" + i).toString());
            }
            throw new IllegalArgumentException(("endIndex=" + l + " > length(" + vz1.g0() + ')').toString());
        }
        throw new IllegalArgumentException(("beginIndex=" + i + " < 0").toString());
    }

    @NotNull
    public static final byte[] j(@NotNull VZ1 vz1) {
        C6562gT0.p(vz1, "<this>");
        byte[] bArr = new byte[vz1.g0()];
        int length = vz1.w0().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = vz1.v0()[length + i];
            int i5 = vz1.v0()[i];
            int i6 = i5 - i2;
            C4788Ye.v0(vz1.w0()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public static final void k(@NotNull VZ1 vz1, @NotNull C5422bq c5422bq, int i, int i2) {
        int i3;
        C6562gT0.p(vz1, "<this>");
        C6562gT0.p(c5422bq, H.a.b);
        int i4 = i + i2;
        int n = n(vz1, i);
        while (i < i4) {
            if (n == 0) {
                i3 = 0;
            } else {
                i3 = vz1.v0()[n - 1];
            }
            int i5 = vz1.v0()[vz1.w0().length + n];
            int min = Math.min(i4, (vz1.v0()[n] - i3) + i3) - i;
            int i6 = i5 + (i - i3);
            PZ1 pz1 = new PZ1(vz1.w0()[n], i6, i6 + min, true, false);
            PZ1 pz12 = c5422bq.X;
            if (pz12 == null) {
                pz1.g = pz1;
                pz1.f = pz1;
                c5422bq.X = pz1;
            } else {
                C6562gT0.m(pz12);
                PZ1 pz13 = pz12.g;
                C6562gT0.m(pz13);
                pz13.c(pz1);
            }
            i += min;
            n++;
        }
        c5422bq.R(c5422bq.size() + i2);
    }

    public static final void l(VZ1 vz1, int i, int i2, XA0<? super byte[], ? super Integer, ? super Integer, C7458kA2> xa0) {
        int i3;
        int n = n(vz1, i);
        while (i < i2) {
            if (n == 0) {
                i3 = 0;
            } else {
                i3 = vz1.v0()[n - 1];
            }
            int i4 = vz1.v0()[vz1.w0().length + n];
            int min = Math.min(i2, (vz1.v0()[n] - i3) + i3) - i;
            xa0.P(vz1.w0()[n], Integer.valueOf(i4 + (i - i3)), Integer.valueOf(min));
            i += min;
            n++;
        }
    }

    public static final void m(@NotNull VZ1 vz1, @NotNull XA0<? super byte[], ? super Integer, ? super Integer, C7458kA2> xa0) {
        C6562gT0.p(vz1, "<this>");
        C6562gT0.p(xa0, "action");
        int length = vz1.w0().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = vz1.v0()[length + i];
            int i4 = vz1.v0()[i];
            xa0.P(vz1.w0()[i], Integer.valueOf(i3), Integer.valueOf(i4 - i2));
            i++;
            i2 = i4;
        }
    }

    public static final int n(@NotNull VZ1 vz1, int i) {
        C6562gT0.p(vz1, "<this>");
        int a = a(vz1.v0(), i + 1, 0, vz1.w0().length);
        if (a >= 0) {
            return a;
        }
        return ~a;
    }
}

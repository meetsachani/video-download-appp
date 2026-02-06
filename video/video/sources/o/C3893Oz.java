package o;

@Deprecated
/* renamed from: o.Oz  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3893Oz {
    public static final String a = "CeaUtil";
    public static final int b = 1195456820;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 181;
    public static final int f = 49;
    public static final int g = 47;

    public static void a(long j, C3012Fy1 c3012Fy1, InterfaceC10568wr2[] interfaceC10568wr2Arr) {
        int i;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (c3012Fy1.a() > 1) {
                int c2 = c(c3012Fy1);
                int c3 = c(c3012Fy1);
                int f2 = c3012Fy1.f() + c3;
                if (c3 != -1 && c3 <= c3012Fy1.a()) {
                    if (c2 == 4 && c3 >= 8) {
                        int L = c3012Fy1.L();
                        int R = c3012Fy1.R();
                        if (R == 49) {
                            i = c3012Fy1.s();
                        } else {
                            i = 0;
                        }
                        int L2 = c3012Fy1.L();
                        if (R == 47) {
                            c3012Fy1.Z(1);
                        }
                        if (L == 181 && ((R == 49 || R == 47) && L2 == 3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (R == 49) {
                            if (i != 1195456820) {
                                z2 = false;
                            }
                            z &= z2;
                        }
                        if (z) {
                            b(j, c3012Fy1, interfaceC10568wr2Arr);
                        }
                    }
                } else {
                    I31.n(a, "Skipping remainder of malformed SEI NAL unit.");
                    f2 = c3012Fy1.g();
                }
                c3012Fy1.Y(f2);
            } else {
                return;
            }
        }
    }

    public static void b(long j, C3012Fy1 c3012Fy1, InterfaceC10568wr2[] interfaceC10568wr2Arr) {
        long j2;
        int L = c3012Fy1.L();
        if ((L & 64) != 0) {
            c3012Fy1.Z(1);
            int i = (L & 31) * 3;
            int f2 = c3012Fy1.f();
            int length = interfaceC10568wr2Arr.length;
            int i2 = 0;
            while (i2 < length) {
                InterfaceC10568wr2 interfaceC10568wr2 = interfaceC10568wr2Arr[i2];
                c3012Fy1.Y(f2);
                interfaceC10568wr2.e(c3012Fy1, i);
                if (j != C10323vs.b) {
                    j2 = j;
                    interfaceC10568wr2.b(j2, 1, i, 0, null);
                } else {
                    j2 = j;
                }
                i2++;
                j = j2;
            }
        }
    }

    public static int c(C3012Fy1 c3012Fy1) {
        int i = 0;
        while (c3012Fy1.a() != 0) {
            int L = c3012Fy1.L();
            i += L;
            if (L != 255) {
                return i;
            }
        }
        return -1;
    }
}

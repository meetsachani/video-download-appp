package o;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

@Deprecated
/* loaded from: classes2.dex */
public final class A92 {
    public static final int b = 1751476579;
    public static final int c = 4096;
    public static final int a = 1903435808;
    public static final int[] d = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, AbstractC4501Vf.h, AbstractC4501Vf.k, AbstractC4501Vf.l, AbstractC4501Vf.q, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, a, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : d) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        return c(interfaceC4421Uj0, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(InterfaceC4421Uj0 interfaceC4421Uj0, boolean z, boolean z2) throws IOException {
        boolean z3;
        boolean z4;
        int i;
        int i2;
        long length = interfaceC4421Uj0.getLength();
        long j = -1;
        int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j2 = PlaybackStateCompat.t1;
        if (i3 != 0 && length <= PlaybackStateCompat.t1) {
            j2 = length;
        }
        int i4 = (int) j2;
        C3012Fy1 c3012Fy1 = new C3012Fy1(64);
        int i5 = 0;
        int i6 = 0;
        boolean z5 = false;
        while (i6 < i4) {
            c3012Fy1.U(8);
            if (!interfaceC4421Uj0.h(c3012Fy1.e(), i5, 8, true)) {
                break;
            }
            long N = c3012Fy1.N();
            int s = c3012Fy1.s();
            if (N == 1) {
                interfaceC4421Uj0.x(c3012Fy1.e(), 8, 8);
                c3012Fy1.X(16);
                z4 = i5;
                i = i6;
                i2 = 16;
                N = c3012Fy1.E();
            } else {
                if (N == 0) {
                    long length2 = interfaceC4421Uj0.getLength();
                    if (length2 != j) {
                        N = (length2 - interfaceC4421Uj0.n()) + 8;
                    }
                }
                z4 = i5;
                i = i6;
                i2 = 8;
            }
            long j3 = i2;
            if (N < j3) {
                return z4;
            }
            int i7 = i + i2;
            boolean z6 = z4;
            if (s == 1836019574) {
                i4 += (int) N;
                if (i3 != 0 && i4 > length) {
                    i4 = (int) length;
                }
                i6 = i7;
                i5 = z6 ? 1 : 0;
                j = -1;
            } else if (s != 1836019558 && s != 1836475768) {
                int i8 = i3;
                if ((i7 + N) - j3 >= i4) {
                    break;
                }
                int i9 = (int) (N - j3);
                i6 = i7 + i9;
                if (s == 1718909296) {
                    if (i9 < 8) {
                        return z6;
                    }
                    c3012Fy1.U(i9);
                    interfaceC4421Uj0.x(c3012Fy1.e(), z6 ? 1 : 0, i9);
                    int i10 = i9 / 4;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= i10) {
                            break;
                        }
                        if (i11 == 1) {
                            c3012Fy1.Z(4);
                        } else if (a(c3012Fy1.s(), z2)) {
                            z5 = true;
                            break;
                        }
                        i11++;
                    }
                    if (!z5) {
                        return false;
                    }
                } else if (i9 != 0) {
                    interfaceC4421Uj0.p(i9);
                }
                i3 = i8;
                j = -1;
                i5 = 0;
            } else {
                z3 = true;
                break;
            }
        }
        z3 = false;
        if (z5 && z == z3) {
            return true;
        }
        return false;
    }

    public static boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        return c(interfaceC4421Uj0, false, false);
    }

    public static boolean e(InterfaceC4421Uj0 interfaceC4421Uj0, boolean z) throws IOException {
        return c(interfaceC4421Uj0, false, z);
    }
}

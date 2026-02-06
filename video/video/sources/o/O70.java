package o;

import java.nio.ByteBuffer;
import java.util.Arrays;
import o.C10833xx0;

@Deprecated
/* loaded from: classes2.dex */
public final class O70 {
    public static final int a = 192000;
    public static final int b = 2250000;
    public static final int c = 2147385345;
    public static final int d = 536864768;
    public static final int e = -25230976;
    public static final int f = -14745368;
    public static final int g = 622876772;
    public static final int h = -233094848;
    public static final int i = -398277519;
    public static final byte j = Byte.MAX_VALUE;
    public static final byte k = 31;
    public static final byte l = -2;
    public static final byte m = -1;
    public static final int[] n = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f562o = {-1, 8000, 16000, C9948uJ1.h, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] p = {64, 112, 128, CK1.x, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, com.facebook.internal.q0.q1, I3.g, 1920, 2048, 2304, 2560, 2688, OZ1.i, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(byte[] bArr) {
        int i2;
        byte b2;
        int i3;
        int i4;
        byte b3;
        boolean z = false;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 != -1) {
                if (b4 != 31) {
                    i2 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                    b2 = bArr[7];
                } else {
                    i4 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                    b3 = bArr[8];
                }
            } else {
                i4 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b3 = bArr[9];
            }
            i3 = (((b3 & 60) >> 2) | i4) + 1;
            z = true;
            if (!z) {
                return (i3 * 16) / 14;
            }
            return i3;
        }
        i2 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b2 = bArr[6];
        i3 = (((b2 & 240) >> 4) | i2) + 1;
        if (!z) {
        }
    }

    public static C2903Ey1 b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new C2903Ey1(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (c(copyOf)) {
            for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                byte b2 = copyOf[i2];
                int i3 = i2 + 1;
                copyOf[i2] = copyOf[i3];
                copyOf[i3] = b2;
            }
        }
        C2903Ey1 c2903Ey1 = new C2903Ey1(copyOf);
        if (copyOf[0] == 31) {
            C2903Ey1 c2903Ey12 = new C2903Ey1(copyOf);
            while (c2903Ey12.b() >= 16) {
                c2903Ey12.s(2);
                c2903Ey1.f(c2903Ey12.h(14), 14);
            }
        }
        c2903Ey1.o(copyOf);
        return c2903Ey1;
    }

    public static boolean c(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 != -2 && b2 != -1) {
            return false;
        }
        return true;
    }

    public static boolean d(int i2) {
        if (i2 != 2147385345 && i2 != -25230976 && i2 != 536864768 && i2 != -14745368) {
            return false;
        }
        return true;
    }

    public static int e(ByteBuffer byteBuffer) {
        int i2;
        byte b2;
        int i3;
        byte b3;
        if (byteBuffer.getInt(0) != -233094848 && byteBuffer.getInt(0) != -398277519) {
            if (byteBuffer.getInt(0) == 622876772) {
                return 4096;
            }
            int position = byteBuffer.position();
            byte b4 = byteBuffer.get(position);
            if (b4 != -2) {
                if (b4 != -1) {
                    if (b4 != 31) {
                        i2 = (byteBuffer.get(position + 4) & 1) << 6;
                        b2 = byteBuffer.get(position + 5);
                    } else {
                        i2 = (byteBuffer.get(position + 5) & 7) << 4;
                        b3 = byteBuffer.get(position + 6);
                    }
                } else {
                    i2 = (byteBuffer.get(position + 4) & 7) << 4;
                    b3 = byteBuffer.get(position + 7);
                }
                i3 = b3 & 60;
                return (((i3 >> 2) | i2) + 1) * 32;
            }
            i2 = (byteBuffer.get(position + 5) & 1) << 6;
            b2 = byteBuffer.get(position + 4);
            i3 = b2 & C3307Iz.T;
            return (((i3 >> 2) | i2) + 1) * 32;
        }
        return 1024;
    }

    public static int f(byte[] bArr) {
        int i2;
        byte b2;
        int i3;
        byte b3;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 != -1) {
                if (b4 != 31) {
                    i2 = (bArr[4] & 1) << 6;
                    b2 = bArr[5];
                } else {
                    i2 = (bArr[5] & 7) << 4;
                    b3 = bArr[6];
                }
            } else {
                i2 = (bArr[4] & 7) << 4;
                b3 = bArr[7];
            }
            i3 = b3 & 60;
            return (((i3 >> 2) | i2) + 1) * 32;
        }
        i2 = (bArr[5] & 1) << 6;
        b2 = bArr[4];
        i3 = b2 & C3307Iz.T;
        return (((i3 >> 2) | i2) + 1) * 32;
    }

    public static C10833xx0 g(byte[] bArr, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 C6960i70 c6960i70) {
        int i2;
        int i3;
        C2903Ey1 b2 = b(bArr);
        b2.s(60);
        int i4 = n[b2.h(6)];
        int i5 = f562o[b2.h(4)];
        int h2 = b2.h(5);
        int[] iArr = p;
        if (h2 >= iArr.length) {
            i2 = -1;
        } else {
            i2 = (iArr[h2] * 1000) / 2;
        }
        b2.s(10);
        if (b2.h(2) > 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        return new C10833xx0.b().U(str).g0(C4128Rj1.V).I(i2).J(i4 + i3).h0(i5).O(c6960i70).X(str2).G();
    }
}

package androidx.camera.core;

import android.util.Size;
import androidx.camera.core.g;
import java.nio.ByteBuffer;
import o.UE;

/* loaded from: classes.dex */
public final class h {

    /* loaded from: classes.dex */
    public class a implements g.a {
        public final ByteBuffer a;
        public final /* synthetic */ byte[] b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        public a(byte[] bArr, int i, int i2) {
            this.b = bArr;
            this.c = i;
            this.d = i2;
            this.a = ByteBuffer.wrap(bArr);
        }

        @Override // androidx.camera.core.g.a
        public ByteBuffer B() {
            return this.a;
        }

        @Override // androidx.camera.core.g.a
        public int C() {
            return this.c;
        }

        @Override // androidx.camera.core.g.a
        public int D() {
            return this.d;
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.NEAREST_NEIGHBOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.AVERAGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        NEAREST_NEIGHBOR,
        AVERAGING
    }

    /* loaded from: classes.dex */
    public static final class d extends androidx.camera.core.b {
        public final g.a[] Y0;
        public final int Z0;
        public final int a1;

        public d(g gVar, g.a[] aVarArr, int i, int i2) {
            super(gVar);
            this.Y0 = aVarArr;
            this.Z0 = i;
            this.a1 = i2;
        }

        @Override // androidx.camera.core.b, androidx.camera.core.g
        public g.a[] f3() {
            return this.Y0;
        }

        @Override // androidx.camera.core.b, androidx.camera.core.g
        public int getHeight() {
            return this.a1;
        }

        @Override // androidx.camera.core.b, androidx.camera.core.g
        public int getWidth() {
            return this.Z0;
        }
    }

    public static g.a a(int i, int i2, byte[] bArr) {
        return new a(bArr, i, i2);
    }

    public static androidx.camera.core.b b(g gVar, int i, int i2, c cVar) {
        byte[] bArr;
        int i3;
        byte[] bArr2;
        if (gVar.getFormat() == 35) {
            if (gVar.getWidth() >= i && gVar.getHeight() >= i2) {
                if (gVar.getWidth() == i && gVar.getHeight() == i2) {
                    return new d(gVar, gVar.f3(), i, i2);
                }
                int[] iArr = {gVar.getWidth(), gVar.getWidth() / 2, gVar.getWidth() / 2};
                int[] iArr2 = {gVar.getHeight(), gVar.getHeight() / 2, gVar.getHeight() / 2};
                int i4 = i / 2;
                int[] iArr3 = {i, i4, i4};
                int i5 = i2 / 2;
                int[] iArr4 = {i2, i5, i5};
                g.a[] aVarArr = new g.a[3];
                for (int i6 = 0; i6 < 3; i6++) {
                    g.a aVar = gVar.f3()[i6];
                    ByteBuffer B = aVar.B();
                    byte[] bArr3 = new byte[iArr3[i6] * iArr4[i6]];
                    int i7 = b.a[cVar.ordinal()];
                    if (i7 != 1) {
                        if (i7 != 2) {
                            bArr2 = bArr3;
                            i3 = 1;
                            aVarArr[i6] = a(iArr3[i6], i3, bArr2);
                        } else {
                            bArr = bArr3;
                            int i8 = iArr[i6];
                            int D = aVar.D();
                            int C = aVar.C();
                            i3 = 1;
                            c(B, i8, D, C, iArr2[i6], bArr, iArr3[i6], iArr4[i6]);
                        }
                    } else {
                        bArr = bArr3;
                        int i9 = iArr[i6];
                        int D2 = aVar.D();
                        int C2 = aVar.C();
                        i3 = 1;
                        d(B, i9, D2, C2, iArr2[i6], bArr, iArr3[i6], iArr4[i6]);
                    }
                    bArr2 = bArr;
                    aVarArr[i6] = a(iArr3[i6], i3, bArr2);
                }
                return new d(gVar, aVarArr, i, i2);
            }
            throw new IllegalArgumentException("Downsampled dimension " + new Size(i, i2) + " is not <= original dimension " + new Size(gVar.getWidth(), gVar.getHeight()) + UE.h);
        }
        throw new UnsupportedOperationException("Only YUV_420_888 format is currently supported.");
    }

    public static void c(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, byte[] bArr, int i5, int i6) {
        float f = i / i5;
        float f2 = i4 / i6;
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[i3];
        int[] iArr = new int[i5];
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8++) {
            iArr[i8] = ((int) (i8 * f)) * i2;
        }
        synchronized (byteBuffer) {
            try {
                byteBuffer.rewind();
                int i9 = 0;
                while (i9 < i6) {
                    int i10 = (int) (i9 * f2);
                    int i11 = i4 - 1;
                    int i12 = i9 * i5;
                    byteBuffer.position(Math.min(i10, i11) * i3);
                    byteBuffer.get(bArr2, i7, Math.min(i3, byteBuffer.remaining()));
                    byteBuffer.position(Math.min(i10 + 1, i11) * i3);
                    byteBuffer.get(bArr3, i7, Math.min(i3, byteBuffer.remaining()));
                    for (int i13 = i7; i13 < i5; i13++) {
                        int i14 = iArr[i13];
                        bArr[i12 + i13] = (byte) ((((((bArr2[i14] & 255) + (bArr2[i14 + i2] & 255)) + (bArr3[i14] & 255)) + (bArr3[i14 + i2] & 255)) / 4) & 255);
                    }
                    i9++;
                    i7 = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void d(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, byte[] bArr, int i5, int i6) {
        float f = i / i5;
        float f2 = i4 / i6;
        byte[] bArr2 = new byte[i3];
        int[] iArr = new int[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            iArr[i7] = ((int) (i7 * f)) * i2;
        }
        synchronized (byteBuffer) {
            try {
                byteBuffer.rewind();
                for (int i8 = 0; i8 < i6; i8++) {
                    int i9 = i8 * i5;
                    byteBuffer.position(Math.min((int) (i8 * f2), i4 - 1) * i3);
                    byteBuffer.get(bArr2, 0, Math.min(i3, byteBuffer.remaining()));
                    for (int i10 = 0; i10 < i5; i10++) {
                        bArr[i9 + i10] = bArr2[iArr[i10]];
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

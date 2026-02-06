package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;

/* renamed from: com.facebook.ads.redexgen.X.kx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1926kx implements LU<Bitmap> {
    public static byte[] A06;
    public final int A00;
    public final int A01;
    public final String A02 = C1926kx.class.getSimpleName();
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-110, C2638Cg0.n7, -47, -44, 3, 42, 53, C3307Iz.f0, 34, 49, C2638Cg0.C7, 42, 52, C2638Cg0.C7, 47, 54, C3307Iz.e0, C3307Iz.e0, C2638Cg0.v7, -4, -25, -23, -12, -8, -19, -13, -14, -92, -24, -7, -10, -19, -14, -21, -92, -22, -19, -16, -23, -92, -25, -13, -15, -12, -10, -23, -9, -9, -19, -13, -14};
    }

    public C1926kx(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A01 = i;
        this.A00 = i2;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = z3;
    }

    public static LT<Bitmap> A00(Throwable th) {
        return new LT<>(false, null, th);
    }

    private void A03(File file, Bitmap bitmap) throws IOException {
        if (bitmap == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            ByteArrayOutputStream compressedBitmapOS = new ByteArrayOutputStream();
            byteArrayOutputStream = compressedBitmapOS;
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            if (byteArrayOutputStream.size() >= 3145728) {
                return;
            }
            String str = file.getCanonicalPath() + A01(0, 4, 25);
            File file2 = new File(str);
            file2.createNewFile();
            fileOutputStream = new FileOutputStream(str);
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.flush();
            fileInputStream = new FileInputStream(str);
            fileOutputStream2 = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream2.write(bArr, 0, read);
                } else {
                    file2.delete();
                    return;
                }
            }
        } finally {
            AbstractC0893Ln.A07(byteArrayOutputStream);
            AbstractC0893Ln.A07(fileOutputStream);
            AbstractC0893Ln.A07(fileInputStream);
            AbstractC0893Ln.A07(fileOutputStream2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.LU
    public final LT<Bitmap> A3x(File file, InterfaceC0892Lm interfaceC0892Lm) {
        if (!this.A04) {
            return new LT<>(true, null);
        }
        try {
            Bitmap A03 = AbstractC0893Ln.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
            if (A03 != null) {
                return new LT<>(true, A03);
            }
            interfaceC0892Lm.AB4(new C1917kn(A01(4, 14, 118)));
            return A00(null);
        } catch (Throwable t) {
            file.delete();
            interfaceC0892Lm.AB4(t);
            return A00(t);
        }
    }

    @Override // com.facebook.ads.redexgen.X.LU
    public final void A5D(File file, InterfaceC0892Lm interfaceC0892Lm) throws C1917kn {
        if (this.A03) {
            try {
                Bitmap bitmap = AbstractC0893Ln.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
                if (bitmap != null) {
                    A03(file, bitmap);
                } else {
                    file.delete();
                    throw new C1917kn(A01(4, 14, 118));
                }
            } catch (C1917kn e) {
                interfaceC0892Lm.ABI(e);
                throw e;
            } catch (Throwable th) {
                interfaceC0892Lm.ABI(th);
                Throwable t = new C1917kn(A01(18, 33, 57), th);
                throw t;
            }
        }
    }
}

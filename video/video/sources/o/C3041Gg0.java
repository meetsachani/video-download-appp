package o;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
import o.C2540Bg0;

/* renamed from: o.Gg0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3041Gg0 extends FilterOutputStream {
    public static final String b1 = "ExifOutputStream";
    public static final boolean c1 = false;
    public static final int d1 = 65536;
    public static final int e1 = 0;
    public static final int f1 = 1;
    public static final int g1 = 2;
    public static final byte[] h1 = C9276rZ.h.getBytes(C2442Ag0.g);
    public static final short i1 = 18761;
    public static final short j1 = 19789;
    public static final byte k1 = 42;
    public static final int l1 = 8;
    public final C2540Bg0 X;
    public final byte[] Y;
    public int Y0;
    public final ByteBuffer Z;
    public int Z0;
    public int a1;

    /* renamed from: o.Gg0$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static final short a = -40;
        public static final short b = -31;
        public static final short c = -39;
        public static final short d = -64;
        public static final short e = -49;
        public static final short f = -60;
        public static final short g = -56;
        public static final short h = -52;

        public static boolean a(short s) {
            if (s >= -64 && s <= -49 && s != -60 && s != -56 && s != -52) {
                return true;
            }
            return false;
        }
    }

    public C3041Gg0(OutputStream outputStream, C2540Bg0 c2540Bg0) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.Y = new byte[1];
        this.Z = ByteBuffer.allocate(4);
        this.Y0 = 0;
        this.X = c2540Bg0;
    }

    public final int a(int i, byte[] bArr, int i2, int i3) {
        int min = Math.min(i3, i - this.Z.position());
        this.Z.put(bArr, i2, min);
        return min;
    }

    public final void d(C6655gs c6655gs) throws IOException {
        C3237Ig0[] c3237Ig0Arr;
        short s;
        C3237Ig0[][] c3237Ig0Arr2 = C2540Bg0.f418o;
        int[] iArr = new int[c3237Ig0Arr2.length];
        int[] iArr2 = new int[c3237Ig0Arr2.length];
        for (C3237Ig0 c3237Ig0 : C2540Bg0.m) {
            for (int i = 0; i < C2540Bg0.f418o.length; i++) {
                this.X.d(i).remove(c3237Ig0.b);
            }
        }
        if (!this.X.d(1).isEmpty()) {
            this.X.d(0).put(C2540Bg0.m[1].b, C2442Ag0.i(0L, this.X.e()));
        }
        if (!this.X.d(2).isEmpty()) {
            this.X.d(0).put(C2540Bg0.m[2].b, C2442Ag0.i(0L, this.X.e()));
        }
        if (!this.X.d(3).isEmpty()) {
            this.X.d(1).put(C2540Bg0.m[3].b, C2442Ag0.i(0L, this.X.e()));
        }
        for (int i2 = 0; i2 < C2540Bg0.f418o.length; i2++) {
            int i3 = 0;
            for (Map.Entry<String, C2442Ag0> entry : this.X.d(i2).entrySet()) {
                int s2 = entry.getValue().s();
                if (s2 > 4) {
                    i3 += s2;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int i4 = 8;
        for (int i5 = 0; i5 < C2540Bg0.f418o.length; i5++) {
            if (!this.X.d(i5).isEmpty()) {
                iArr[i5] = i4;
                i4 += (this.X.d(i5).size() * 12) + 6 + iArr2[i5];
            }
        }
        int i6 = i4 + 8;
        if (!this.X.d(1).isEmpty()) {
            this.X.d(0).put(C2540Bg0.m[1].b, C2442Ag0.i(iArr[1], this.X.e()));
        }
        if (!this.X.d(2).isEmpty()) {
            this.X.d(0).put(C2540Bg0.m[2].b, C2442Ag0.i(iArr[2], this.X.e()));
        }
        if (!this.X.d(3).isEmpty()) {
            this.X.d(1).put(C2540Bg0.m[3].b, C2442Ag0.i(iArr[3], this.X.e()));
        }
        c6655gs.j(i6);
        c6655gs.write(h1);
        if (this.X.e() == ByteOrder.BIG_ENDIAN) {
            s = 19789;
        } else {
            s = 18761;
        }
        c6655gs.h(s);
        c6655gs.a(this.X.e());
        c6655gs.j(42);
        c6655gs.i(8L);
        for (int i7 = 0; i7 < C2540Bg0.f418o.length; i7++) {
            if (!this.X.d(i7).isEmpty()) {
                c6655gs.j(this.X.d(i7).size());
                int size = iArr[i7] + 2 + (this.X.d(i7).size() * 12) + 4;
                for (Map.Entry<String, C2442Ag0> entry2 : this.X.d(i7).entrySet()) {
                    int i8 = ((C3237Ig0) C10907yF1.m(C2540Bg0.b.g.get(i7).get(entry2.getKey()), "Tag not supported: " + entry2.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).a;
                    C2442Ag0 value = entry2.getValue();
                    int s3 = value.s();
                    c6655gs.j(i8);
                    c6655gs.j(value.a);
                    c6655gs.f(value.b);
                    if (s3 > 4) {
                        c6655gs.i(size);
                        size += s3;
                    } else {
                        c6655gs.write(value.d);
                        if (s3 < 4) {
                            while (s3 < 4) {
                                c6655gs.d(0);
                                s3++;
                            }
                        }
                    }
                }
                c6655gs.i(0L);
                for (Map.Entry<String, C2442Ag0> entry3 : this.X.d(i7).entrySet()) {
                    byte[] bArr = entry3.getValue().d;
                    if (bArr.length > 4) {
                        c6655gs.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        c6655gs.a(ByteOrder.BIG_ENDIAN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
        if (r9 <= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010a, code lost:
        ((java.io.FilterOutputStream) r6).out.write(r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void write(byte[] bArr, int i, int i2) throws IOException {
        while (true) {
            int i3 = this.Z0;
            if ((i3 > 0 || this.a1 > 0 || this.Y0 != 2) && i2 > 0) {
                if (i3 > 0) {
                    int min = Math.min(i2, i3);
                    i2 -= min;
                    this.Z0 -= min;
                    i += min;
                }
                int i4 = this.a1;
                if (i4 > 0) {
                    int min2 = Math.min(i2, i4);
                    ((FilterOutputStream) this).out.write(bArr, i, min2);
                    i2 -= min2;
                    this.a1 -= min2;
                    i += min2;
                }
                if (i2 == 0) {
                    return;
                }
                int i5 = this.Y0;
                if (i5 == 0) {
                    int a2 = a(2, bArr, i, i2);
                    i += a2;
                    i2 -= a2;
                    if (this.Z.position() < 2) {
                        return;
                    }
                    this.Z.rewind();
                    if (this.Z.getShort() == -40) {
                        ((FilterOutputStream) this).out.write(this.Z.array(), 0, 2);
                        this.Y0 = 1;
                        this.Z.rewind();
                        C6655gs c6655gs = new C6655gs(((FilterOutputStream) this).out, ByteOrder.BIG_ENDIAN);
                        c6655gs.h((short) -31);
                        d(c6655gs);
                    } else {
                        throw new IOException("Not a valid jpeg image, cannot write exif");
                    }
                } else if (i5 != 1) {
                    continue;
                } else {
                    int a3 = a(4, bArr, i, i2);
                    i += a3;
                    i2 -= a3;
                    if (this.Z.position() == 2 && this.Z.getShort() == -39) {
                        ((FilterOutputStream) this).out.write(this.Z.array(), 0, 2);
                        this.Z.rewind();
                    }
                    if (this.Z.position() < 4) {
                        return;
                    }
                    this.Z.rewind();
                    short s = this.Z.getShort();
                    if (s == -31) {
                        this.Z0 = (this.Z.getShort() & Xx2.Y0) - 2;
                        this.Y0 = 2;
                    } else if (!a.a(s)) {
                        ((FilterOutputStream) this).out.write(this.Z.array(), 0, 4);
                        this.a1 = (this.Z.getShort() & Xx2.Y0) - 2;
                    } else {
                        ((FilterOutputStream) this).out.write(this.Z.array(), 0, 4);
                        this.Y0 = 2;
                    }
                    this.Z.rewind();
                }
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.Y;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}

package o;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import o.InterfaceC7225jD0;

/* renamed from: o.Kb2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3415Kb2 implements InterfaceC7225jD0 {
    public static final String A = "Kb2";
    public static final int B = 4096;
    public static final int C = -1;
    public static final int D = -1;
    public static final int E = 4;
    public static final int F = 255;
    public static final int G = 0;
    public int[] f;
    public final int[] g;
    public final InterfaceC7225jD0.a h;
    public ByteBuffer i;
    public byte[] j;
    public C9680tD0 k;
    public short[] l;
    public byte[] m;
    public byte[] n;

    /* renamed from: o  reason: collision with root package name */
    public byte[] f517o;
    public int[] p;
    public int q;
    public C9437sD0 r;
    public Bitmap s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public int x;
    public Boolean y;
    public Bitmap.Config z;

    public C3415Kb2(InterfaceC7225jD0.a aVar, C9437sD0 c9437sD0, ByteBuffer byteBuffer) {
        this(aVar, c9437sD0, byteBuffer, 1);
    }

    @Override // o.InterfaceC7225jD0
    public int a(InputStream inputStream, int i) {
        int i2;
        if (inputStream != null) {
            if (i > 0) {
                i2 = i + 4096;
            } else {
                i2 = 16384;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr, 0, 16384);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                Log.w(A, "Error reading data from stream", e);
            }
        } else {
            this.u = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                Log.w(A, "Error closing stream", e2);
            }
        }
        return this.u;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x003d, B:19:0x0047, B:21:0x004e, B:22:0x0058, B:24:0x0069, B:26:0x0075, B:30:0x007e, B:32:0x0082, B:34:0x008a, B:35:0x00a0, B:38:0x00a4, B:40:0x00a8, B:42:0x00ba, B:44:0x00be, B:45:0x00c2, B:29:0x007a, B:48:0x00c8, B:50:0x00d0, B:10:0x0011, B:12:0x0019, B:13:0x003b), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x003d, B:19:0x0047, B:21:0x004e, B:22:0x0058, B:24:0x0069, B:26:0x0075, B:30:0x007e, B:32:0x0082, B:34:0x008a, B:35:0x00a0, B:38:0x00a4, B:40:0x00a8, B:42:0x00ba, B:44:0x00be, B:45:0x00c2, B:29:0x007a, B:48:0x00c8, B:50:0x00d0, B:10:0x0011, B:12:0x0019, B:13:0x003b), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x003d, B:19:0x0047, B:21:0x004e, B:22:0x0058, B:24:0x0069, B:26:0x0075, B:30:0x007e, B:32:0x0082, B:34:0x008a, B:35:0x00a0, B:38:0x00a4, B:40:0x00a8, B:42:0x00ba, B:44:0x00be, B:45:0x00c2, B:29:0x007a, B:48:0x00c8, B:50:0x00d0, B:10:0x0011, B:12:0x0019, B:13:0x003b), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x003d, B:19:0x0047, B:21:0x004e, B:22:0x0058, B:24:0x0069, B:26:0x0075, B:30:0x007e, B:32:0x0082, B:34:0x008a, B:35:0x00a0, B:38:0x00a4, B:40:0x00a8, B:42:0x00ba, B:44:0x00be, B:45:0x00c2, B:29:0x007a, B:48:0x00c8, B:50:0x00d0, B:10:0x0011, B:12:0x0019, B:13:0x003b), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x003d, B:19:0x0047, B:21:0x004e, B:22:0x0058, B:24:0x0069, B:26:0x0075, B:30:0x007e, B:32:0x0082, B:34:0x008a, B:35:0x00a0, B:38:0x00a4, B:40:0x00a8, B:42:0x00ba, B:44:0x00be, B:45:0x00c2, B:29:0x007a, B:48:0x00c8, B:50:0x00d0, B:10:0x0011, B:12:0x0019, B:13:0x003b), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x003d, B:19:0x0047, B:21:0x004e, B:22:0x0058, B:24:0x0069, B:26:0x0075, B:30:0x007e, B:32:0x0082, B:34:0x008a, B:35:0x00a0, B:38:0x00a4, B:40:0x00a8, B:42:0x00ba, B:44:0x00be, B:45:0x00c2, B:29:0x007a, B:48:0x00c8, B:50:0x00d0, B:10:0x0011, B:12:0x0019, B:13:0x003b), top: B:55:0x0001 }] */
    @Override // o.InterfaceC7225jD0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized Bitmap b() {
        int i;
        String str;
        int i2;
        C8702pD0 c8702pD0;
        int[] iArr;
        try {
            if (this.r.c > 0) {
                if (this.q < 0) {
                }
                i = this.u;
                if (i != 1 && i != 2) {
                    this.u = 0;
                    if (this.j == null) {
                        this.j = this.h.b(255);
                    }
                    C8702pD0 c8702pD02 = this.r.e.get(this.q);
                    i2 = this.q - 1;
                    if (i2 < 0) {
                        c8702pD0 = this.r.e.get(i2);
                    } else {
                        c8702pD0 = null;
                    }
                    iArr = c8702pD02.k;
                    if (iArr != null) {
                        iArr = this.r.a;
                    }
                    this.f = iArr;
                    if (iArr != null) {
                        String str2 = A;
                        if (Log.isLoggable(str2, 3)) {
                            Log.d(str2, "No valid color table found for frame #" + this.q);
                        }
                        this.u = 1;
                        return null;
                    }
                    if (c8702pD02.f) {
                        System.arraycopy(iArr, 0, this.g, 0, iArr.length);
                        int[] iArr2 = this.g;
                        this.f = iArr2;
                        iArr2[c8702pD02.h] = 0;
                        if (c8702pD02.g == 2 && this.q == 0) {
                            this.y = Boolean.TRUE;
                        }
                    }
                    return z(c8702pD02, c8702pD0);
                }
                str = A;
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Unable to decode frame, status=" + this.u);
                }
                return null;
            }
            String str3 = A;
            if (Log.isLoggable(str3, 3)) {
                Log.d(str3, "Unable to decode frame, frameCount=" + this.r.c + ", framePointer=" + this.q);
            }
            this.u = 1;
            i = this.u;
            if (i != 1) {
                this.u = 0;
                if (this.j == null) {
                }
                C8702pD0 c8702pD022 = this.r.e.get(this.q);
                i2 = this.q - 1;
                if (i2 < 0) {
                }
                iArr = c8702pD022.k;
                if (iArr != null) {
                }
                this.f = iArr;
                if (iArr != null) {
                }
            }
            str = A;
            if (Log.isLoggable(str, 3)) {
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o.InterfaceC7225jD0
    public void c() {
        this.q = (this.q + 1) % this.r.c;
    }

    @Override // o.InterfaceC7225jD0
    public void clear() {
        this.r = null;
        byte[] bArr = this.f517o;
        if (bArr != null) {
            this.h.e(bArr);
        }
        int[] iArr = this.p;
        if (iArr != null) {
            this.h.f(iArr);
        }
        Bitmap bitmap = this.s;
        if (bitmap != null) {
            this.h.a(bitmap);
        }
        this.s = null;
        this.i = null;
        this.y = null;
        byte[] bArr2 = this.j;
        if (bArr2 != null) {
            this.h.e(bArr2);
        }
    }

    @Override // o.InterfaceC7225jD0
    public int d() {
        return this.r.c;
    }

    @Override // o.InterfaceC7225jD0
    public void e(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config != config3 && config != (config2 = Bitmap.Config.RGB_565)) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
        }
        this.z = config;
    }

    @Override // o.InterfaceC7225jD0
    public int f(int i) {
        if (i >= 0) {
            C9437sD0 c9437sD0 = this.r;
            if (i < c9437sD0.c) {
                return c9437sD0.e.get(i).i;
            }
            return -1;
        }
        return -1;
    }

    @Override // o.InterfaceC7225jD0
    public int g() {
        int i = this.r.m;
        if (i == -1) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        return i + 1;
    }

    @Override // o.InterfaceC7225jD0
    public ByteBuffer getData() {
        return this.i;
    }

    @Override // o.InterfaceC7225jD0
    public int getHeight() {
        return this.r.g;
    }

    @Override // o.InterfaceC7225jD0
    public int getWidth() {
        return this.r.f;
    }

    @Override // o.InterfaceC7225jD0
    public int h() {
        return this.u;
    }

    @Override // o.InterfaceC7225jD0
    @Deprecated
    public int i() {
        int i = this.r.m;
        if (i == -1) {
            return 1;
        }
        return i;
    }

    @Override // o.InterfaceC7225jD0
    public int j() {
        int i;
        if (this.r.c > 0 && (i = this.q) >= 0) {
            return f(i);
        }
        return 0;
    }

    @Override // o.InterfaceC7225jD0
    public synchronized void k(C9437sD0 c9437sD0, ByteBuffer byteBuffer, int i) {
        try {
            if (i > 0) {
                int highestOneBit = Integer.highestOneBit(i);
                this.u = 0;
                this.r = c9437sD0;
                this.q = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.i = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.i.order(ByteOrder.LITTLE_ENDIAN);
                this.t = false;
                Iterator<C8702pD0> it = c9437sD0.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().g == 3) {
                        this.t = true;
                        break;
                    }
                }
                this.v = highestOneBit;
                int i2 = c9437sD0.f;
                this.x = i2 / highestOneBit;
                int i3 = c9437sD0.g;
                this.w = i3 / highestOneBit;
                this.f517o = this.h.b(i2 * i3);
                this.p = this.h.d(this.x * this.w);
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o.InterfaceC7225jD0
    public void l() {
        this.q = -1;
    }

    @Override // o.InterfaceC7225jD0
    public synchronized void m(C9437sD0 c9437sD0, byte[] bArr) {
        o(c9437sD0, ByteBuffer.wrap(bArr));
    }

    @Override // o.InterfaceC7225jD0
    public int n() {
        return this.q;
    }

    @Override // o.InterfaceC7225jD0
    public synchronized void o(C9437sD0 c9437sD0, ByteBuffer byteBuffer) {
        k(c9437sD0, byteBuffer, 1);
    }

    @Override // o.InterfaceC7225jD0
    public int p() {
        return this.r.m;
    }

    @Override // o.InterfaceC7225jD0
    public int q() {
        return this.i.limit() + this.f517o.length + (this.p.length * 4);
    }

    public final int r(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.v + i; i9++) {
            byte[] bArr = this.f517o;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.v + i11; i12++) {
            byte[] bArr2 = this.f517o;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    @Override // o.InterfaceC7225jD0
    public synchronized int read(byte[] bArr) {
        try {
            C9437sD0 d = v().r(bArr).d();
            this.r = d;
            if (bArr != null) {
                m(d, bArr);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.u;
    }

    public final void s(C8702pD0 c8702pD0) {
        boolean z;
        boolean booleanValue;
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        int[] iArr = this.p;
        int i5 = c8702pD0.d;
        int i6 = this.v;
        int i7 = i5 / i6;
        int i8 = c8702pD0.b / i6;
        int i9 = c8702pD0.c / i6;
        int i10 = c8702pD0.a / i6;
        if (this.q == 0) {
            z = true;
        } else {
            z = false;
        }
        int i11 = this.x;
        int i12 = this.w;
        byte[] bArr = this.f517o;
        int[] iArr2 = this.f;
        Boolean bool = this.y;
        int i13 = 8;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1;
        while (i15 < i7) {
            int[] iArr3 = iArr;
            if (c8702pD0.e) {
                if (i14 >= i7) {
                    int i17 = i16 + 1;
                    i = i7;
                    if (i17 != 2) {
                        if (i17 != 3) {
                            if (i17 != 4) {
                                i16 = i17;
                            } else {
                                i16 = i17;
                                i14 = 1;
                                i13 = 2;
                            }
                        } else {
                            i16 = i17;
                            i13 = 4;
                            i14 = 2;
                        }
                    } else {
                        i16 = i17;
                        i14 = 4;
                    }
                } else {
                    i = i7;
                }
                i2 = i14 + i13;
            } else {
                i = i7;
                i2 = i14;
                i14 = i15;
            }
            int i18 = i14 + i8;
            if (i6 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i18 < i12) {
                int i19 = i18 * i11;
                int i20 = i19 + i10;
                int i21 = i20 + i9;
                int i22 = i19 + i11;
                if (i22 < i21) {
                    i21 = i22;
                }
                i3 = i2;
                int i23 = i15 * i6 * c8702pD0.c;
                if (z2) {
                    int i24 = i20;
                    while (i24 < i21) {
                        int i25 = i24;
                        int i26 = iArr2[bArr[i23] & 255];
                        if (i26 != 0) {
                            iArr3[i25] = i26;
                        } else if (z && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i23 += i6;
                        i24 = i25 + 1;
                    }
                } else {
                    int i27 = ((i21 - i20) * i6) + i23;
                    i4 = i6;
                    int i28 = i20;
                    while (i28 < i21) {
                        int i29 = i21;
                        int r = r(i23, i27, c8702pD0.c);
                        if (r != 0) {
                            iArr3[i28] = r;
                        } else if (z && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i23 += i4;
                        i28++;
                        i21 = i29;
                    }
                    i15++;
                    i6 = i4;
                    iArr = iArr3;
                    i7 = i;
                    i14 = i3;
                }
            } else {
                i3 = i2;
            }
            i4 = i6;
            i15++;
            i6 = i4;
            iArr = iArr3;
            i7 = i;
            i14 = i3;
        }
        if (this.y == null) {
            if (bool == null) {
                booleanValue = false;
            } else {
                booleanValue = bool.booleanValue();
            }
            this.y = Boolean.valueOf(booleanValue);
        }
    }

    public final void t(C8702pD0 c8702pD0) {
        boolean z;
        boolean z2;
        C8702pD0 c8702pD02 = c8702pD0;
        int[] iArr = this.p;
        int i = c8702pD02.d;
        int i2 = c8702pD02.b;
        int i3 = c8702pD02.c;
        int i4 = c8702pD02.a;
        if (this.q == 0) {
            z = true;
        } else {
            z = false;
        }
        int i5 = this.x;
        byte[] bArr = this.f517o;
        int[] iArr2 = this.f;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = c8702pD02.c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int[] iArr3 = iArr;
                int i13 = b2 & 255;
                if (i13 != b) {
                    int i14 = iArr2[i13];
                    if (i14 != 0) {
                        iArr3[i12] = i14;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                iArr = iArr3;
            }
            i6++;
            c8702pD02 = c8702pD0;
        }
        Boolean bool = this.y;
        if ((bool != null && bool.booleanValue()) || (this.y == null && z && b != -1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.y = Boolean.valueOf(z2);
    }

    public final void u(C8702pD0 c8702pD0) {
        int i;
        int i2;
        byte[] bArr;
        short s;
        C3415Kb2 c3415Kb2 = this;
        if (c8702pD0 != null) {
            c3415Kb2.i.position(c8702pD0.j);
        }
        if (c8702pD0 == null) {
            C9437sD0 c9437sD0 = c3415Kb2.r;
            i = c9437sD0.f;
            i2 = c9437sD0.g;
        } else {
            i = c8702pD0.c;
            i2 = c8702pD0.d;
        }
        int i3 = i * i2;
        byte[] bArr2 = c3415Kb2.f517o;
        if (bArr2 == null || bArr2.length < i3) {
            c3415Kb2.f517o = c3415Kb2.h.b(i3);
        }
        byte[] bArr3 = c3415Kb2.f517o;
        if (c3415Kb2.l == null) {
            c3415Kb2.l = new short[4096];
        }
        short[] sArr = c3415Kb2.l;
        if (c3415Kb2.m == null) {
            c3415Kb2.m = new byte[4096];
        }
        byte[] bArr4 = c3415Kb2.m;
        if (c3415Kb2.n == null) {
            c3415Kb2.n = new byte[androidx.fragment.app.j.I];
        }
        byte[] bArr5 = c3415Kb2.n;
        int y = c3415Kb2.y();
        int i4 = 1 << y;
        int i5 = i4 + 1;
        int i6 = i4 + 2;
        int i7 = y + 1;
        int i8 = (1 << i7) - 1;
        byte b = 0;
        for (int i9 = 0; i9 < i4; i9++) {
            sArr[i9] = 0;
            bArr4[i9] = (byte) i9;
        }
        byte[] bArr6 = c3415Kb2.j;
        int i10 = i7;
        int i11 = i6;
        int i12 = i8;
        int i13 = 0;
        int i14 = 0;
        byte b2 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = -1;
        while (true) {
            if (i13 >= i3) {
                break;
            }
            if (i14 == 0) {
                i14 = c3415Kb2.x();
                if (i14 <= 0) {
                    c3415Kb2.u = 3;
                    break;
                }
                b2 = b;
            }
            i16 += (bArr6[b2] & 255) << i15;
            b2++;
            i14--;
            int i21 = i15 + 8;
            int i22 = i11;
            int i23 = i10;
            int i24 = i20;
            short[] sArr2 = sArr;
            int i25 = i18;
            while (true) {
                bArr = bArr4;
                if (i21 >= i23) {
                    int i26 = i16 & i12;
                    i16 >>= i23;
                    i21 -= i23;
                    if (i26 == i4) {
                        i23 = i7;
                        i22 = i6;
                        i12 = i8;
                        bArr4 = bArr;
                        i24 = -1;
                    } else if (i26 == i5) {
                        i18 = i25;
                        i11 = i22;
                        break;
                    } else {
                        byte[] bArr7 = bArr5;
                        if (i24 == -1) {
                            bArr3[i17] = bArr[i26];
                            i17++;
                            i13++;
                            i24 = i26;
                            i25 = i24;
                            bArr4 = bArr;
                            bArr5 = bArr7;
                        } else {
                            if (i26 >= i22) {
                                bArr7[i19] = (byte) i25;
                                i19++;
                                s = i24;
                            } else {
                                s = i26;
                            }
                            while (s >= i4) {
                                bArr7[i19] = bArr[s];
                                i19++;
                                s = sArr2[s];
                            }
                            int i27 = bArr[s] & 255;
                            byte b3 = (byte) i27;
                            bArr3[i17] = b3;
                            while (true) {
                                i17++;
                                i13++;
                                if (i19 <= 0) {
                                    break;
                                }
                                i19--;
                                bArr3[i17] = bArr7[i19];
                            }
                            if (i22 < 4096) {
                                sArr2[i22] = (short) i24;
                                bArr[i22] = b3;
                                i22++;
                                if ((i22 & i12) == 0 && i22 < 4096) {
                                    i23++;
                                    i12 += i22;
                                }
                            }
                            i24 = i26;
                            bArr4 = bArr;
                            bArr5 = bArr7;
                            i25 = i27;
                        }
                    }
                } else {
                    i11 = i22;
                    i18 = i25;
                    break;
                }
            }
            i15 = i21;
            sArr = sArr2;
            bArr4 = bArr;
            b = 0;
            i20 = i24;
            i10 = i23;
            c3415Kb2 = this;
        }
        Arrays.fill(bArr3, i17, i3, b);
    }

    public final C9680tD0 v() {
        if (this.k == null) {
            this.k = new C9680tD0();
        }
        return this.k;
    }

    public final Bitmap w() {
        Bitmap.Config config;
        Boolean bool = this.y;
        if (bool != null && !bool.booleanValue()) {
            config = this.z;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap c = this.h.c(this.x, this.w, config);
        c.setHasAlpha(true);
        return c;
    }

    public final int x() {
        int y = y();
        if (y <= 0) {
            return y;
        }
        ByteBuffer byteBuffer = this.i;
        byteBuffer.get(this.j, 0, Math.min(y, byteBuffer.remaining()));
        return y;
    }

    public final int y() {
        return this.i.get() & 255;
    }

    public final Bitmap z(C8702pD0 c8702pD0, C8702pD0 c8702pD02) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.p;
        int i3 = 0;
        if (c8702pD02 == null) {
            Bitmap bitmap2 = this.s;
            if (bitmap2 != null) {
                this.h.a(bitmap2);
            }
            this.s = null;
            Arrays.fill(iArr, 0);
        }
        if (c8702pD02 != null && c8702pD02.g == 3 && this.s == null) {
            Arrays.fill(iArr, 0);
        }
        if (c8702pD02 != null && (i2 = c8702pD02.g) > 0) {
            if (i2 == 2) {
                if (!c8702pD0.f) {
                    C9437sD0 c9437sD0 = this.r;
                    int i4 = c9437sD0.l;
                    if (c8702pD0.k == null || c9437sD0.j != c8702pD0.h) {
                        i3 = i4;
                    }
                }
                int i5 = c8702pD02.d;
                int i6 = this.v;
                int i7 = i5 / i6;
                int i8 = c8702pD02.b / i6;
                int i9 = c8702pD02.c / i6;
                int i10 = c8702pD02.a / i6;
                int i11 = this.x;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.x;
                }
            } else if (i2 == 3 && (bitmap = this.s) != null) {
                int i16 = this.x;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.w);
            }
        }
        u(c8702pD0);
        if (!c8702pD0.e && this.v == 1) {
            t(c8702pD0);
        } else {
            s(c8702pD0);
        }
        if (this.t && ((i = c8702pD0.g) == 0 || i == 1)) {
            if (this.s == null) {
                this.s = w();
            }
            Bitmap bitmap3 = this.s;
            int i17 = this.x;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.w);
        }
        Bitmap w = w();
        int i18 = this.x;
        w.setPixels(iArr, 0, i18, 0, 0, i18, this.w);
        return w;
    }

    public C3415Kb2(InterfaceC7225jD0.a aVar, C9437sD0 c9437sD0, ByteBuffer byteBuffer, int i) {
        this(aVar);
        k(c9437sD0, byteBuffer, i);
    }

    public C3415Kb2(InterfaceC7225jD0.a aVar) {
        this.g = new int[256];
        this.z = Bitmap.Config.ARGB_8888;
        this.h = aVar;
        this.r = new C9437sD0();
    }
}

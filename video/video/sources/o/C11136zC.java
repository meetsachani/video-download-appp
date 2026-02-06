package o;

import java.util.Objects;

/* renamed from: o.zC  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C11136zC {
    public final byte[] a;
    public int b;
    public int c;
    public int d;

    public C11136zC() {
        this(8192);
    }

    public void a(byte b) {
        int i = this.d;
        byte[] bArr = this.a;
        if (i < bArr.length) {
            int i2 = this.c;
            bArr[i2] = b;
            this.d = i + 1;
            int i3 = i2 + 1;
            this.c = i3;
            if (i3 == bArr.length) {
                this.c = 0;
                return;
            }
            return;
        }
        throw new IllegalStateException("No space available");
    }

    public void b(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "Buffer");
        if (i >= 0 && i < bArr.length) {
            if (i2 >= 0) {
                if (this.d + i2 <= this.a.length) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        byte[] bArr2 = this.a;
                        int i4 = this.c;
                        bArr2[i4] = bArr[i + i3];
                        int i5 = i4 + 1;
                        this.c = i5;
                        if (i5 == bArr2.length) {
                            this.c = 0;
                        }
                    }
                    this.d += i2;
                    return;
                }
                throw new IllegalStateException("No space available");
            }
            throw new IllegalArgumentException("Illegal length: " + i2);
        }
        throw new IllegalArgumentException("Illegal offset: " + i);
    }

    public void c() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.a.length - this.d;
    }

    public boolean f() {
        if (this.d > 0) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.d < this.a.length) {
            return true;
        }
        return false;
    }

    public boolean h(int i) {
        if (this.d + i <= this.a.length) {
            return true;
        }
        return false;
    }

    public boolean i(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "Buffer");
        if (i >= 0 && i < bArr.length) {
            if (i2 >= 0 && i2 <= this.a.length) {
                if (i2 < this.d) {
                    return false;
                }
                int i3 = this.b;
                for (int i4 = 0; i4 < i2; i4++) {
                    byte[] bArr2 = this.a;
                    if (bArr2[i3] != bArr[i4 + i]) {
                        return false;
                    }
                    i3++;
                    if (i3 == bArr2.length) {
                        i3 = 0;
                    }
                }
                return true;
            }
            throw new IllegalArgumentException("Illegal length: " + i2);
        }
        throw new IllegalArgumentException("Illegal offset: " + i);
    }

    public byte j() {
        int i = this.d;
        if (i > 0) {
            byte[] bArr = this.a;
            int i2 = this.b;
            byte b = bArr[i2];
            this.d = i - 1;
            int i3 = i2 + 1;
            this.b = i3;
            if (i3 == bArr.length) {
                this.b = 0;
            }
            return b;
        }
        throw new IllegalStateException("No bytes available.");
    }

    public void k(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "targetBuffer");
        if (i >= 0 && i < bArr.length) {
            if (i2 >= 0 && i2 <= this.a.length) {
                int i3 = i + i2;
                if (i3 <= bArr.length) {
                    if (this.d >= i2) {
                        int i4 = 0;
                        while (i4 < i2) {
                            int i5 = i + 1;
                            byte[] bArr2 = this.a;
                            int i6 = this.b;
                            bArr[i] = bArr2[i6];
                            this.d--;
                            int i7 = i6 + 1;
                            this.b = i7;
                            if (i7 == bArr2.length) {
                                this.b = 0;
                            }
                            i4++;
                            i = i5;
                        }
                        return;
                    }
                    throw new IllegalStateException("Currently, there are only " + this.d + "in the buffer, not " + i2);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("The supplied byte array contains only ");
                sb.append(bArr.length);
                sb.append(" bytes, but offset, and length would require ");
                sb.append(i3 - 1);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IllegalArgumentException("Illegal length: " + i2);
        }
        throw new IllegalArgumentException("Illegal offset: " + i);
    }

    public C11136zC(int i) {
        this.a = C7743lL0.l(i);
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }
}

package o;

import java.io.Reader;
import java.io.Serializable;

/* renamed from: o.cB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5506cB extends Reader implements Serializable {
    private static final long serialVersionUID = 3724187752191401220L;
    public final CharSequence X;
    public int Y;
    public final int Y0;
    public int Z;
    public final Integer Z0;

    public C5506cB(CharSequence charSequence) {
        this(charSequence, 0);
    }

    public final int a() {
        int intValue;
        int length = this.X.length();
        Integer num = this.Z0;
        if (num == null) {
            intValue = Integer.MAX_VALUE;
        } else {
            intValue = num.intValue();
        }
        return Math.min(length, intValue);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i = this.Y0;
        this.Y = i;
        this.Z = i;
    }

    public final int d() {
        return Math.min(this.X.length(), this.Y0);
    }

    @Override // java.io.Reader
    public void mark(int i) {
        this.Z = this.Y;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public int read() {
        if (this.Y >= a()) {
            return -1;
        }
        CharSequence charSequence = this.X;
        int i = this.Y;
        this.Y = i + 1;
        return charSequence.charAt(i);
    }

    @Override // java.io.Reader
    public boolean ready() {
        if (this.Y < a()) {
            return true;
        }
        return false;
    }

    @Override // java.io.Reader
    public void reset() {
        this.Y = this.Z;
    }

    @Override // java.io.Reader
    public long skip(long j) {
        if (j >= 0) {
            if (this.Y >= a()) {
                return 0L;
            }
            int min = (int) Math.min(a(), this.Y + j);
            this.Y = min;
            return min - this.Y;
        }
        throw new IllegalArgumentException("Number of characters to skip is less than zero: " + j);
    }

    public String toString() {
        return this.X.subSequence(d(), a()).toString();
    }

    public C5506cB(CharSequence charSequence, int i) {
        this(charSequence, i, Integer.MAX_VALUE);
    }

    public C5506cB(String str, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Start index is less than zero: " + i);
        } else if (i2 >= i) {
            this.X = str == null ? "" : str;
            this.Y0 = i;
            this.Z0 = Integer.valueOf(i2);
            this.Y = i;
            this.Z = i;
        } else {
            throw new IllegalArgumentException("End index is less than start " + i + ": " + i2);
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        C7743lL0.r(cArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        if (this.Y >= a()) {
            return -1;
        }
        CharSequence charSequence = this.X;
        if (charSequence instanceof String) {
            int min = Math.min(i2, a() - this.Y);
            int i3 = this.Y;
            ((String) this.X).getChars(i3, i3 + min, cArr, i);
            this.Y += min;
            return min;
        } else if (charSequence instanceof StringBuilder) {
            int min2 = Math.min(i2, a() - this.Y);
            int i4 = this.Y;
            ((StringBuilder) this.X).getChars(i4, i4 + min2, cArr, i);
            this.Y += min2;
            return min2;
        } else if (charSequence instanceof StringBuffer) {
            int min3 = Math.min(i2, a() - this.Y);
            int i5 = this.Y;
            ((StringBuffer) this.X).getChars(i5, i5 + min3, cArr, i);
            this.Y += min3;
            return min3;
        } else {
            int i6 = 0;
            for (int i7 = 0; i7 < i2; i7++) {
                int read = read();
                if (read == -1) {
                    break;
                }
                cArr[i + i7] = (char) read;
                i6++;
            }
            return i6;
        }
    }
}

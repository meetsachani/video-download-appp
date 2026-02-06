package o;

import java.io.Writer;

/* renamed from: o.vs1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10328vs1 extends Writer {
    public static final C10328vs1 X;
    @Deprecated
    public static final C10328vs1 Y;

    static {
        C10328vs1 c10328vs1 = new C10328vs1();
        X = c10328vs1;
        Y = c10328vs1;
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        C7743lL0.r(cArr, i, i2);
    }

    @Override // java.io.Writer
    public void write(int i) {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) {
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) {
        write(str, 0, str.length());
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
        C7743lL0.p(str, i, i2);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        C7743lL0.t(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }
}

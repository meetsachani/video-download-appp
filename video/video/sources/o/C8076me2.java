package o;

import java.io.Serializable;
import java.io.Writer;

/* renamed from: o.me2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8076me2 extends Writer implements Serializable {
    private static final long serialVersionUID = -146927496096066153L;
    public final StringBuilder X;

    public C8076me2() {
        this.X = new StringBuilder();
    }

    public StringBuilder d() {
        return this.X;
    }

    public String toString() {
        return this.X.toString();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            C7743lL0.r(cArr, i, i2);
            this.X.append(cArr, i, i2);
        }
    }

    public C8076me2(int i) {
        this.X = new StringBuilder(i);
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.X.append(str);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) {
        this.X.append(c);
        return this;
    }

    public C8076me2(StringBuilder sb) {
        this.X = sb == null ? new StringBuilder() : sb;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.X.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        this.X.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }
}

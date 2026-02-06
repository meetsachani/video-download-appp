package o;

import java.io.IOException;
import java.io.Writer;
import java.lang.Appendable;
import java.util.Objects;

/* renamed from: o.Hd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3126Hd<T extends Appendable> extends Writer {
    public final T X;

    public C3126Hd(T t) {
        this.X = t;
    }

    public T d() {
        return this.X;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        C7743lL0.r(cArr, i, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.X.append(cArr[i + i3]);
        }
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        this.X.append((char) i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
        this.X.append(c);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        Objects.requireNonNull(str, "str");
        this.X.append(str, i, i2 + i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        this.X.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        this.X.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
    }
}

package o;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/* renamed from: o.xK1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10684xK1 extends FilterWriter {
    public C10684xK1(Writer writer) {
        super(writer);
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        C7743lL0.w(((FilterWriter) this).out, new EJ0() { // from class: o.wK1
            @Override // o.EJ0
            public final void accept(Object obj) {
                C10684xK1.this.h((IOException) obj);
            }
        });
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        try {
            ((FilterWriter) this).out.flush();
        } catch (IOException e) {
            h(e);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        try {
            int t0 = C7743lL0.t0(cArr);
            f(t0);
            ((FilterWriter) this).out.write(cArr);
            d(t0);
        } catch (IOException e) {
            h(e);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
        try {
            f(1);
            ((FilterWriter) this).out.append(c);
            d(1);
            return this;
        } catch (IOException e) {
            h(e);
            return this;
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        try {
            f(i2);
            ((FilterWriter) this).out.write(cArr, i, i2);
            d(i2);
        } catch (IOException e) {
            h(e);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        try {
            int r0 = C7743lL0.r0(charSequence);
            f(r0);
            ((FilterWriter) this).out.append(charSequence);
            d(r0);
            return this;
        } catch (IOException e) {
            h(e);
            return this;
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int i) throws IOException {
        try {
            f(1);
            ((FilterWriter) this).out.write(i);
            d(1);
        } catch (IOException e) {
            h(e);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        int i3 = i2 - i;
        try {
            f(i3);
            ((FilterWriter) this).out.append(charSequence, i, i2);
            d(i3);
            return this;
        } catch (IOException e) {
            h(e);
            return this;
        }
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        try {
            int r0 = C7743lL0.r0(str);
            f(r0);
            ((FilterWriter) this).out.write(str);
            d(r0);
        } catch (IOException e) {
            h(e);
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        try {
            f(i2);
            ((FilterWriter) this).out.write(str, i, i2);
            d(i2);
        } catch (IOException e) {
            h(e);
        }
    }

    public void d(int i) throws IOException {
    }

    public void f(int i) throws IOException {
    }

    public void h(IOException iOException) throws IOException {
        throw iOException;
    }
}

package o;

import java.io.IOException;
import java.io.Writer;
import java.util.Collection;

/* renamed from: o.iK1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7013iK1 extends C4163Rs0 {
    public C7013iK1(Collection<Writer> collection) {
        super(collection);
    }

    @Override // o.C4163Rs0, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
        } catch (IOException e) {
            r(e);
        }
    }

    @Override // o.C4163Rs0, java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            r(e);
        }
    }

    @Override // o.C4163Rs0, java.io.Writer
    public void write(char[] cArr) throws IOException {
        try {
            int t0 = C7743lL0.t0(cArr);
            q(t0);
            super.write(cArr);
            p(t0);
        } catch (IOException e) {
            r(e);
        }
    }

    public C7013iK1(Writer... writerArr) {
        super(writerArr);
    }

    @Override // o.C4163Rs0, java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
        try {
            q(1);
            super.append(c);
            p(1);
            return this;
        } catch (IOException e) {
            r(e);
            return this;
        }
    }

    @Override // o.C4163Rs0, java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        try {
            q(i2);
            super.write(cArr, i, i2);
            p(i2);
        } catch (IOException e) {
            r(e);
        }
    }

    @Override // o.C4163Rs0, java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        try {
            int r0 = C7743lL0.r0(charSequence);
            q(r0);
            super.append(charSequence);
            p(r0);
            return this;
        } catch (IOException e) {
            r(e);
            return this;
        }
    }

    @Override // o.C4163Rs0, java.io.Writer
    public void write(int i) throws IOException {
        try {
            q(1);
            super.write(i);
            p(1);
        } catch (IOException e) {
            r(e);
        }
    }

    @Override // o.C4163Rs0, java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        int i3 = i2 - i;
        try {
            q(i3);
            super.append(charSequence, i, i2);
            p(i3);
            return this;
        } catch (IOException e) {
            r(e);
            return this;
        }
    }

    @Override // o.C4163Rs0, java.io.Writer
    public void write(String str) throws IOException {
        try {
            int r0 = C7743lL0.r0(str);
            q(r0);
            super.write(str);
            p(r0);
        } catch (IOException e) {
            r(e);
        }
    }

    @Override // o.C4163Rs0, java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        try {
            q(i2);
            super.write(str, i, i2);
            p(i2);
        } catch (IOException e) {
            r(e);
        }
    }

    public void p(int i) throws IOException {
    }

    public void q(int i) throws IOException {
    }

    public void r(IOException iOException) throws IOException {
        throw iOException;
    }
}

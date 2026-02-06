package o;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

@InterfaceC7797la0
@InterfaceC11149zF0
/* renamed from: o.Id  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3224Id extends Writer {
    public final Appendable X;
    public boolean Y;

    public C3224Id(Appendable appendable) {
        this.X = (Appendable) C10664xF1.E(appendable);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.Y = true;
        Appendable appendable = this.X;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    public final void d() throws IOException {
        if (!this.Y) {
            return;
        }
        throw new IOException("Cannot write to a closed writer.");
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        d();
        Appendable appendable = this.X;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        d();
        this.X.append(new String(cArr, i, i2));
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        d();
        this.X.append((char) i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
        d();
        this.X.append(c);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        C10664xF1.E(str);
        d();
        this.X.append(str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@MB CharSequence charSequence) throws IOException {
        d();
        this.X.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@MB CharSequence charSequence, int i, int i2) throws IOException {
        d();
        this.X.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        C10664xF1.E(str);
        d();
        this.X.append(str, i, i2 + i);
    }
}

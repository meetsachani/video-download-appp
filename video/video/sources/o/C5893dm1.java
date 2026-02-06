package o;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

@InterfaceC7797la0
@InterfaceC11149zF0
/* renamed from: o.dm1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5893dm1 extends Reader {
    public final Iterator<? extends AbstractC7459kB> X;
    @MB
    public Reader Y;

    public C5893dm1(Iterator<? extends AbstractC7459kB> it) throws IOException {
        this.X = it;
        a();
    }

    public final void a() throws IOException {
        close();
        if (this.X.hasNext()) {
            this.Y = this.X.next().m();
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Reader reader = this.Y;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.Y = null;
            }
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        C10664xF1.E(cArr);
        Reader reader = this.Y;
        if (reader == null) {
            return -1;
        }
        int read = reader.read(cArr, i, i2);
        if (read == -1) {
            a();
            return read(cArr, i, i2);
        }
        return read;
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        Reader reader = this.Y;
        if (reader != null && reader.ready()) {
            return true;
        }
        return false;
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
        boolean z;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "n is negative");
        if (i > 0) {
            while (true) {
                Reader reader = this.Y;
                if (reader == null) {
                    break;
                }
                long skip = reader.skip(j);
                if (skip > 0) {
                    return skip;
                }
                a();
            }
        }
        return 0L;
    }
}

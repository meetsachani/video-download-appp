package o;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes4.dex */
public class E02 extends Reader {
    public Reader X;
    public final Iterator<? extends Reader> Y;

    public E02(Iterable<? extends Reader> iterable) {
        Objects.requireNonNull(iterable, "readers");
        this.Y = iterable.iterator();
        this.X = (Reader) C8643oy2.j(new XK0() { // from class: o.D02
            @Override // o.XK0
            public final Object get() {
                Reader d;
                d = E02.this.d();
                return d;
            }
        });
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        do {
        } while (d() != null);
    }

    public final Reader d() throws IOException {
        Reader reader = this.X;
        if (reader != null) {
            reader.close();
        }
        if (this.Y.hasNext()) {
            this.X = this.Y.next();
        } else {
            this.X = null;
        }
        return this.X;
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        int i = -1;
        while (true) {
            Reader reader = this.X;
            if (reader == null) {
                return i;
            }
            i = reader.read();
            if (i != -1) {
                return i;
            }
            d();
        }
    }

    public E02(Reader... readerArr) {
        this(Arrays.asList(readerArr));
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        C7743lL0.r(cArr, i, i2);
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (true) {
            Reader reader = this.X;
            if (reader == null) {
                break;
            }
            int read = reader.read(cArr, i, i2);
            if (read == -1) {
                d();
            } else {
                i3 += read;
                i += read;
                i2 -= read;
                if (i2 <= 0) {
                    break;
                }
            }
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }
}

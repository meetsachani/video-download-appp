package o;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Consumer;

/* loaded from: classes4.dex */
public class VZ0 implements Iterator<String>, Closeable {
    public final BufferedReader X;
    public String Y;
    public boolean Z;

    public VZ0(Reader reader) {
        Objects.requireNonNull(reader, "reader");
        if (reader instanceof BufferedReader) {
            this.X = (BufferedReader) reader;
        } else {
            this.X = new BufferedReader(reader);
        }
    }

    @Deprecated
    public static void d(VZ0 vz0) {
        C7743lL0.A(vz0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.Z = true;
        this.Y = null;
        C7743lL0.v(this.X);
    }

    public boolean f(String str) {
        return true;
    }

    @Override // java.util.Iterator
    /* renamed from: h */
    public String next() {
        return i();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        String readLine;
        if (this.Y != null) {
            return true;
        }
        if (this.Z) {
            return false;
        }
        do {
            try {
                readLine = this.X.readLine();
                if (readLine == null) {
                    this.Z = true;
                    return false;
                }
            } catch (IOException e) {
                C7743lL0.B(this, new Consumer() { // from class: o.UZ0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        e.addSuppressed((Exception) obj);
                    }
                });
                throw new IllegalStateException(e);
            }
        } while (!f(readLine));
        this.Y = readLine;
        return true;
    }

    @Deprecated
    public String i() {
        if (hasNext()) {
            String str = this.Y;
            this.Y = null;
            return str;
        }
        throw new NoSuchElementException("No more lines");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove not supported");
    }
}

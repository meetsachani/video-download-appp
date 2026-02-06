package o;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;

/* renamed from: o.am2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5166am2 extends AbstractC10195vK1 {
    public final Writer X;
    public final boolean Y;

    public C5166am2(Reader reader, Writer writer) {
        this(reader, writer, false);
    }

    @Override // o.AbstractC10195vK1, java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
        } finally {
            if (this.Y) {
                this.X.close();
            }
        }
    }

    @Override // o.AbstractC10195vK1, java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.X.write(read);
        }
        return read;
    }

    public C5166am2(Reader reader, Writer writer, boolean z) {
        super(reader);
        this.X = writer;
        this.Y = z;
    }

    @Override // o.AbstractC10195vK1, java.io.Reader
    public int read(char[] cArr) throws IOException {
        int read = super.read(cArr);
        if (read != -1) {
            this.X.write(cArr, 0, read);
        }
        return read;
    }

    @Override // o.AbstractC10195vK1, java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        int read = super.read(cArr, i, i2);
        if (read != -1) {
            this.X.write(cArr, i, read);
        }
        return read;
    }

    @Override // o.AbstractC10195vK1, java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) throws IOException {
        int position = charBuffer.position();
        int read = super.read(charBuffer);
        if (read != -1) {
            int position2 = charBuffer.position();
            int limit = charBuffer.limit();
            try {
                charBuffer.position(position).limit(position2);
                this.X.append((CharSequence) charBuffer);
                return read;
            } finally {
                charBuffer.position(position2).limit(limit);
            }
        }
        return read;
    }
}

package o;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

@InterfaceC7797la0
@InterfaceC11149zF0
/* renamed from: o.mB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7963mB {
    public static final int a = 2048;

    /* renamed from: o.mB$a */
    /* loaded from: classes3.dex */
    public static final class a extends Writer {
        public static final a X = new a();

        public String toString() {
            return "CharStreams.nullWriter()";
        }

        @Override // java.io.Writer
        public void write(int i) {
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
            C10664xF1.E(cArr);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            C10664xF1.f0(i, i2 + i, cArr.length);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(@MB CharSequence charSequence) {
            return this;
        }

        @Override // java.io.Writer
        public void write(String str) {
            C10664xF1.E(str);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(@MB CharSequence charSequence, int i, int i2) {
            C10664xF1.f0(i, i2, charSequence == null ? 4 : charSequence.length());
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i, int i2) {
            C10664xF1.f0(i, i2 + i, str.length());
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(char c) {
            return this;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }

    @InterfaceC4238Sm
    public static Writer a(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        return new C3224Id(appendable);
    }

    @InterfaceC6181ey
    public static long b(Readable readable, Appendable appendable) throws IOException {
        if (readable instanceof Reader) {
            if (appendable instanceof StringBuilder) {
                return c((Reader) readable, (StringBuilder) appendable);
            }
            return d((Reader) readable, a(appendable));
        }
        C10664xF1.E(readable);
        C10664xF1.E(appendable);
        CharBuffer e = e();
        long j = 0;
        while (readable.read(e) != -1) {
            C10723xU0.b(e);
            appendable.append(e);
            j += e.remaining();
            C10723xU0.a(e);
        }
        return j;
    }

    @InterfaceC6181ey
    public static long c(Reader reader, StringBuilder sb) throws IOException {
        C10664xF1.E(reader);
        C10664xF1.E(sb);
        char[] cArr = new char[2048];
        long j = 0;
        while (true) {
            int read = reader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
                j += read;
            } else {
                return j;
            }
        }
    }

    @InterfaceC6181ey
    public static long d(Reader reader, Writer writer) throws IOException {
        C10664xF1.E(reader);
        C10664xF1.E(writer);
        char[] cArr = new char[2048];
        long j = 0;
        while (true) {
            int read = reader.read(cArr);
            if (read != -1) {
                writer.write(cArr, 0, read);
                j += read;
            } else {
                return j;
            }
        }
    }

    public static CharBuffer e() {
        return CharBuffer.allocate(2048);
    }

    @InterfaceC6181ey
    @InterfaceC4238Sm
    public static long f(Readable readable) throws IOException {
        CharBuffer e = e();
        long j = 0;
        while (true) {
            long read = readable.read(e);
            if (read != -1) {
                j += read;
                C10723xU0.a(e);
            } else {
                return j;
            }
        }
    }

    @InterfaceC4238Sm
    public static Writer g() {
        return a.X;
    }

    @InterfaceC6181ey
    @InterfaceC9377ry1
    @InterfaceC4238Sm
    public static <T> T h(Readable readable, WZ0<T> wz0) throws IOException {
        String b;
        C10664xF1.E(readable);
        C10664xF1.E(wz0);
        XZ0 xz0 = new XZ0(readable);
        do {
            b = xz0.b();
            if (b == null) {
                break;
            }
        } while (wz0.a(b));
        return wz0.getResult();
    }

    @InterfaceC4238Sm
    public static List<String> i(Readable readable) throws IOException {
        ArrayList arrayList = new ArrayList();
        XZ0 xz0 = new XZ0(readable);
        while (true) {
            String b = xz0.b();
            if (b != null) {
                arrayList.add(b);
            } else {
                return arrayList;
            }
        }
    }

    @InterfaceC4238Sm
    public static void j(Reader reader, long j) throws IOException {
        C10664xF1.E(reader);
        while (j > 0) {
            long skip = reader.skip(j);
            if (skip != 0) {
                j -= skip;
            } else {
                throw new EOFException();
            }
        }
    }

    public static String k(Readable readable) throws IOException {
        return l(readable).toString();
    }

    public static StringBuilder l(Readable readable) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (readable instanceof Reader) {
            c((Reader) readable, sb);
            return sb;
        }
        b(readable, sb);
        return sb;
    }
}

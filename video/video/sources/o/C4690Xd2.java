package o;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* renamed from: o.Xd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4690Xd2 {
    public C4690Xd2() {
        throw new UnsupportedOperationException();
    }

    public static DV0 a(OV0 ov0) throws KV0 {
        boolean z;
        try {
            try {
                ov0.I();
                z = false;
                try {
                    return C9117qv2.V.e(ov0);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return HV0.X;
                    }
                    throw new WV0(e);
                }
            } catch (NumberFormatException e2) {
                throw new WV0(e2);
            } catch (A71 e3) {
                throw new WV0(e3);
            } catch (IOException e4) {
                throw new GV0(e4);
            }
        } catch (EOFException e5) {
            e = e5;
            z = true;
        }
    }

    public static void b(DV0 dv0, C5589cW0 c5589cW0) throws IOException {
        C9117qv2.V.i(c5589cW0, dv0);
    }

    public static Writer c(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        return new b(appendable);
    }

    /* renamed from: o.Xd2$b */
    /* loaded from: classes3.dex */
    public static final class b extends Writer {
        public final Appendable X;
        public final a Y = new a();

        /* renamed from: o.Xd2$b$a */
        /* loaded from: classes3.dex */
        public static class a implements CharSequence {
            public char[] X;
            public String Y;

            public a() {
            }

            public void a(char[] cArr) {
                this.X = cArr;
                this.Y = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return this.X[i];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.X.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
                return new String(this.X, i, i2 - i);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.Y == null) {
                    this.Y = new String(this.X);
                }
                return this.Y;
            }
        }

        public b(Appendable appendable) {
            this.X = appendable;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) throws IOException {
            this.Y.a(cArr);
            this.X.append(this.Y, i, i2 + i);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.X.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i) throws IOException {
            this.X.append((char) i);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
            this.X.append(charSequence, i, i2);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i, int i2) throws IOException {
            Objects.requireNonNull(str);
            this.X.append(str, i, i2 + i);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }
}

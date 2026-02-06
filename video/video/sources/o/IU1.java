package o;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class IU1 implements Closeable, InterfaceC5058aK0<String> {
    public static final String f1 = "";
    public static final int g1 = EnumC2674Cp0.m().l();
    public final int X;
    public final Charset Y;
    public final long Y0;
    public final SeekableByteChannel Z;
    public final long Z0;
    public final byte[][] a1;
    public final int b1;
    public final int c1;
    public c d1;
    public boolean e1;

    /* loaded from: classes4.dex */
    public class a implements InterfaceC5301bK0<String> {
        public String a;

        public a() {
        }

        @Override // o.InterfaceC5301bK0
        /* renamed from: d */
        public String next() throws IOException {
            if (this.a == null) {
                this.a = IU1.this.m();
            }
            String str = this.a;
            this.a = null;
            return str;
        }

        @Override // o.InterfaceC5301bK0
        public Iterator<String> e() {
            return null;
        }

        @Override // o.InterfaceC5301bK0
        public boolean hasNext() throws IOException {
            if (this.a == null) {
                this.a = IU1.this.m();
            }
            if (this.a != null) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<IU1, b> {
        public b() {
            StandardOpenOption standardOpenOption;
            c0(IU1.g1);
            Z(IU1.g1);
            standardOpenOption = StandardOpenOption.READ;
            h0(standardOpenOption);
        }

        @Override // o.XK0
        /* renamed from: j0 */
        public IU1 get() throws IOException {
            return new IU1(this, (a) null);
        }
    }

    /* loaded from: classes4.dex */
    public final class c {
        public final long a;
        public final byte[] b;
        public byte[] c;
        public int d;

        public /* synthetic */ c(IU1 iu1, long j, int i, byte[] bArr, a aVar) throws IOException {
            this(j, i, bArr);
        }

        public final void c() {
            int i = this.d + 1;
            if (i > 0) {
                this.c = Arrays.copyOf(this.b, i);
            } else {
                this.c = null;
            }
            this.d = -1;
        }

        public final int d(byte[] bArr, int i) {
            byte[][] bArr2;
            boolean z;
            for (byte[] bArr3 : IU1.this.a1) {
                boolean z2 = true;
                for (int length = bArr3.length - 1; length >= 0; length--) {
                    int length2 = (i + length) - (bArr3.length - 1);
                    if (length2 >= 0 && bArr[length2] == bArr3[length]) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 &= z;
                }
                if (z2) {
                    return bArr3.length;
                }
            }
            return 0;
        }

        public final String e() {
            boolean z;
            String str;
            byte[] bArr;
            if (this.a == 1) {
                z = true;
            } else {
                z = false;
            }
            int i = this.d;
            while (true) {
                if (i > -1) {
                    if (!z && i < IU1.this.b1) {
                        c();
                        break;
                    }
                    int d = d(this.b, i);
                    if (d > 0) {
                        int i2 = i + 1;
                        int i3 = (this.d - i2) + 1;
                        if (i3 >= 0) {
                            str = new String(Arrays.copyOfRange(this.b, i2, i3 + i2), IU1.this.Y);
                            this.d = i - d;
                        } else {
                            throw new IllegalStateException("Unexpected negative line length=" + i3);
                        }
                    } else {
                        i -= IU1.this.c1;
                        if (i < 0) {
                            c();
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            str = null;
            if (z && (bArr = this.c) != null) {
                String str2 = new String(bArr, IU1.this.Y);
                this.c = null;
                return str2;
            }
            return str;
        }

        public final c f() throws IOException {
            if (this.d <= -1) {
                long j = this.a;
                if (j > 1) {
                    IU1 iu1 = IU1.this;
                    return new c(j - 1, iu1.X, this.c);
                } else if (this.c == null) {
                    return null;
                } else {
                    throw new IllegalStateException("Unexpected leftover of the last block: leftOverOfThisFilePart=" + new String(this.c, IU1.this.Y));
                }
            }
            throw new IllegalStateException("Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=" + this.d);
        }

        public c(long j, int i, byte[] bArr) throws IOException {
            this.a = j;
            byte[] bArr2 = new byte[(bArr != null ? bArr.length : 0) + i];
            this.b = bArr2;
            long j2 = (j - 1) * IU1.this.X;
            if (j > 0) {
                IU1.this.Z.position(j2);
                if (IU1.this.Z.read(ByteBuffer.wrap(bArr2, 0, i)) != i) {
                    throw new IllegalStateException("Count of requested bytes and actually read bytes don't match");
                }
            }
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr2, i, bArr.length);
            }
            this.d = bArr2.length - 1;
            this.c = null;
        }
    }

    public /* synthetic */ IU1(b bVar, a aVar) throws IOException {
        this(bVar);
    }

    public static b l() {
        return new b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.Z.close();
    }

    @Override // o.InterfaceC5058aK0
    public Iterable<String> e() {
        return null;
    }

    @Override // o.InterfaceC5058aK0
    public InterfaceC5301bK0<String> iterator() {
        return new a();
    }

    public String m() throws IOException {
        String e = this.d1.e();
        while (e == null) {
            c f = this.d1.f();
            this.d1 = f;
            if (f == null) {
                break;
            }
            e = f.e();
        }
        if ("".equals(e) && !this.e1) {
            this.e1 = true;
            return m();
        }
        return e;
    }

    public List<String> n(int i) throws IOException {
        if (i >= 0) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                String m = m();
                if (m == null) {
                    break;
                }
                arrayList.add(m);
            }
            return arrayList;
        }
        throw new IllegalArgumentException("lineCount < 0");
    }

    public String o(int i) throws IOException {
        List<String> n = n(i);
        Collections.reverse(n);
        if (n.isEmpty()) {
            return "";
        }
        return C3455Kl2.a(System.lineSeparator(), n) + System.lineSeparator();
    }

    public IU1(b bVar) throws IOException {
        int i;
        int L = bVar.L();
        this.X = L;
        Charset g = IB.g(bVar.P());
        this.Y = g;
        if (g.newEncoder().maxBytesPerChar() != 1.0f && g != StandardCharsets.UTF_8) {
            if (g != Charset.forName("Shift_JIS") && g != Charset.forName("windows-31j") && g != Charset.forName("x-windows-949") && g != Charset.forName("gbk") && g != Charset.forName("x-windows-950")) {
                if (g != StandardCharsets.UTF_16BE && g != StandardCharsets.UTF_16LE) {
                    if (g == StandardCharsets.UTF_16) {
                        throw new UnsupportedEncodingException("For UTF-16, you need to specify the byte order (use UTF-16BE or UTF-16LE)");
                    }
                    throw new UnsupportedEncodingException("Encoding " + g + " is not supported yet (feel free to submit a patch)");
                }
                this.c1 = 2;
            } else {
                this.c1 = 1;
            }
        } else {
            this.c1 = 1;
        }
        byte[][] bArr = {EnumC3806Ob2.CRLF.g(g), EnumC3806Ob2.LF.g(g), EnumC3806Ob2.CR.g(g)};
        this.a1 = bArr;
        this.b1 = bArr[0].length;
        SeekableByteChannel seekableByteChannel = (SeekableByteChannel) bVar.N(SeekableByteChannel.class);
        this.Z = seekableByteChannel;
        long size = seekableByteChannel.size();
        this.Y0 = size;
        int i2 = (int) (size % L);
        if (i2 > 0) {
            this.Z0 = (size / L) + 1;
        } else {
            this.Z0 = size / L;
            if (size > 0) {
                i = L;
                this.d1 = new c(this, this.Z0, i, null, null);
            }
        }
        i = i2;
        this.d1 = new c(this, this.Z0, i, null, null);
    }

    @Deprecated
    public IU1(File file) throws IOException {
        this(file, g1, Charset.defaultCharset());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IU1(File file, Charset charset) throws IOException {
        this(r1, charset);
        Path path;
        path = file.toPath();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IU1(File file, int i, Charset charset) throws IOException {
        this(r1, i, charset);
        Path path;
        path = file.toPath();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IU1(File file, int i, String str) throws IOException {
        this(r1, i, str);
        Path path;
        path = file.toPath();
    }

    @Deprecated
    public IU1(Path path, Charset charset) throws IOException {
        this(path, g1, charset);
    }

    @Deprecated
    public IU1(Path path, int i, Charset charset) throws IOException {
        this(((b) l().D(path)).Z(i).f0(charset));
    }

    @Deprecated
    public IU1(Path path, int i, String str) throws IOException {
        this(path, i, IB.e(str));
    }
}

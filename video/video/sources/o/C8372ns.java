package o;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

@InterfaceC8046mW0(name = "ByteStreamsKt")
/* renamed from: o.ns  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8372ns {

    /* renamed from: o.ns$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC5187as {
        public int X = -1;
        public boolean Y;
        public final /* synthetic */ BufferedInputStream Y0;
        public boolean Z;

        public a(BufferedInputStream bufferedInputStream) {
            this.Y0 = bufferedInputStream;
        }

        @Override // o.AbstractC5187as
        public byte I0() {
            f();
            if (!this.Z) {
                byte b = (byte) this.X;
                this.Y = false;
                return b;
            }
            throw new NoSuchElementException("Input stream is over.");
        }

        public final boolean c() {
            return this.Z;
        }

        public final int d() {
            return this.X;
        }

        public final boolean e() {
            return this.Y;
        }

        public final void f() {
            if (!this.Y && !this.Z) {
                int read = this.Y0.read();
                this.X = read;
                boolean z = true;
                this.Y = true;
                if (read != -1) {
                    z = false;
                }
                this.Z = z;
            }
        }

        public final void g(boolean z) {
            this.Z = z;
        }

        public final void h(int i) {
            this.X = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            f();
            return !this.Z;
        }

        public final void i(boolean z) {
            this.Y = z;
        }
    }

    @XP0
    public static final BufferedInputStream a(InputStream inputStream, int i) {
        C6562gT0.p(inputStream, "<this>");
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStream;
        }
        return new BufferedInputStream(inputStream, i);
    }

    @XP0
    public static final BufferedOutputStream b(OutputStream outputStream, int i) {
        C6562gT0.p(outputStream, "<this>");
        if (outputStream instanceof BufferedOutputStream) {
            return (BufferedOutputStream) outputStream;
        }
        return new BufferedOutputStream(outputStream, i);
    }

    public static /* synthetic */ BufferedInputStream c(InputStream inputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        C6562gT0.p(inputStream, "<this>");
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStream;
        }
        return new BufferedInputStream(inputStream, i);
    }

    public static /* synthetic */ BufferedOutputStream d(OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        C6562gT0.p(outputStream, "<this>");
        if (outputStream instanceof BufferedOutputStream) {
            return (BufferedOutputStream) outputStream;
        }
        return new BufferedOutputStream(outputStream, i);
    }

    @XP0
    public static final BufferedReader e(InputStream inputStream, Charset charset) {
        C6562gT0.p(inputStream, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        return new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
    }

    public static /* synthetic */ BufferedReader f(InputStream inputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = HB.b;
        }
        C6562gT0.p(inputStream, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        return new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
    }

    @XP0
    public static final BufferedWriter g(OutputStream outputStream, Charset charset) {
        C6562gT0.p(outputStream, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
    }

    public static /* synthetic */ BufferedWriter h(OutputStream outputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = HB.b;
        }
        C6562gT0.p(outputStream, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
    }

    @XP0
    public static final ByteArrayInputStream i(String str, Charset charset) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        byte[] bytes = str.getBytes(charset);
        C6562gT0.o(bytes, "getBytes(...)");
        return new ByteArrayInputStream(bytes);
    }

    public static /* synthetic */ ByteArrayInputStream j(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = HB.b;
        }
        C6562gT0.p(str, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        byte[] bytes = str.getBytes(charset);
        C6562gT0.o(bytes, "getBytes(...)");
        return new ByteArrayInputStream(bytes);
    }

    public static final long k(@NotNull InputStream inputStream, @NotNull OutputStream outputStream, int i) {
        C6562gT0.p(inputStream, "<this>");
        C6562gT0.p(outputStream, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    public static /* synthetic */ long l(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return k(inputStream, outputStream, i);
    }

    @XP0
    public static final ByteArrayInputStream m(byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return new ByteArrayInputStream(bArr);
    }

    @XP0
    public static final ByteArrayInputStream n(byte[] bArr, int i, int i2) {
        C6562gT0.p(bArr, "<this>");
        return new ByteArrayInputStream(bArr, i, i2);
    }

    @NotNull
    public static final AbstractC5187as o(@NotNull BufferedInputStream bufferedInputStream) {
        C6562gT0.p(bufferedInputStream, "<this>");
        return new a(bufferedInputStream);
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final byte[] p(@NotNull InputStream inputStream) {
        C6562gT0.p(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C6562gT0.o(byteArray, "toByteArray(...)");
        return byteArray;
    }

    @InterfaceC9150r20(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @IR1(expression = "readBytes()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", warningSince = "1.3")
    @NotNull
    public static final byte[] q(@NotNull InputStream inputStream, int i) {
        C6562gT0.p(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C6562gT0.o(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static /* synthetic */ byte[] r(InputStream inputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        return q(inputStream, i);
    }

    @XP0
    public static final InputStreamReader s(InputStream inputStream, Charset charset) {
        C6562gT0.p(inputStream, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        return new InputStreamReader(inputStream, charset);
    }

    public static /* synthetic */ InputStreamReader t(InputStream inputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = HB.b;
        }
        C6562gT0.p(inputStream, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        return new InputStreamReader(inputStream, charset);
    }

    @XP0
    public static final OutputStreamWriter u(OutputStream outputStream, Charset charset) {
        C6562gT0.p(outputStream, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        return new OutputStreamWriter(outputStream, charset);
    }

    public static /* synthetic */ OutputStreamWriter v(OutputStream outputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = HB.b;
        }
        C6562gT0.p(outputStream, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        return new OutputStreamWriter(outputStream, charset);
    }
}

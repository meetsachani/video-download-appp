package o;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;

/* renamed from: o.bO2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5319bO2 extends Writer {
    public static final int a1 = 8192;
    public final OutputStream X;
    public final Charset Y;
    public Writer Y0;
    public StringWriter Z;
    public Charset Z0;

    /* renamed from: o.bO2$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<C5319bO2, b> {
        public b() {
            Charset charset = StandardCharsets.UTF_8;
            g0(charset);
            f0(charset);
        }

        @Override // o.XK0
        /* renamed from: j0 */
        public C5319bO2 get() throws IOException {
            return new C5319bO2(this);
        }
    }

    public static b d() {
        return new b();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.Y0 == null) {
            this.Z0 = this.Y;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.X, this.Z0);
            this.Y0 = outputStreamWriter;
            outputStreamWriter.write(this.Z.toString());
        }
        this.Y0.close();
    }

    public final void f(char[] cArr, int i, int i2) throws IOException {
        int i3;
        StringBuffer buffer = this.Z.getBuffer();
        if (buffer.length() + i2 > 8192) {
            i3 = 8192 - buffer.length();
        } else {
            i3 = i2;
        }
        this.Z.write(cArr, i, i3);
        if (buffer.length() >= 5) {
            if (buffer.substring(0, 5).equals("<?xml")) {
                int indexOf = buffer.indexOf("?>");
                if (indexOf > 0) {
                    Matcher matcher = ZN2.k1.matcher(buffer.substring(0, indexOf));
                    if (matcher.find()) {
                        String upperCase = matcher.group(1).toUpperCase(Locale.ROOT);
                        this.Z0 = Charset.forName(upperCase.substring(1, upperCase.length() - 1));
                    } else {
                        this.Z0 = this.Y;
                    }
                } else if (buffer.length() >= 8192) {
                    this.Z0 = this.Y;
                }
            } else {
                this.Z0 = this.Y;
            }
            if (this.Z0 != null) {
                this.Z = null;
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.X, this.Z0);
                this.Y0 = outputStreamWriter;
                outputStreamWriter.write(buffer.toString());
                if (i2 > i3) {
                    this.Y0.write(cArr, i + i3, i2 - i3);
                }
            }
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        Writer writer = this.Y0;
        if (writer != null) {
            writer.flush();
        }
    }

    public String h() {
        return this.Y.name();
    }

    public String i() {
        return this.Z0.name();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        C7743lL0.r(cArr, i, i2);
        if (this.Z != null) {
            f(cArr, i, i2);
        } else {
            this.Y0.write(cArr, i, i2);
        }
    }

    public C5319bO2(b bVar) throws IOException {
        this(bVar.U(), bVar.P());
    }

    @Deprecated
    public C5319bO2(File file) throws FileNotFoundException {
        this(file, (String) null);
    }

    @Deprecated
    public C5319bO2(File file, String str) throws FileNotFoundException {
        this(new FileOutputStream(file), str);
    }

    @Deprecated
    public C5319bO2(OutputStream outputStream) {
        this(outputStream, StandardCharsets.UTF_8);
    }

    public C5319bO2(OutputStream outputStream, Charset charset) {
        this.Z = new StringWriter(8192);
        this.X = outputStream;
        Objects.requireNonNull(charset);
        this.Y = charset;
    }

    @Deprecated
    public C5319bO2(OutputStream outputStream, String str) {
        this(outputStream, IB.f(str, StandardCharsets.UTF_8));
    }
}

package o;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import o.C7743lL0;

@Deprecated
/* loaded from: classes4.dex */
public class PP {
    public static int a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] k = C7743lL0.k();
        int i = 0;
        while (true) {
            int read = inputStream.read(k);
            if (-1 != read) {
                outputStream.write(k, 0, read);
                i += read;
            } else {
                return i;
            }
        }
    }

    public static int b(Reader reader, Writer writer) throws IOException {
        C7743lL0.b h = C7743lL0.b.h();
        try {
            char[] f = h.f();
            int i = 0;
            while (true) {
                int read = reader.read(f);
                if (-1 != read) {
                    writer.write(f, 0, read);
                    i += read;
                } else {
                    h.close();
                    return i;
                }
            }
        } catch (Throwable th) {
            if (h != null) {
                try {
                    h.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Deprecated
    public static void c(InputStream inputStream, Writer writer) throws IOException {
        b(new InputStreamReader(inputStream, Charset.defaultCharset()), writer);
    }

    public static void d(InputStream inputStream, Writer writer, String str) throws IOException {
        b(new InputStreamReader(inputStream, str), writer);
    }

    @Deprecated
    public static void e(Reader reader, OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charset.defaultCharset());
        b(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void f(Reader reader, OutputStream outputStream, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, str);
        b(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    @Deprecated
    public static void g(String str, OutputStream outputStream) throws IOException {
        StringReader stringReader = new StringReader(str);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charset.defaultCharset());
        b(stringReader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void h(String str, OutputStream outputStream, String str2) throws IOException {
        StringReader stringReader = new StringReader(str);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, str2);
        b(stringReader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void i(String str, Writer writer) throws IOException {
        writer.write(str);
    }

    public static void j(byte[] bArr, OutputStream outputStream) throws IOException {
        outputStream.write(bArr);
    }

    @Deprecated
    public static void k(byte[] bArr, Writer writer) throws IOException {
        c(new ByteArrayInputStream(bArr), writer);
    }

    public static void l(byte[] bArr, Writer writer, String str) throws IOException {
        d(new ByteArrayInputStream(bArr), writer, str);
    }
}

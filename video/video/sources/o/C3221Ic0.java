package o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* renamed from: o.Ic0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3221Ic0 {
    public static final int a = 8;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;

    public static int a(int i) {
        return ((i + 7) & (-8)) / 8;
    }

    public static byte[] b(byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static RuntimeException c(String str) {
        return new IllegalStateException(str);
    }

    public static byte[] d(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw c("Not enough bytes to read: " + i);
            }
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r0.finished() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
        throw c("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] e(InputStream inputStream, int i, int i2) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = inputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    try {
                        i4 += inflater.inflate(bArr, i4, i2 - i4);
                        i3 += read;
                    } catch (DataFormatException e) {
                        throw c(e.getMessage());
                    }
                } else {
                    throw c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
            }
            throw c("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static String f(InputStream inputStream, int i) throws IOException {
        return new String(d(inputStream, i), StandardCharsets.UTF_8);
    }

    public static long g(InputStream inputStream, int i) throws IOException {
        byte[] d2 = d(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (d2[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static int h(InputStream inputStream) throws IOException {
        return (int) g(inputStream, 2);
    }

    public static long i(InputStream inputStream) throws IOException {
        return g(inputStream, 4);
    }

    public static int j(InputStream inputStream) throws IOException {
        return (int) g(inputStream, 1);
    }

    public static int k(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    public static void l(InputStream inputStream, OutputStream outputStream, FileLock fileLock) throws IOException {
        if (fileLock != null && fileLock.isValid()) {
            byte[] bArr = new byte[512];
            while (true) {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            }
        } else {
            throw new IOException("Unable to acquire a lock on the underlying file channel.");
        }
    }

    public static void m(OutputStream outputStream, byte[] bArr) throws IOException {
        q(outputStream, bArr.length);
        byte[] b2 = b(bArr);
        q(outputStream, b2.length);
        outputStream.write(b2);
    }

    public static void n(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void o(OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void p(OutputStream outputStream, int i) throws IOException {
        o(outputStream, i, 2);
    }

    public static void q(OutputStream outputStream, long j) throws IOException {
        o(outputStream, j, 4);
    }

    public static void r(OutputStream outputStream, int i) throws IOException {
        o(outputStream, i, 1);
    }
}

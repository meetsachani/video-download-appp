package o;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Objects;
import o.TD0;

/* renamed from: o.wH0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10428wH0 {
    @Deprecated
    public static final String a = System.lineSeparator();
    public static final char[] b = {C3599Ly1.j, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', C3599Ly1.i, 'F'};
    public static final int[] c = {28, 24, 20, 16, 12, 8, 4, 0};

    public static StringBuilder a(StringBuilder sb, byte b2) {
        for (int i = 0; i < 2; i++) {
            sb.append(b[(b2 >> c[i + 6]) & 15]);
        }
        return sb;
    }

    public static StringBuilder b(StringBuilder sb, long j) {
        for (int i = 0; i < 8; i++) {
            sb.append(b[((int) (j >> c[i])) & 15]);
        }
        return sb;
    }

    public static void c(byte[] bArr, long j, OutputStream outputStream, int i) throws IOException, ArrayIndexOutOfBoundsException {
        Objects.requireNonNull(outputStream, "stream");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(XD.m(outputStream), Charset.defaultCharset());
        try {
            d(bArr, j, outputStreamWriter, i, bArr.length - i);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void d(byte[] bArr, long j, Appendable appendable, int i, int i2) throws IOException, ArrayIndexOutOfBoundsException {
        int i3;
        Objects.requireNonNull(appendable, "appendable");
        if (i >= 0 && i < bArr.length) {
            long j2 = j + i;
            StringBuilder sb = new StringBuilder(74);
            if (i2 >= 0 && (i3 = i + i2) <= bArr.length) {
                while (i < i3) {
                    int i4 = i3 - i;
                    if (i4 > 16) {
                        i4 = 16;
                    }
                    b(sb, j2).append(' ');
                    for (int i5 = 0; i5 < 16; i5++) {
                        if (i5 < i4) {
                            a(sb, bArr[i5 + i]);
                        } else {
                            sb.append(TD0.a.Y0);
                        }
                        sb.append(' ');
                    }
                    for (int i6 = 0; i6 < i4; i6++) {
                        byte b2 = bArr[i6 + i];
                        if (b2 >= 32 && b2 < Byte.MAX_VALUE) {
                            sb.append((char) b2);
                        } else {
                            sb.append('.');
                        }
                    }
                    sb.append(System.lineSeparator());
                    appendable.append(sb);
                    sb.setLength(0);
                    j2 += i4;
                    i += 16;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("Range [%s, %<s + %s) out of bounds for length %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length)));
        }
        throw new ArrayIndexOutOfBoundsException("illegal index: " + i + " into array of length " + bArr.length);
    }

    public static void e(byte[] bArr, Appendable appendable) throws IOException {
        d(bArr, 0L, appendable, 0, bArr.length);
    }
}

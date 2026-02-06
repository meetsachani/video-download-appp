package o;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: o.Wr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4646Wr {
    public static final int a = 1024;
    public static final int b = 16384;
    public static final float c = 0.5f;
    public static final ThreadLocal<SoftReference<byte[]>> d = new ThreadLocal<>();
    public static final Class<?> e;
    public static final long f;

    static {
        Class<?> f2 = f("java.io.FileOutputStream");
        e = f2;
        f = c(f2);
    }

    public static void a() {
        d.set(null);
    }

    public static byte[] b() {
        SoftReference<byte[]> softReference = d.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public static long c(Class<?> cls) {
        if (cls != null) {
            try {
                if (TB2.S()) {
                    return TB2.W(cls.getDeclaredField(C5287bG2.q2));
                }
                return -1L;
            } catch (Throwable unused) {
                return -1L;
            }
        }
        return -1L;
    }

    public static byte[] d(int i) {
        int max = Math.max(i, 1024);
        byte[] b2 = b();
        if (b2 != null && !e(max, b2.length)) {
            return b2;
        }
        byte[] bArr = new byte[max];
        if (max <= 16384) {
            g(bArr);
        }
        return bArr;
    }

    public static boolean e(int i, int i2) {
        if (i2 < i && i2 < i * 0.5f) {
            return true;
        }
        return false;
    }

    public static Class<?> f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void g(byte[] bArr) {
        d.set(new SoftReference<>(bArr));
    }

    public static void h(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!i(byteBuffer, outputStream)) {
                byte[] d2 = d(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int min = Math.min(byteBuffer.remaining(), d2.length);
                    byteBuffer.get(d2, 0, min);
                    outputStream.write(d2, 0, min);
                }
            }
            byteBuffer.position(position);
        } catch (Throwable th) {
            byteBuffer.position(position);
            throw th;
        }
    }

    public static boolean i(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        WritableByteChannel writableByteChannel;
        long j = f;
        if (j >= 0 && e.isInstance(outputStream)) {
            try {
                writableByteChannel = (WritableByteChannel) TB2.O(outputStream, j);
            } catch (ClassCastException unused) {
                writableByteChannel = null;
            }
            if (writableByteChannel != null) {
                writableByteChannel.write(byteBuffer);
                return true;
            }
            return false;
        }
        return false;
    }
}

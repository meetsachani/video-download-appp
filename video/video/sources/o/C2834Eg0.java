package o;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: o.Eg0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2834Eg0 {
    public static final String a = "ExifInterfaceUtils";

    /* renamed from: o.Eg0$a */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(FileDescriptor fileDescriptor) throws ErrnoException {
            android.system.Os.close(fileDescriptor);
        }

        public static FileDescriptor b(FileDescriptor fileDescriptor) throws ErrnoException {
            return android.system.Os.dup(fileDescriptor);
        }

        public static long c(FileDescriptor fileDescriptor, long j, int i) throws ErrnoException {
            return android.system.Os.lseek(fileDescriptor, j, i);
        }
    }

    /* renamed from: o.Eg0$b */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    public static void b(FileDescriptor fileDescriptor) {
        try {
            a.a(fileDescriptor);
        } catch (Exception unused) {
            Log.e(a, "Error closing fd.");
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static long[] d(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    public static int e(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                i += read;
                outputStream.write(bArr, 0, read);
            } else {
                return i;
            }
        }
    }

    public static void f(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int min = Math.min(i, 8192);
            int read = inputStream.read(bArr, 0, min);
            if (read == min) {
                i -= read;
                outputStream.write(bArr, 0, read);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    public static long g(String str) {
        try {
            int min = Math.min(str.length(), 3);
            long parseLong = Long.parseLong(str.substring(0, min));
            while (min < 3) {
                parseLong *= 10;
                min++;
            }
            return parseLong;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static boolean h(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}

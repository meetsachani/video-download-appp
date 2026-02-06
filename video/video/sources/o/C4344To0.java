package o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.util.Objects;

/* renamed from: o.To0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4344To0 {
    @Deprecated
    public static boolean a(FileChannel fileChannel, FileChannel fileChannel2, int i) throws IOException {
        return c(fileChannel, fileChannel2, i);
    }

    public static boolean b(ReadableByteChannel readableByteChannel, ReadableByteChannel readableByteChannel2, int i) throws IOException {
        if (Objects.equals(readableByteChannel, readableByteChannel2)) {
            return true;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i);
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (!z) {
                i2 = d(readableByteChannel, allocateDirect);
                allocateDirect.clear();
                if (i2 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (!z2) {
                i3 = d(readableByteChannel2, allocateDirect2);
                allocateDirect2.clear();
                if (i3 == 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (i2 == -1 && i3 == -1) {
                return allocateDirect.equals(allocateDirect2);
            }
            if (i2 != 0 && i3 != 0) {
                if (i2 != i3 || !allocateDirect.equals(allocateDirect2)) {
                    return false;
                }
            } else {
                Thread.yield();
            }
        }
    }

    public static boolean c(SeekableByteChannel seekableByteChannel, SeekableByteChannel seekableByteChannel2, int i) throws IOException {
        if (Objects.equals(seekableByteChannel, seekableByteChannel2)) {
            return true;
        }
        long e = e(seekableByteChannel);
        long e2 = e(seekableByteChannel2);
        if (e != e2) {
            return false;
        }
        if ((e == 0 && e2 == 0) || b(seekableByteChannel, seekableByteChannel2, i)) {
            return true;
        }
        return false;
    }

    public static int d(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int read;
        if (byteBuffer.hasRemaining()) {
            int i = 0;
            while (byteBuffer.hasRemaining() && (read = readableByteChannel.read(byteBuffer)) != -1) {
                if (read == 0) {
                    Thread.yield();
                } else {
                    i += read;
                }
            }
            if (i == 0) {
                return -1;
            }
            return i;
        }
        throw new IllegalArgumentException();
    }

    public static long e(SeekableByteChannel seekableByteChannel) throws IOException {
        if (seekableByteChannel != null) {
            return seekableByteChannel.size();
        }
        return 0L;
    }
}

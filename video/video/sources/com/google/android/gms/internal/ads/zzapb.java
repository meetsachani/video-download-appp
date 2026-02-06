package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public final class zzapb {
    public static long a(ByteBuffer byteBuffer) {
        g(byteBuffer);
        return e(byteBuffer, byteBuffer.position() + 16);
    }

    public static long b(ByteBuffer byteBuffer) {
        g(byteBuffer);
        return e(byteBuffer, byteBuffer.position() + 12);
    }

    public static Pair c(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair f = f(randomAccessFile, 0);
        if (f != null) {
            return f;
        }
        return f(randomAccessFile, 65535);
    }

    public static void d(ByteBuffer byteBuffer, long j) {
        g(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j >= 0 && j <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + position, (int) j);
            return;
        }
        throw new IllegalArgumentException("uint32 value of out range: " + j);
    }

    public static long e(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getInt(i) & 4294967295L;
    }

    public static Pair f(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i2;
        long length = randomAccessFile.length();
        if (length >= 22) {
            ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            long capacity = length - allocate.capacity();
            randomAccessFile.seek(capacity);
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            g(allocate);
            int capacity2 = allocate.capacity();
            if (capacity2 >= 22) {
                int i3 = capacity2 - 22;
                int min = Math.min(i3, 65535);
                for (int i4 = 0; i4 < min; i4++) {
                    i2 = i3 - i4;
                    if (allocate.getInt(i2) == 101010256 && ((char) allocate.getShort(i2 + 20)) == i4) {
                        break;
                    }
                }
            }
            i2 = -1;
            if (i2 != -1) {
                allocate.position(i2);
                ByteBuffer slice = allocate.slice();
                slice.order(ByteOrder.LITTLE_ENDIAN);
                return Pair.create(slice, Long.valueOf(capacity + i2));
            }
            return null;
        }
        return null;
    }

    public static void g(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }
}

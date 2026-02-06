package o;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* loaded from: classes4.dex */
public class IN1 {
    public static boolean a(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws IOException {
        if (Objects.equals(randomAccessFile, randomAccessFile2)) {
            return true;
        }
        long b = b(randomAccessFile);
        long b2 = b(randomAccessFile2);
        if (b != b2) {
            return false;
        }
        if (b == 0 && b2 == 0) {
            return true;
        }
        return C4344To0.c(randomAccessFile.getChannel(), randomAccessFile2.getChannel(), 8192);
    }

    public static long b(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile != null) {
            return randomAccessFile.length();
        }
        return 0L;
    }

    public static byte[] c(final RandomAccessFile randomAccessFile, long j, int i) throws IOException {
        randomAccessFile.seek(j);
        return C7743lL0.r1(new InterfaceC5305bL0() { // from class: o.HN1
            @Override // o.InterfaceC5305bL0
            public final Object b(Object obj, Object obj2, Object obj3) {
                return Integer.valueOf(randomAccessFile.read((byte[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue()));
            }
        }, i);
    }

    public static RandomAccessFile d(RandomAccessFile randomAccessFile) throws IOException {
        randomAccessFile.seek(0L);
        return randomAccessFile;
    }
}

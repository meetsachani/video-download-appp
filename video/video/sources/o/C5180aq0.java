package o;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* renamed from: o.aq0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5180aq0 {
    public static void a(ReadableByteChannel readableByteChannel, FileChannel fileChannel) throws IOException {
        try {
            fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}

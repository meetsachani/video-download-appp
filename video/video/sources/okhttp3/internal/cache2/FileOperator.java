package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import o.C5422bq;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class FileOperator {
    @NotNull
    private final FileChannel fileChannel;

    public FileOperator(@NotNull FileChannel fileChannel) {
        C6562gT0.p(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long j, @NotNull C5422bq c5422bq, long j2) {
        C6562gT0.p(c5422bq, "sink");
        if (j2 >= 0) {
            long j3 = j;
            long j4 = j2;
            while (j4 > 0) {
                long transferTo = this.fileChannel.transferTo(j3, j4, c5422bq);
                j3 += transferTo;
                j4 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void write(long j, @NotNull C5422bq c5422bq, long j2) throws IOException {
        C6562gT0.p(c5422bq, "source");
        if (j2 >= 0 && j2 <= c5422bq.size()) {
            long j3 = j;
            long j4 = j2;
            while (j4 > 0) {
                long transferFrom = this.fileChannel.transferFrom(c5422bq, j3, j4);
                j3 += transferFrom;
                j4 -= transferFrom;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}

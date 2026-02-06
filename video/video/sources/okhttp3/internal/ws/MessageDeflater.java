package okhttp3.internal.ws;

import com.facebook.internal.H;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import o.C5033aE;
import o.C5422bq;
import o.C6562gT0;
import o.C8859ps;
import o.J82;
import o.N10;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class MessageDeflater implements Closeable {
    @NotNull
    private final C5422bq deflatedBytes;
    @NotNull
    private final Deflater deflater;
    @NotNull
    private final N10 deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        C5422bq c5422bq = new C5422bq();
        this.deflatedBytes = c5422bq;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new N10((J82) c5422bq, deflater);
    }

    private final boolean endsWith(C5422bq c5422bq, C8859ps c8859ps) {
        return c5422bq.a1(c5422bq.size() - c8859ps.g0(), c8859ps);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.deflaterSink.close();
    }

    public final void deflate(@NotNull C5422bq c5422bq) throws IOException {
        C8859ps c8859ps;
        C6562gT0.p(c5422bq, H.a.b);
        if (this.deflatedBytes.size() == 0) {
            if (this.noContextTakeover) {
                this.deflater.reset();
            }
            this.deflaterSink.write(c5422bq, c5422bq.size());
            this.deflaterSink.flush();
            C5422bq c5422bq2 = this.deflatedBytes;
            c8859ps = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
            if (endsWith(c5422bq2, c8859ps)) {
                long size = this.deflatedBytes.size() - 4;
                C5422bq.c H = C5422bq.H(this.deflatedBytes, null, 1, null);
                try {
                    H.h(size);
                    C5033aE.a(H, null);
                } finally {
                }
            } else {
                this.deflatedBytes.writeByte(0);
            }
            C5422bq c5422bq3 = this.deflatedBytes;
            c5422bq.write(c5422bq3, c5422bq3.size());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}

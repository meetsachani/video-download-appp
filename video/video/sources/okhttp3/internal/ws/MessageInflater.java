package okhttp3.internal.ws;

import com.facebook.internal.H;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import o.AP0;
import o.C5422bq;
import o.C6562gT0;
import o.InterfaceC7072ia2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class MessageInflater implements Closeable {
    @NotNull
    private final C5422bq deflatedBytes;
    @NotNull
    private final Inflater inflater;
    @NotNull
    private final AP0 inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z) {
        this.noContextTakeover = z;
        C5422bq c5422bq = new C5422bq();
        this.deflatedBytes = c5422bq;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new AP0((InterfaceC7072ia2) c5422bq, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    public final void inflate(@NotNull C5422bq c5422bq) throws IOException {
        C6562gT0.p(c5422bq, H.a.b);
        if (this.deflatedBytes.size() == 0) {
            if (this.noContextTakeover) {
                this.inflater.reset();
            }
            this.deflatedBytes.Q1(c5422bq);
            this.deflatedBytes.writeInt(65535);
            long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.size();
            do {
                this.inflaterSource.a(c5422bq, Long.MAX_VALUE);
            } while (this.inflater.getBytesRead() < bytesRead);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}

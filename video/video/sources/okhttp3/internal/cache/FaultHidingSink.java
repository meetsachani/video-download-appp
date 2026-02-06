package okhttp3.internal.cache;

import java.io.IOException;
import o.AbstractC3011Fy0;
import o.C5422bq;
import o.C6562gT0;
import o.C7458kA2;
import o.HA0;
import o.J82;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public class FaultHidingSink extends AbstractC3011Fy0 {
    private boolean hasErrors;
    @NotNull
    private final HA0<IOException, C7458kA2> onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(@NotNull J82 j82, @NotNull HA0<? super IOException, C7458kA2> ha0) {
        super(j82);
        C6562gT0.p(j82, "delegate");
        C6562gT0.p(ha0, "onException");
        this.onException = ha0;
    }

    @Override // o.AbstractC3011Fy0, o.J82, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @Override // o.AbstractC3011Fy0, o.J82, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @NotNull
    public final HA0<IOException, C7458kA2> getOnException() {
        return this.onException;
    }

    @Override // o.AbstractC3011Fy0, o.J82
    public void write(@NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(c5422bq, "source");
        if (this.hasErrors) {
            c5422bq.skip(j);
            return;
        }
        try {
            super.write(c5422bq, j);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}

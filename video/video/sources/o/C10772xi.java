package o;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: o.xi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10772xi extends AbstractC3497Kx {
    public final Executor a;
    public final Handler b;

    public C10772xi(Executor executor, Handler handler) {
        if (executor != null) {
            this.a = executor;
            if (handler != null) {
                this.b = handler;
                return;
            }
            throw new NullPointerException("Null schedulerHandler");
        }
        throw new NullPointerException("Null cameraExecutor");
    }

    @Override // o.AbstractC3497Kx
    public Executor b() {
        return this.a;
    }

    @Override // o.AbstractC3497Kx
    public Handler c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3497Kx) {
            AbstractC3497Kx abstractC3497Kx = (AbstractC3497Kx) obj;
            if (this.a.equals(abstractC3497Kx.b()) && this.b.equals(abstractC3497Kx.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.a + ", schedulerHandler=" + this.b + "}";
    }
}

package o;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.l82  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7693l82 extends androidx.camera.core.b {
    public final AtomicBoolean Y0;

    public C7693l82(androidx.camera.core.g gVar) {
        super(gVar);
        this.Y0 = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.b, androidx.camera.core.g, java.lang.AutoCloseable
    public void close() {
        if (!this.Y0.getAndSet(true)) {
            super.close();
        }
    }
}

package okhttp3.internal.cache;

import java.io.IOException;
import o.AbstractC8052mY0;
import o.C6562gT0;
import o.C7458kA2;
import o.HA0;
import okhttp3.internal.cache.DiskLruCache;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class DiskLruCache$Editor$newSink$1$1 extends AbstractC8052mY0 implements HA0<IOException, C7458kA2> {
    final /* synthetic */ DiskLruCache this$0;
    final /* synthetic */ DiskLruCache.Editor this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Editor$newSink$1$1(DiskLruCache diskLruCache, DiskLruCache.Editor editor) {
        super(1);
        this.this$0 = diskLruCache;
        this.this$1 = editor;
    }

    @Override // o.HA0
    public /* bridge */ /* synthetic */ C7458kA2 invoke(IOException iOException) {
        invoke2(iOException);
        return C7458kA2.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull IOException iOException) {
        C6562gT0.p(iOException, "it");
        DiskLruCache diskLruCache = this.this$0;
        DiskLruCache.Editor editor = this.this$1;
        synchronized (diskLruCache) {
            editor.detach$okhttp();
            C7458kA2 c7458kA2 = C7458kA2.a;
        }
    }
}

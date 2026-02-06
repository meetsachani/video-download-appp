package okhttp3.internal.cache;

import java.io.IOException;
import o.AbstractC8052mY0;
import o.C6562gT0;
import o.C7458kA2;
import o.HA0;
import o.InterfaceC8303na2;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$newJournalWriter$faultHidingSink$1\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1065:1\n608#2,4:1066\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$newJournalWriter$faultHidingSink$1\n*L\n304#1:1066,4\n*E\n"})
/* loaded from: classes4.dex */
public final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends AbstractC8052mY0 implements HA0<IOException, C7458kA2> {
    final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.this$0 = diskLruCache;
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
        if (!Util.assertionsEnabled || Thread.holdsLock(diskLruCache)) {
            this.this$0.hasJournalErrors = true;
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
    }
}

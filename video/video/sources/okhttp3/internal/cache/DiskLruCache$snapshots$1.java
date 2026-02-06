package okhttp3.internal.cache;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o.C6562gT0;
import o.C7458kA2;
import o.InterfaceC8303na2;
import o.JW0;
import okhttp3.internal.cache.DiskLruCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$snapshots$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1065:1\n1#2:1066\n*E\n"})
/* loaded from: classes4.dex */
public final class DiskLruCache$snapshots$1 implements Iterator<DiskLruCache.Snapshot>, JW0 {
    @NotNull
    private final Iterator<DiskLruCache.Entry> delegate;
    @Nullable
    private DiskLruCache.Snapshot nextSnapshot;
    @Nullable
    private DiskLruCache.Snapshot removeSnapshot;
    final /* synthetic */ DiskLruCache this$0;

    public DiskLruCache$snapshots$1(DiskLruCache diskLruCache) {
        this.this$0 = diskLruCache;
        Iterator<DiskLruCache.Entry> it = new ArrayList(diskLruCache.getLruEntries$okhttp().values()).iterator();
        C6562gT0.o(it, "ArrayList(lruEntries.values).iterator()");
        this.delegate = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        DiskLruCache.Snapshot snapshot$okhttp;
        if (this.nextSnapshot != null) {
            return true;
        }
        DiskLruCache diskLruCache = this.this$0;
        synchronized (diskLruCache) {
            if (diskLruCache.getClosed$okhttp()) {
                return false;
            }
            while (this.delegate.hasNext()) {
                DiskLruCache.Entry next = this.delegate.next();
                if (next != null && (snapshot$okhttp = next.snapshot$okhttp()) != null) {
                    this.nextSnapshot = snapshot$okhttp;
                    return true;
                }
            }
            C7458kA2 c7458kA2 = C7458kA2.a;
            return false;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        DiskLruCache.Snapshot snapshot = this.removeSnapshot;
        if (snapshot != null) {
            try {
                this.this$0.remove(snapshot.key());
                return;
            } catch (IOException unused) {
                return;
            } finally {
                this.removeSnapshot = null;
            }
        }
        throw new IllegalStateException("remove() before next()");
    }

    @Override // java.util.Iterator
    @NotNull
    public DiskLruCache.Snapshot next() {
        if (hasNext()) {
            DiskLruCache.Snapshot snapshot = this.nextSnapshot;
            this.removeSnapshot = snapshot;
            this.nextSnapshot = null;
            C6562gT0.m(snapshot);
            return snapshot;
        }
        throw new NoSuchElementException();
    }
}

package okhttp3;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o.C5033aE;
import o.C6562gT0;
import o.C9604su1;
import o.InterfaceC8303na2;
import o.JW0;
import okhttp3.internal.cache.DiskLruCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nokhttp3/Cache$urls$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,788:1\n1#2:789\n*E\n"})
/* loaded from: classes4.dex */
public final class Cache$urls$1 implements Iterator<String>, JW0 {
    private boolean canRemove;
    @NotNull
    private final Iterator<DiskLruCache.Snapshot> delegate;
    @Nullable
    private String nextUrl;

    public Cache$urls$1(Cache cache) {
        this.delegate = cache.getCache$okhttp().snapshots();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.nextUrl != null) {
            return true;
        }
        this.canRemove = false;
        while (this.delegate.hasNext()) {
            try {
                DiskLruCache.Snapshot next = this.delegate.next();
                this.nextUrl = C9604su1.e(next.getSource(0)).k2();
                C5033aE.a(next, null);
                return true;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.canRemove) {
            this.delegate.remove();
            return;
        }
        throw new IllegalStateException("remove() before next()");
    }

    @Override // java.util.Iterator
    @NotNull
    public String next() {
        if (hasNext()) {
            String str = this.nextUrl;
            C6562gT0.m(str);
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }
        throw new NoSuchElementException();
    }
}

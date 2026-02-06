package o;

import o.AbstractC10291vk;

/* renamed from: o.qi  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9062qi extends AbstractC10291vk {
    public final AbstractC10291vk.a a;
    public final long b;

    public C9062qi(AbstractC10291vk.a aVar, long j) {
        if (aVar != null) {
            this.a = aVar;
            this.b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // o.AbstractC10291vk
    public long b() {
        return this.b;
    }

    @Override // o.AbstractC10291vk
    public AbstractC10291vk.a c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC10291vk) {
            AbstractC10291vk abstractC10291vk = (AbstractC10291vk) obj;
            if (this.a.equals(abstractC10291vk.c()) && this.b == abstractC10291vk.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.b;
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.a + ", nextRequestWaitMillis=" + this.b + "}";
    }
}

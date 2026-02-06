package o;

/* renamed from: o.jq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7374jq extends RuntimeException {
    public final Throwable X;

    public C7374jq() {
        this.X = null;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.X;
    }

    public C7374jq(String str) {
        this(str, null);
    }

    public C7374jq(String str, Throwable th) {
        super(str);
        this.X = th;
    }
}

package o;

import java.util.NoSuchElementException;

/* renamed from: o.lq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7860lq extends NoSuchElementException {
    public final Throwable X;

    public C7860lq() {
        this.X = null;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.X;
    }

    public C7860lq(String str) {
        this(str, null);
    }

    public C7860lq(String str, Throwable th) {
        super(str);
        this.X = th;
    }
}

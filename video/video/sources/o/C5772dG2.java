package o;

@Deprecated
/* renamed from: o.dG2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5772dG2 extends Exception {
    public final long X;

    public C5772dG2(String str) {
        this(str, (long) C10323vs.b);
    }

    public static C5772dG2 a(Exception exc) {
        return b(exc, C10323vs.b);
    }

    public static C5772dG2 b(Exception exc, long j) {
        if (exc instanceof C5772dG2) {
            return (C5772dG2) exc;
        }
        return new C5772dG2(exc, j);
    }

    public C5772dG2(String str, long j) {
        super(str);
        this.X = j;
    }

    public C5772dG2(String str, Throwable th) {
        this(str, th, C10323vs.b);
    }

    public C5772dG2(String str, Throwable th, long j) {
        super(str, th);
        this.X = j;
    }

    public C5772dG2(Throwable th) {
        this(th, (long) C10323vs.b);
    }

    public C5772dG2(Throwable th, long j) {
        super(th);
        this.X = j;
    }
}

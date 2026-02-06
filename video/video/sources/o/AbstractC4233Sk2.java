package o;

@Deprecated
/* renamed from: o.Sk2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4233Sk2 {
    public final InterfaceC10568wr2 a;

    /* renamed from: o.Sk2$a */
    /* loaded from: classes2.dex */
    public static final class a extends C3989Py1 {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    public AbstractC4233Sk2(InterfaceC10568wr2 interfaceC10568wr2) {
        this.a = interfaceC10568wr2;
    }

    public final boolean a(C3012Fy1 c3012Fy1, long j) throws C3989Py1 {
        if (b(c3012Fy1) && c(c3012Fy1, j)) {
            return true;
        }
        return false;
    }

    public abstract boolean b(C3012Fy1 c3012Fy1) throws C3989Py1;

    public abstract boolean c(C3012Fy1 c3012Fy1, long j) throws C3989Py1;

    public abstract void d();
}

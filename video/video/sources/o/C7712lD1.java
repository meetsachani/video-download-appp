package o;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6584ga0
/* renamed from: o.lD1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7712lD1 {
    public static final ThreadLocal<char[]> a = new a();

    /* renamed from: o.lD1$a */
    /* loaded from: classes3.dex */
    public class a extends ThreadLocal<char[]> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public char[] initialValue() {
            return new char[1024];
        }
    }

    public static char[] a() {
        return a.get();
    }
}

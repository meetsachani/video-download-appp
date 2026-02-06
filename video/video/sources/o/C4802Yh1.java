package o;

/* renamed from: o.Yh1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4802Yh1 {

    /* renamed from: o.Yh1$a */
    /* loaded from: classes2.dex */
    public enum a implements InterfaceC4705Xh1<Object> {
        INSTANCE;

        @Override // o.InterfaceC4705Xh1
        public void e(Object obj) {
            C10421wF1.c(obj, "Cannot inject members into a null reference");
        }
    }

    public static <T> InterfaceC4705Xh1<T> a() {
        return a.INSTANCE;
    }
}

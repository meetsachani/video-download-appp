package o;

@InterfaceC6615gi
/* renamed from: o.vk  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10291vk {

    /* renamed from: o.vk$a */
    /* loaded from: classes2.dex */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static AbstractC10291vk a() {
        return new C9062qi(a.FATAL_ERROR, -1L);
    }

    public static AbstractC10291vk d() {
        return new C9062qi(a.INVALID_PAYLOAD, -1L);
    }

    public static AbstractC10291vk e(long j) {
        return new C9062qi(a.OK, j);
    }

    public static AbstractC10291vk f() {
        return new C9062qi(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}

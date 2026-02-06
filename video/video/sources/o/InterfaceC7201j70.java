package o;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import java.util.UUID;
import o.InterfaceC8921q70;

@Deprecated
/* renamed from: o.j70  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC7201j70 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;

    /* renamed from: o.j70$a */
    /* loaded from: classes2.dex */
    public static class a extends IOException {
        public final int X;

        public a(Throwable th, int i) {
            super(th);
            this.X = i;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.j70$b */
    /* loaded from: classes2.dex */
    public @interface b {
    }

    static void e(@InterfaceC11300zs1 InterfaceC7201j70 interfaceC7201j70, @InterfaceC11300zs1 InterfaceC7201j70 interfaceC7201j702) {
        if (interfaceC7201j70 != interfaceC7201j702) {
            if (interfaceC7201j702 != null) {
                interfaceC7201j702.f(null);
            }
            if (interfaceC7201j70 != null) {
                interfaceC7201j70.h(null);
            }
        }
    }

    UUID a();

    default boolean b() {
        return false;
    }

    @InterfaceC11300zs1
    byte[] c();

    @InterfaceC11300zs1
    InterfaceC7280jR d();

    void f(@InterfaceC11300zs1 InterfaceC8921q70.a aVar);

    @InterfaceC11300zs1
    Map<String, String> g();

    int getState();

    void h(@InterfaceC11300zs1 InterfaceC8921q70.a aVar);

    @InterfaceC11300zs1
    a i();

    boolean j(String str);
}

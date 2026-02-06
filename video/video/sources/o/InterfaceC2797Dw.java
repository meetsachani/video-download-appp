package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* renamed from: o.Dw */
/* loaded from: classes.dex */
public interface InterfaceC2797Dw {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Dw$a */
    /* loaded from: classes.dex */
    public @interface a {
    }

    /* renamed from: o.Dw$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(int i, int i2);
    }

    List<List<C2898Ex>> a();

    void b(List<InterfaceC6420fx> list);

    void c(b bVar);

    String d(String str);

    int e();

    void f(b bVar);

    List<InterfaceC6420fx> g();

    void h(int i);

    void shutdown();
}

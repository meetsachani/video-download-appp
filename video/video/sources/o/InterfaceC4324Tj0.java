package o;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* renamed from: o.Tj0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC4324Tj0 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = -1;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Tj0$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    void a(long j, long j2);

    void b(InterfaceC4518Vj0 interfaceC4518Vj0);

    boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException;

    void g();

    int j(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException;
}

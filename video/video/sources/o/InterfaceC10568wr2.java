package o;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

@Deprecated
/* renamed from: o.wr2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC10568wr2 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;

    /* renamed from: o.wr2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final int a;
        public final byte[] b;
        public final int c;
        public final int d;

        public a(int i, byte[] bArr, int i2, int i3) {
            this.a = i;
            this.b = bArr;
            this.c = i2;
            this.d = i3;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.c == aVar.c && this.d == aVar.d && Arrays.equals(this.b, aVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.wr2$b */
    /* loaded from: classes2.dex */
    public @interface b {
    }

    void a(C10833xx0 c10833xx0);

    void b(long j, int i, int i2, int i3, @InterfaceC11300zs1 a aVar);

    default int c(CU cu, int i, boolean z) throws IOException {
        return d(cu, i, z, 0);
    }

    int d(CU cu, int i, boolean z, int i2) throws IOException;

    default void e(C3012Fy1 c3012Fy1, int i) {
        f(c3012Fy1, i, 0);
    }

    void f(C3012Fy1 c3012Fy1, int i, int i2);
}

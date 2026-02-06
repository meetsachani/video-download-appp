package o;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* loaded from: classes2.dex */
public interface M11 {
    public static final int a = 1;
    public static final int b = 2;

    /* loaded from: classes2.dex */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public boolean a(int i) {
            if (i == 1) {
                if (this.a - this.b <= 1) {
                    return false;
                }
                return true;
            } else if (this.c - this.d <= 1) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public final int a;
        public final long b;

        public b(int i, long j) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            this.a = i;
            this.b = j;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface c {
    }

    /* loaded from: classes2.dex */
    public static final class d {
        public final N11 a;
        public final C10519wf1 b;
        public final IOException c;
        public final int d;

        public d(N11 n11, C10519wf1 c10519wf1, IOException iOException, int i) {
            this.a = n11;
            this.b = c10519wf1;
            this.c = iOException;
            this.d = i;
        }
    }

    int a(int i);

    @InterfaceC11300zs1
    b b(a aVar, d dVar);

    long d(d dVar);

    default void c(long j) {
    }
}

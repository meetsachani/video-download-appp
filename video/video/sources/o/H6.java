package o;

import android.view.View;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* loaded from: classes2.dex */
public final class H6 {
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public final View a;
    public final int b;
    @InterfaceC11300zs1
    public final String c;

    /* loaded from: classes2.dex */
    public static final class a {
        public final View a;
        public final int b;
        @InterfaceC11300zs1
        public String c;

        public a(View view, int i) {
            this.a = view;
            this.b = i;
        }

        public H6 a() {
            return new H6(this.a, this.b, this.c);
        }

        @InterfaceC6181ey
        public a b(@InterfaceC11300zs1 String str) {
            this.c = str;
            return this;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface b {
    }

    @Deprecated
    public H6(View view, int i) {
        this(view, i, null);
    }

    @Deprecated
    public H6(View view, int i, @InterfaceC11300zs1 String str) {
        this.a = view;
        this.b = i;
        this.c = str;
    }
}

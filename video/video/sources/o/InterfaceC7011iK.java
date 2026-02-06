package o;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: o.iK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC7011iK {

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.iK$a */
    /* loaded from: classes3.dex */
    public @interface a {
        public static final int Z0 = 0;
        public static final int a1 = 1;
        public static final int b1 = 2;
        public static final int c1 = 3;
    }

    /* renamed from: o.iK$b */
    /* loaded from: classes3.dex */
    public interface b {
        void a(@RecentlyNonNull C10101ux0 c10101ux0);
    }

    /* renamed from: o.iK$c */
    /* loaded from: classes3.dex */
    public interface c {
        void a();
    }

    /* renamed from: o.iK$d */
    /* loaded from: classes3.dex */
    public enum d {
        UNKNOWN,
        NOT_REQUIRED,
        REQUIRED
    }

    int a();

    boolean b();

    @RecentlyNonNull
    d c();

    boolean d();

    void e(@RecentlyNonNull Activity activity, @RecentlyNonNull C7252jK c7252jK, @RecentlyNonNull c cVar, @RecentlyNonNull b bVar);

    void reset();
}

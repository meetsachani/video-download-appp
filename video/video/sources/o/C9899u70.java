package o;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.KY;

@Deprecated
/* renamed from: o.u70  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9899u70 {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;

    @ES1(18)
    /* renamed from: o.u70$a */
    /* loaded from: classes2.dex */
    public static final class a {
        @K40
        public static boolean a(@InterfaceC11300zs1 Throwable th) {
            return th instanceof DeniedByServerException;
        }

        @K40
        public static boolean b(@InterfaceC11300zs1 Throwable th) {
            return th instanceof NotProvisionedException;
        }
    }

    @ES1(21)
    /* renamed from: o.u70$b */
    /* loaded from: classes2.dex */
    public static final class b {
        @K40
        public static boolean a(@InterfaceC11300zs1 Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        @K40
        public static int b(Throwable th) {
            return TD2.l0(TD2.m0(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    @ES1(23)
    /* renamed from: o.u70$c */
    /* loaded from: classes2.dex */
    public static final class c {
        @K40
        public static boolean a(@InterfaceC11300zs1 Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.u70$d */
    /* loaded from: classes2.dex */
    public @interface d {
    }

    public static int a(Exception exc, int i) {
        int i2 = TD2.a;
        if (i2 >= 21 && b.a(exc)) {
            return b.b(exc);
        }
        if (i2 >= 23 && c.a(exc)) {
            return AD1.C1;
        }
        if (i2 >= 18 && a.b(exc)) {
            return 6002;
        }
        if (i2 >= 18 && a.a(exc)) {
            return AD1.D1;
        }
        if (exc instanceof C5513cC2) {
            return 6001;
        }
        if (exc instanceof KY.e) {
            return 6003;
        }
        if (exc instanceof QX0) {
            return AD1.E1;
        }
        if (i == 1) {
            return AD1.C1;
        }
        if (i == 2) {
            return AD1.A1;
        }
        if (i == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }
}

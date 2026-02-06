package o;

import androidx.lifecycle.LiveData;

/* renamed from: o.Jv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3395Jv1 {
    public static final b.c a = new b.c();
    public static final b.C0197b b = new b.C0197b();

    /* renamed from: o.Jv1$b */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: o.Jv1$b$a */
        /* loaded from: classes.dex */
        public static final class a extends b {
            public final Throwable a;

            public a(Throwable exception) {
                this.a = exception;
            }

            public Throwable a() {
                return this.a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.a.getMessage());
            }
        }

        /* renamed from: o.Jv1$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0197b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            public C0197b() {
            }
        }

        /* renamed from: o.Jv1$b$c */
        /* loaded from: classes.dex */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            public c() {
            }
        }
    }

    InterfaceFutureC8411o11<b.c> getResult();

    LiveData<b> getState();
}

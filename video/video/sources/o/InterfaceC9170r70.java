package o;

import android.os.Looper;
import o.InterfaceC7201j70;
import o.InterfaceC8921q70;
import o.InterfaceC9170r70;

@Deprecated
/* renamed from: o.r70  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC9170r70 {
    public static final InterfaceC9170r70 a;
    @Deprecated
    public static final InterfaceC9170r70 b;

    /* renamed from: o.r70$b */
    /* loaded from: classes2.dex */
    public interface b {
        public static final b a = new b() { // from class: o.s70
            @Override // o.InterfaceC9170r70.b
            public final void g() {
                InterfaceC9170r70.b.a();
            }
        };

        static /* synthetic */ void a() {
        }

        void g();
    }

    static {
        a aVar = new a();
        a = aVar;
        b = aVar;
    }

    @Deprecated
    static InterfaceC9170r70 c() {
        return a;
    }

    @InterfaceC11300zs1
    InterfaceC7201j70 a(@InterfaceC11300zs1 InterfaceC8921q70.a aVar, C10833xx0 c10833xx0);

    default b b(@InterfaceC11300zs1 InterfaceC8921q70.a aVar, C10833xx0 c10833xx0) {
        return b.a;
    }

    int d(C10833xx0 c10833xx0);

    void e(Looper looper, ND1 nd1);

    default void g() {
    }

    default void m0() {
    }

    /* renamed from: o.r70$a */
    /* loaded from: classes2.dex */
    public class a implements InterfaceC9170r70 {
        @Override // o.InterfaceC9170r70
        @InterfaceC11300zs1
        public InterfaceC7201j70 a(@InterfaceC11300zs1 InterfaceC8921q70.a aVar, C10833xx0 c10833xx0) {
            if (c10833xx0.j1 == null) {
                return null;
            }
            return new C10025ue0(new InterfaceC7201j70.a(new C5513cC2(1), 6001));
        }

        @Override // o.InterfaceC9170r70
        public int d(C10833xx0 c10833xx0) {
            if (c10833xx0.j1 != null) {
                return 1;
            }
            return 0;
        }

        @Override // o.InterfaceC9170r70
        public void e(Looper looper, ND1 nd1) {
        }
    }
}

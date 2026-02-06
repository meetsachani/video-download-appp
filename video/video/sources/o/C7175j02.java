package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.j02  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7175j02 {
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    @NotNull
    public static final XA0<Object, Object, Object, Object> a = a.X;
    @NotNull
    public static final C7592kj2 f = new C7592kj2("STATE_REG");
    @NotNull
    public static final C7592kj2 g = new C7592kj2("STATE_COMPLETED");
    @NotNull
    public static final C7592kj2 h = new C7592kj2("STATE_CANCELLED");
    @NotNull
    public static final C7592kj2 i = new C7592kj2("NO_RESULT");
    @NotNull
    public static final C7592kj2 j = new C7592kj2("PARAM_CLAUSE_0");

    /* renamed from: o.j02$a */
    /* loaded from: classes4.dex */
    public static final class a implements XA0 {
        public static final a X = new a();

        @Override // o.XA0
        /* renamed from: c */
        public final Void P(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    public static final Tu2 d(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        return Tu2.Y0;
                    }
                    throw new IllegalStateException(("Unexpected internal result: " + i2).toString());
                }
                return Tu2.Z;
            }
            return Tu2.Y;
        }
        return Tu2.X;
    }

    @NotNull
    public static final C7592kj2 l() {
        return j;
    }

    @Nullable
    public static final <R> Object m(@NotNull HA0<? super XZ1<? super R>, C7458kA2> ha0, @NotNull HM<? super R> hm) {
        C6436g02 c6436g02 = new C6436g02(hm.getContext());
        ha0.invoke(c6436g02);
        return c6436g02.w(hm);
    }

    public static final <R> Object n(HA0<? super XZ1<? super R>, C7458kA2> ha0, HM<? super R> hm) {
        UP0.e(3);
        throw null;
    }

    public static final boolean o(InterfaceC8396ny<? super C7458kA2> interfaceC8396ny, XA0<? super Throwable, Object, ? super InterfaceC5809dQ, C7458kA2> xa0) {
        Object I = interfaceC8396ny.I(C7458kA2.a, null, xa0);
        if (I == null) {
            return false;
        }
        interfaceC8396ny.j0(I);
        return true;
    }

    @InterfaceC10472wS0
    public static /* synthetic */ void a() {
    }

    @InterfaceC10472wS0
    public static /* synthetic */ void b() {
    }

    @InterfaceC10472wS0
    public static /* synthetic */ void c() {
    }
}

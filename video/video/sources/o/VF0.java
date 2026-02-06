package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 2 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,212:1\n13#2:213\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n*L\n140#1:213\n*E\n"})
/* loaded from: classes3.dex */
public final class VF0 extends WF0 implements O10 {
    @Nullable
    public final String Y0;
    @NotNull
    public final Handler Z;
    public final boolean Z0;
    @NotNull
    public final VF0 a1;

    @InterfaceC8303na2({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n141#2:14\n142#2:16\n1#3:15\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public final /* synthetic */ InterfaceC8396ny X;
        public final /* synthetic */ VF0 Y;

        public a(InterfaceC8396ny interfaceC8396ny, VF0 vf0) {
            this.X = interfaceC8396ny;
            this.Y = vf0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.X.E(this.Y, C7458kA2.a);
        }
    }

    public VF0(Handler handler, String str, boolean z) {
        super(null);
        this.Z = handler;
        this.Y0 = str;
        this.Z0 = z;
        this.a1 = z ? this : new VF0(handler, str, true);
    }

    public static final void p0(VF0 vf0, Runnable runnable) {
        vf0.Z.removeCallbacks(runnable);
    }

    public static final C7458kA2 q0(VF0 vf0, Runnable runnable, Throwable th) {
        vf0.Z.removeCallbacks(runnable);
        return C7458kA2.a;
    }

    @Override // o.O10
    public void E(long j, @NotNull InterfaceC8396ny<? super C7458kA2> interfaceC8396ny) {
        final a aVar = new a(interfaceC8396ny, this);
        if (this.Z.postDelayed(aVar, C5075aO1.C(j, 4611686018427387903L))) {
            interfaceC8396ny.X(new HA0() { // from class: o.UF0
                @Override // o.HA0
                public final Object invoke(Object obj) {
                    C7458kA2 q0;
                    q0 = VF0.q0(VF0.this, aVar, (Throwable) obj);
                    return q0;
                }
            });
        } else {
            m0(interfaceC8396ny.getContext(), aVar);
        }
    }

    @Override // o.AbstractC7762lQ
    public void I(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Runnable runnable) {
        if (!this.Z.post(runnable)) {
            m0(interfaceC5809dQ, runnable);
        }
    }

    @Override // o.AbstractC7762lQ
    public boolean U(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        if (this.Z0 && C6562gT0.g(Looper.myLooper(), this.Z.getLooper())) {
            return false;
        }
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof VF0) {
            VF0 vf0 = (VF0) obj;
            if (vf0.Z == this.Z && vf0.Z0 == this.Z0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int identityHashCode = System.identityHashCode(this.Z);
        if (this.Z0) {
            i = 1231;
        } else {
            i = 1237;
        }
        return identityHashCode ^ i;
    }

    public final void m0(InterfaceC5809dQ interfaceC5809dQ, Runnable runnable) {
        C5829dV0.f(interfaceC5809dQ, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C8909q40.c().I(interfaceC5809dQ, runnable);
    }

    @Override // o.WF0
    @NotNull
    /* renamed from: n0 */
    public VF0 j0() {
        return this.a1;
    }

    @Override // o.WF0, o.O10
    @NotNull
    public B40 o(long j, @NotNull final Runnable runnable, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        if (this.Z.postDelayed(runnable, C5075aO1.C(j, 4611686018427387903L))) {
            return new B40() { // from class: o.TF0
                @Override // o.B40
                public final void e() {
                    VF0.p0(VF0.this, runnable);
                }
            };
        }
        m0(interfaceC5809dQ, runnable);
        return C4741Xq1.X;
    }

    @Override // o.AbstractC8922q71, o.AbstractC7762lQ
    @NotNull
    public String toString() {
        String g0 = g0();
        if (g0 == null) {
            String str = this.Y0;
            if (str == null) {
                str = this.Z.toString();
            }
            if (this.Z0) {
                return str + ".immediate";
            }
            return str;
        }
        return g0;
    }

    public /* synthetic */ VF0(Handler handler, String str, int i, C9516sY c9516sY) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public VF0(@NotNull Handler handler, @Nullable String str) {
        this(handler, str, false);
    }
}

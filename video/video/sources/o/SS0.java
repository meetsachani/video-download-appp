package o;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class SS0 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @FV(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class a<T> extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super T>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ FA0<T> b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(FA0<? extends T> fa0, HM<? super a> hm) {
            super(2, hm);
            this.b1 = fa0;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            C7289jT0.l();
            if (this.Z0 == 0) {
                RT1.n(obj);
                return SS0.d(((InterfaceC9974uQ) this.a1).a0(), this.b1);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super T> hm) {
            return ((a) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            a aVar = new a(this.b1, hm);
            aVar.a1 = obj;
            return aVar;
        }
    }

    @Nullable
    public static final <T> Object b(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull FA0<? extends T> fa0, @NotNull HM<? super T> hm) {
        return C5426br.h(interfaceC5809dQ, new a(fa0, null), hm);
    }

    public static /* synthetic */ Object c(InterfaceC5809dQ interfaceC5809dQ, FA0 fa0, HM hm, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC5809dQ = C3897Pa0.X;
        }
        return b(interfaceC5809dQ, fa0, hm);
    }

    public static final <T> T d(InterfaceC5809dQ interfaceC5809dQ, FA0<? extends T> fa0) {
        try {
            C4145Rn2 c4145Rn2 = new C4145Rn2();
            c4145Rn2.N(C5829dV0.A(interfaceC5809dQ));
            T invoke = fa0.invoke();
            c4145Rn2.H();
            return invoke;
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}

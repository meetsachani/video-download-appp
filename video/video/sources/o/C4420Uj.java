package o;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.PT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,121:1\n351#2,9:122\n360#2,2:133\n13346#3,2:131\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n*L\n63#1:122,9\n63#1:133,2\n75#1:131,2\n*E\n"})
/* renamed from: o.Uj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4420Uj<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(C4420Uj.class, "notCompletedCount$volatile");
    @NotNull
    public final J10<T>[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    @InterfaceC8303na2({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,121:1\n11102#2:122\n11437#2,3:123\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n*L\n115#1:122\n115#1:123,3\n*E\n"})
    /* renamed from: o.Uj$a */
    /* loaded from: classes3.dex */
    public final class a extends AbstractC6569gV0 {
        public static final /* synthetic */ AtomicReferenceFieldUpdater c1 = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        @NotNull
        public final InterfaceC8396ny<List<? extends T>> Z0;
        private volatile /* synthetic */ Object _disposer$volatile;
        public B40 a1;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull InterfaceC8396ny<? super List<? extends T>> interfaceC8396ny) {
            this.Z0 = interfaceC8396ny;
        }

        @Override // o.AbstractC6569gV0
        public boolean E() {
            return false;
        }

        @Override // o.AbstractC6569gV0
        public void F(@Nullable Throwable th) {
            if (th != null) {
                Object w = this.Z0.w(th);
                if (w != null) {
                    this.Z0.j0(w);
                    C4420Uj<T>.b H = H();
                    if (H != null) {
                        H.a();
                    }
                }
            } else if (C4420Uj.b().decrementAndGet(C4420Uj.this) == 0) {
                InterfaceC8396ny<List<? extends T>> interfaceC8396ny = this.Z0;
                J10[] j10Arr = C4420Uj.this.a;
                ArrayList arrayList = new ArrayList(j10Arr.length);
                for (J10 j10 : j10Arr) {
                    arrayList.add(j10.p());
                }
                PT1.a aVar = PT1.Y;
                interfaceC8396ny.q(PT1.b(arrayList));
            }
        }

        @Nullable
        public final C4420Uj<T>.b H() {
            return (b) c1.get(this);
        }

        @NotNull
        public final B40 I() {
            B40 b40 = this.a1;
            if (b40 != null) {
                return b40;
            }
            C6562gT0.S("handle");
            return null;
        }

        public final /* synthetic */ Object J() {
            return this._disposer$volatile;
        }

        public final void L(@Nullable C4420Uj<T>.b bVar) {
            c1.set(this, bVar);
        }

        public final void M(@NotNull B40 b40) {
            this.a1 = b40;
        }

        public final /* synthetic */ void N(Object obj) {
            this._disposer$volatile = obj;
        }
    }

    @InterfaceC8303na2({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,121:1\n13346#2,2:122\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n*L\n88#1:122,2\n*E\n"})
    /* renamed from: o.Uj$b */
    /* loaded from: classes3.dex */
    public final class b implements InterfaceC7406jy {
        @NotNull
        public final C4420Uj<T>.a[] X;

        public b(@NotNull C4420Uj<T>.a[] aVarArr) {
            this.X = aVarArr;
        }

        public final void a() {
            for (C4420Uj<T>.a aVar : this.X) {
                aVar.I().e();
            }
        }

        @Override // o.InterfaceC7406jy
        public void d(@Nullable Throwable th) {
            a();
        }

        @NotNull
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.X + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4420Uj(@NotNull J10<? extends T>[] j10Arr) {
        this.a = j10Arr;
        this.notCompletedCount$volatile = j10Arr.length;
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater b() {
        return b;
    }

    @Nullable
    public final Object c(@NotNull HM<? super List<? extends T>> hm) {
        B40 B;
        C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
        c8883py.Z();
        int length = this.a.length;
        a[] aVarArr = new a[length];
        for (int i = 0; i < length; i++) {
            J10 j10 = this.a[i];
            j10.start();
            a aVar = new a(c8883py);
            B = C6314fV0.B(j10, false, aVar, 1, null);
            aVar.M(B);
            C7458kA2 c7458kA2 = C7458kA2.a;
            aVarArr[i] = aVar;
        }
        C4420Uj<T>.b bVar = new b(aVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            aVarArr[i2].L(bVar);
        }
        if (c8883py.l()) {
            bVar.a();
        } else {
            C9375ry.c(c8883py, bVar);
        }
        Object A = c8883py.A();
        if (A == C7289jT0.l()) {
            MV.c(hm);
        }
        return A;
    }

    public final /* synthetic */ int d() {
        return this.notCompletedCount$volatile;
    }

    public final /* synthetic */ void f(int i) {
        this.notCompletedCount$volatile = i;
    }
}

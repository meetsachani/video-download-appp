package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.PT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HK1
@InterfaceC6480g82(version = "1.3")
/* renamed from: o.tX1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9758tX1<T> implements HM<T>, InterfaceC10706xQ {
    @NotNull
    public static final a Y = new a(null);
    public static final AtomicReferenceFieldUpdater<C9758tX1<?>, Object> Z = AtomicReferenceFieldUpdater.newUpdater(C9758tX1.class, Object.class, "result");
    @NotNull
    public final HM<T> X;
    @Nullable
    private volatile Object result;

    /* renamed from: o.tX1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }

        public static /* synthetic */ void a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9758tX1(@NotNull HM<? super T> hm, @Nullable Object obj) {
        C6562gT0.p(hm, "delegate");
        this.X = hm;
        this.result = obj;
    }

    @Override // o.InterfaceC10706xQ
    @Nullable
    public StackTraceElement Y() {
        return null;
    }

    @HK1
    @Nullable
    public final Object a() {
        Object obj = this.result;
        EnumC10463wQ enumC10463wQ = EnumC10463wQ.Y;
        if (obj == enumC10463wQ) {
            if (P2.a(Z, this, enumC10463wQ, C7289jT0.l())) {
                return C7289jT0.l();
            }
            obj = this.result;
        }
        if (obj == EnumC10463wQ.Z) {
            return C7289jT0.l();
        }
        if (!(obj instanceof PT1.b)) {
            return obj;
        }
        throw ((PT1.b) obj).X;
    }

    @Override // o.InterfaceC10706xQ
    @Nullable
    public InterfaceC10706xQ g() {
        HM<T> hm = this.X;
        if (hm instanceof InterfaceC10706xQ) {
            return (InterfaceC10706xQ) hm;
        }
        return null;
    }

    @Override // o.HM
    @NotNull
    public InterfaceC5809dQ getContext() {
        return this.X.getContext();
    }

    @Override // o.HM
    public void q(@NotNull Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC10463wQ enumC10463wQ = EnumC10463wQ.Y;
            if (obj2 == enumC10463wQ) {
                if (P2.a(Z, this, enumC10463wQ, obj)) {
                    return;
                }
            } else if (obj2 == C7289jT0.l()) {
                if (P2.a(Z, this, C7289jT0.l(), EnumC10463wQ.Z)) {
                    this.X.q(obj);
                    return;
                }
            } else {
                throw new IllegalStateException("Already resumed");
            }
        }
    }

    @NotNull
    public String toString() {
        return "SafeContinuation for " + this.X;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @HK1
    public C9758tX1(@NotNull HM<? super T> hm) {
        this(hm, EnumC10463wQ.Y);
        C6562gT0.p(hm, "delegate");
    }
}

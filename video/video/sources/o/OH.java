package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CompletedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,701:1\n1#2:702\n*E\n"})
/* loaded from: classes3.dex */
public final class OH<R> {
    @InterfaceC7058iW0
    public final R a;
    @InterfaceC7058iW0
    @Nullable
    public final InterfaceC7406jy b;
    @InterfaceC7058iW0
    @Nullable
    public final XA0<Throwable, R, InterfaceC5809dQ, C7458kA2> c;
    @InterfaceC7058iW0
    @Nullable
    public final Object d;
    @InterfaceC7058iW0
    @Nullable
    public final Throwable e;

    /* JADX WARN: Multi-variable type inference failed */
    public OH(R r, @Nullable InterfaceC7406jy interfaceC7406jy, @Nullable XA0<? super Throwable, ? super R, ? super InterfaceC5809dQ, C7458kA2> xa0, @Nullable Object obj, @Nullable Throwable th) {
        this.a = r;
        this.b = interfaceC7406jy;
        this.c = xa0;
        this.d = obj;
        this.e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OH g(OH oh, Object obj, InterfaceC7406jy interfaceC7406jy, XA0 xa0, Object obj2, Throwable th, int i, Object obj3) {
        R r = obj;
        if ((i & 1) != 0) {
            r = oh.a;
        }
        if ((i & 2) != 0) {
            interfaceC7406jy = oh.b;
        }
        XA0<Throwable, R, InterfaceC5809dQ, C7458kA2> xa02 = xa0;
        if ((i & 4) != 0) {
            xa02 = oh.c;
        }
        if ((i & 8) != 0) {
            obj2 = oh.d;
        }
        if ((i & 16) != 0) {
            th = oh.e;
        }
        Throwable th2 = th;
        XA0 xa03 = xa02;
        return oh.f(r, interfaceC7406jy, xa03, obj2, th2);
    }

    public final R a() {
        return this.a;
    }

    @Nullable
    public final InterfaceC7406jy b() {
        return this.b;
    }

    @Nullable
    public final XA0<Throwable, R, InterfaceC5809dQ, C7458kA2> c() {
        return this.c;
    }

    @Nullable
    public final Object d() {
        return this.d;
    }

    @Nullable
    public final Throwable e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OH)) {
            return false;
        }
        OH oh = (OH) obj;
        if (C6562gT0.g(this.a, oh.a) && C6562gT0.g(this.b, oh.b) && C6562gT0.g(this.c, oh.c) && C6562gT0.g(this.d, oh.d) && C6562gT0.g(this.e, oh.e)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final OH<R> f(R r, @Nullable InterfaceC7406jy interfaceC7406jy, @Nullable XA0<? super Throwable, ? super R, ? super InterfaceC5809dQ, C7458kA2> xa0, @Nullable Object obj, @Nullable Throwable th) {
        return new OH<>(r, interfaceC7406jy, xa0, obj, th);
    }

    public final boolean h() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        R r = this.a;
        int i = 0;
        if (r == null) {
            hashCode = 0;
        } else {
            hashCode = r.hashCode();
        }
        int i2 = hashCode * 31;
        InterfaceC7406jy interfaceC7406jy = this.b;
        if (interfaceC7406jy == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = interfaceC7406jy.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        XA0<Throwable, R, InterfaceC5809dQ, C7458kA2> xa0 = this.c;
        if (xa0 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = xa0.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Object obj = this.d;
        if (obj == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Throwable th = this.e;
        if (th != null) {
            i = th.hashCode();
        }
        return i5 + i;
    }

    public final void i(@NotNull C8883py<?> c8883py, @NotNull Throwable th) {
        InterfaceC7406jy interfaceC7406jy = this.b;
        if (interfaceC7406jy != null) {
            c8883py.n(interfaceC7406jy, th);
        }
        XA0<Throwable, R, InterfaceC5809dQ, C7458kA2> xa0 = this.c;
        if (xa0 != null) {
            c8883py.r(xa0, th, this.a);
        }
    }

    @NotNull
    public String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ OH(Object obj, InterfaceC7406jy interfaceC7406jy, XA0 xa0, Object obj2, Throwable th, int i, C9516sY c9516sY) {
        this(obj, (i & 2) != 0 ? null : interfaceC7406jy, (i & 4) != 0 ? null : xa0, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}

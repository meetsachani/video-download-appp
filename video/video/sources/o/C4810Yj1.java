package o;

import o.O10;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MissingMainCoroutineDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
/* renamed from: o.Yj1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4810Yj1 extends AbstractC8922q71 implements O10 {
    @Nullable
    public final String Y0;
    @Nullable
    public final Throwable Z;

    public /* synthetic */ C4810Yj1(Throwable th, String str, int i, C9516sY c9516sY) {
        this(th, (i & 2) != 0 ? null : str);
    }

    @Override // o.AbstractC7762lQ
    public boolean U(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        k0();
        throw new SX0();
    }

    @Override // o.AbstractC8922q71, o.AbstractC7762lQ
    @NotNull
    public AbstractC7762lQ W(int i, @Nullable String str) {
        k0();
        throw new SX0();
    }

    @Override // o.AbstractC7762lQ
    @NotNull
    /* renamed from: j0 */
    public Void I(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Runnable runnable) {
        k0();
        throw new SX0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Void k0() {
        String str;
        if (this.Z != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Module with the Main dispatcher had failed to initialize");
            String str2 = this.Y0;
            if (str2 != null) {
                str = ". " + str2;
            }
            str = "";
            sb.append(str);
            throw new IllegalStateException(sb.toString(), this.Z);
        }
        C9657t71.e();
        throw new SX0();
    }

    @Override // o.O10
    @NotNull
    /* renamed from: l0 */
    public Void E(long j, @NotNull InterfaceC8396ny<? super C7458kA2> interfaceC8396ny) {
        k0();
        throw new SX0();
    }

    @Override // o.O10
    @NotNull
    public B40 o(long j, @NotNull Runnable runnable, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        k0();
        throw new SX0();
    }

    @Override // o.AbstractC8922q71, o.AbstractC7762lQ
    @NotNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.Z != null) {
            str = ", cause=" + this.Z;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    @Override // o.O10
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object z(long j, @NotNull HM<? super C7458kA2> hm) {
        return O10.a.a(this, j, hm);
    }

    public C4810Yj1(@Nullable Throwable th, @Nullable String str) {
        this.Z = th;
        this.Y0 = str;
    }

    @Override // o.AbstractC8922q71
    @NotNull
    public AbstractC8922q71 b0() {
        return this;
    }
}
